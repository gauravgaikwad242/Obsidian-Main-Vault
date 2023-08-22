
- [GITHUB LINK](https://github.com/gauravgaikwad242/rabbitmq-producer-consumer-basic)
-  ### PRODUCER
1. application properties

```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest

#these may be not standard properties OPTIONAL
springboot.rabbitmq.queue=BasicQueue
springboot.rabbitmq.exchange=Test
springboot.rabbitmq.routingkey=TestKey
```

2. DEPENDENCIES
```xml
<!--For rabbit mq-->
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
        </dependency>
<!--For message conversion-->
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20190722</version>
        </dependency>
```

3. CONFIGURATION
	Main configuration required are
    - queue
    - exchange
    - their binding
    - messageconverter
    - rabbitmqtemplate
```java
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    //queue
    //exchange
    //their binding
    //messageconverter
    //rabbitmqtemplate
    @Bean
    Queue basicQueue(){
        return new Queue("basicQueue",false);
    }
    @Bean
    DirectExchange exchange(){
        return new DirectExchange("globalExchange");
    }
    @Bean
    Binding queueBinding(Queue basicQueue, DirectExchange exchange){
        return BindingBuilder.bind(basicQueue).to(exchange).with("basicRoutingKey");
    }
    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
    public AmqpTemplate rabbiTemplate(ConnectionFactory connectionFactory){
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
}
```

4. AMQPTEMPLATE - SENDER
```java
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;
  
@Service
public class RabbitMQSender {
    private final AmqpTemplate amqpTemplate;
    public RabbitMQSender(
        AmqpTemplate amqpTemplate
    ){
        this.amqpTemplate = amqpTemplate;
    }
    public boolean sendMessage(String message){
        try {
            this.amqpTemplate.convertAndSend("globalExchange","basicRoutingKey",message);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
```

5. MESSAGE SENDING LOGIC (THIS WILL BE CUSTOM)
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.producer.rabbitmq.RabbitMQSender;


@RestController
@RequestMapping("rabbitmq")
public class RabbitMQController {
  
    @Autowired
    private RabbitMQSender rabbitMQSender;
  
    @GetMapping("/send")
    public String sendMessage(
        @RequestParam(name = "message",required = true) String message
    ){
        System.out.println("new message received"+message);
        boolean status = this.rabbitMQSender.sendMessage(message);
        if(status){
            return "success";
        }else{
            return "failed";
        }
    }
}
```

- ### CONSUMER (different application)

1. DEPENDECY SAME AS ABOVE
2. PROPERTIES SAME AS ABOVE
3. BEANS SAME AS ABOVE (CONFIGURATION)
4. LISTENING LOGIC
```java
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListner {
    @RabbitListener(queues = "basicQueue")
    public void listenMessage(String message){
       System.out.println("*********************************message received*********************");
        System.out.println(message);
      System.out.println("**********************************************************************");
    }
}
```

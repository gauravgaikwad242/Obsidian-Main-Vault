
- [official docs]([AMQP 0-9-1 Model Explained — RabbitMQ](https://www.rabbitmq.com/tutorials/amqp-concepts.html))

1. **Producer**:
   - A producer is a component or application that sends messages to a messaging system (like RabbitMQ). It generates messages and pushes them into the messaging system for further processing and delivery to consumers.

2. **Exchange**:[[Exchanges]]
   - An exchange is a routing mechanism in RabbitMQ that determines how messages should be distributed to queues. It receives messages from producers and routes them to one or more queues based on routing rules defined by the exchange type. Common exchange types include "direct", "topic", "fanout", and "headers".

3. **Queue**:
   - A queue is a storage area within RabbitMQ where messages are stored until they are consumed by consumers. Consumers retrieve messages from queues and process them. Queues ensure that messages are processed in a first-in, first-out (FIFO) order.

4. **Consumer**:
   - A consumer is an application or component that retrieves and processes messages from queues. Consumers are responsible for reading messages from queues and performing the necessary actions based on the content of the messages.

5. **Routing Key**:
   - A routing key is a value attached to a message when it's sent by a producer. It's used by exchanges to determine which queues the message should be routed to. Different exchange types use routing keys in different ways. For example, in the "direct" exchange type, the routing key is compared with binding keys of queues to decide which queue(s) should receive the message.


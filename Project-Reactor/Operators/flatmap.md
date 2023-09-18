#todo 
- PARALLEL EXECUTION
- code and implementation with webclient api call

```java
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class WebClientExample {

    public static void main(String[] args) {
        WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");

        Flux<Integer> postIdFlux = Flux.just(1, 2, 3, 4, 5);

        postIdFlux
            .flatMap(postId -> {
                Mono<Post> postMono = webClient
                    .get()
                    .uri("/posts/{id}", postId)
                    .retrieve()
                    .bodyToMono(Post.class);

                return postMono;
            })
            .subscribe(
                post -> System.out.println("Received Post: " + post),
                throwable -> System.err.println("Error: " + throwable.getMessage()),
                () -> System.out.println("Completed")
            );
    }
}

```
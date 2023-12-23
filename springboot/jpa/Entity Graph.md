
```java 
@NamedEntityGraph(
  name = "post-entity-graph-with-comment-users",
  attributeNodes = {
    @NamedAttributeNode("subject"),
    @NamedAttributeNode("user"),
    @NamedAttributeNode(value = "comments", subgraph = "comments-subgraph"),
  },
  subgraphs = {
    @NamedSubgraph(
      name = "comments-subgraph",
      attributeNodes = {
        @NamedAttributeNode("user")
      }
    )
  }
)
@Entity
public class Post {

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();
    //...
}
```
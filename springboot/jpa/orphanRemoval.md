### orphanRemoval = true
to delete child entities

@OneToMany(
    cascade = CascadeType.ALL,
    mappedBy = "post",
    orphanRemoval = true)
private List<Comment> comments = new ArrayList<>();

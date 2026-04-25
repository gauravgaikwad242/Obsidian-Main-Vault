**CascadeType** options in JPA:

1. **`CascadeType.ALL`**
    
    - Applies all cascade operations: `PERSIST`, `MERGE`, `REMOVE`, `REFRESH`, `DETACH`.
        
2. **`CascadeType.PERSIST`**
    
    - When saving the parent entity, automatically saves the associated child entities.
    - **Important:** The `child.setParent(parent)` step is essential. If you only add the child to `parent.getChildren()` without setting `child.setParent(parent)`, the foreign key in the child may be `null`, depending on how your mapping is configured.

```java 
Parent parent = new Parent();
parent.setName("Parent 1");

Child child = new Child();
child.setName("Child 1");
child.setParent(parent);  // link child to parent

parent.getChildren().add(child);  // add child to parent's collection

parentRepository.save(parent);  // persist parent
```

        
3. **`CascadeType.MERGE`**
    
    - When updating the parent entity, automatically updates (merges) the associated child entities.
    - so if i update parent and then call child from parent object and modify it, with merge type if i save parent the changes to child are also saved

```java 
Parent parent = parentRepository.findById(1L).get();
parent.setName("New Parent Name");

// Modify child
parent.getChildren().get(0).setName("Updated Child Name");

parentRepository.save(parent); // Under the hood calls merge
```

        
4. **`CascadeType.REMOVE`**
    
    - When deleting the parent entity, automatically deletes the associated child entities.
        
5. **`CascadeType.REFRESH`**
    
    - Refreshes the state of the associated entities from the database when the parent is refreshed.
        
6. **`CascadeType.DETACH`**
    
    - When detaching the parent entity from the persistence context, the child entities are detached as well.
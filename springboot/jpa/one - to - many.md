# One-to-Many: User ↔ Address (JPA)  
  
## User.java (Inverse side)  
```java  
@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)  
private List<Address> addresses;
```

## Address.java (Owning side)

```java
@ManyToOne(fetch = FetchType.LAZY)  
@JoinColumn(name = "user_id", nullable = false)  
private User user;
```



## Notes

- **Owning side** → table with foreign key (`Address`)
    
- **Inverse side** → points to owning side using `mappedBy` (`User`)
    
- `mappedBy="user"` → refers to the `user` field in `Address`
    
- `cascade` & `orphanRemoval` can be used on the **inverse side** to propagate operations.

## 1. One-to-Many (User ↔ Address)

```
## 1. One-to-Many (User ↔ Address)

User (One)                         Address (Many)  
+---------+                        +---------+  
| id      |                        | id      |  
| name    |                        | city    |  
|---------|                        | user_id |  <-- FK to User (owner)  
| addresses| <--- mappedBy="user" |---------|  
+---------+                        +---------+  
  
Explanation:  
- Owner side: Address (has foreign key user_id)  
- Inverse side: User (mappedBy="user")  
- `@OneToMany(mappedBy="user")` on User  
- `@ManyToOne @JoinColumn(name="user_id")` on Address
```

```
Student (Owner)                     Course (Inverse)
+---------+                         +---------+
| id      |                         | id      |
| name    |                         | title   |
|---------|                         |---------|
| courses | ---> @ManyToMany        | students| ---> mappedBy="courses"
+---------+                         +---------+

Join Table: student_courses
+-----------+-----------+
| student_id| course_id |
+-----------+-----------+
| 1         | 101       |
| 1         | 102       |
| 2         | 101       |
+-----------+-----------+

Explanation:
- Owner side: Student (defines @JoinTable)
- Inverse side: Course (uses mappedBy="courses")
- Join table holds the relationship
- Only owner manages insert/update in join table
```

```java
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(
        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
        fetch = FetchType.LAZY
    )
    @JoinTable(
        name = "student_courses", // join table name
        joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"),
        uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "course_id"})
    )
    private Set<Course> courses;
}
```


```java 
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Student> students;
}
```
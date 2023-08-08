```
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Other attributes, getters, setters, etc.

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId // Maps the primary key of Employee to EmployeeDetails
    private EmployeeDetails details;

    // Constructors, getters, setters, etc.
}
@Entity
public class EmployeeDetails {
    @Id
    private Long id;

    private String address;

    // Other attributes, getters, setters, etc.

    @OneToOne
    @JoinColumn(name = "id")
    private Employee employee; // Child entity referencing Employee's primary key

    // Constructors, getters, setters, etc.
}

```
In this example, when you save an `Employee` entity along with its associated `EmployeeDetails`, the same primary key value (`id`) will be used for both entities, as specified by the `@MapsId` annotation

so if employee has id 1 then employeedetails also will have id 1

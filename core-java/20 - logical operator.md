
&& - logical and 
|| - logical or
! - logical not 

```java 
    void checkEligibility(int age) {
        System.out.println("checking the exam eligibility");
        if (!(age >= 21 || age <= 35)) {
            System.out.println("person is eligible for exam");
        } else {
            System.out.println("person is not eligible fo exam");
        }
    }
```

```java 
        int x = 7, y = 3;
        boolean isEqual = x == y;
        boolean isGreaterThan = x > y;
        boolean isLessThan = x < y;
        boolean isNotEqual = x != y;

        System.out.println("is equal" + isEqual);
        System.out.println("is greateThan" + isGreaterThan);
        System.out.println("is less than " + isLessThan);
        System.out.println("is not equal" + isNotEqual);

        boolean p = true, q = false;
        boolean logicalAnd = p && q;
        boolean logicalOr = p || q;
        boolean logicalNotp = !p;
        boolean logicalNotq = !q;

        System.out.println("logical and : " + logicalAnd);
        System.out.println("logical or : " + logicalOr);
        System.out.println("logical not of p: " + logicalNotp);
        System.out.println("logical not of q: " + logicalNotq);
```
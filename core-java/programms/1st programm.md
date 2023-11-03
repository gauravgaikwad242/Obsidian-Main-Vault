```java

public class Main {

    void meth1() {
        System.out.println("meth1 called");
        int a = 1;
        System.out.println(a);

        Main main = new Main();
        main.meth2();
    }
    
    void meth2() {
        System.out.println("meth2 called");
        int x = 99;
        System.out.println(x);
        
    }
    
    public static void main(String[] args) {
        System.out.println("START");
        System.out.println("JAVA IS AWESOME");

        Main main = new Main(); //creating object
        main.meth1(); //calling method

        System.out.println("END");
    }
}
```
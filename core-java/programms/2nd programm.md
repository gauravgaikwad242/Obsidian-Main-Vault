```java
public class A_2Intro {
    void meth1() {
        int x = 10;
        System.out.println("meth() called");
        System.out.println(x);
        System.out.println(x+90);
        System.out.println(10+90);

        A_2Intro obj = new A_2Intro();
        obj.meth2();

        System.out.println("x");
        System.out.println("x+90");
        System.out.println("x :"+x);
    }

    void meth2() {
        System.out.println("meth2() called");
        int x= 99;
        System.out.println(x);
        A_2Intro obj = new A_2Intro();
        obj.meth3();

        System.out.println(100-x);

    }
    void meth3(){
        System.out.println("Java is Awesome");
    }
    public static void main(String[] args) {
        System.out.println("Start");

        A_2Intro obj = new A_2Intro();
        obj.meth1();
        
        System.out.println("End");
    }
}

```
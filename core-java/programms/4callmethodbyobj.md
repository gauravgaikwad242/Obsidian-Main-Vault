```java
public class A8_callmethodbyobj {
    void meth1() {
        System.out.println("Hi");
    }
    void meth2() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A8_callmethodbyobj obj = new A8_callmethodbyobj();
        obj.meth1();
        obj.meth2();

        System.out.println("---------");

        new A8_callmethodbyobj().meth1();
        new A8_callmethodbyobj().meth2();
    }
}

```
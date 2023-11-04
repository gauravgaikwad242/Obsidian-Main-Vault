```java
public class A_3Intro {
    void meth1() {
        A_3Intro obj = new A_3Intro();
        obj.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(54 + a);
    }

    void meth2() {
        int a = 20;
        System.out.println(78 - a);
    }

    void meth3() {
        int a = 30;
        A_3Intro obj = new A_3Intro();
        System.out.println(89 + 1);
        obj.meth1();
        System.out.println(10 * a);

    }

    void meth4() {
        int a = 10;
        System.out.println(89);
        System.out.println(800 / a);
        System.out.println(44);

    }

    void meth5() {
        System.out.println(77);
        A_3Intro obj = new A_3Intro();
        obj.meth2();
        System.out.println(99);

    }

    public static void main(String[] args) {
        System.out.println("start");

        A_3Intro obj = new A_3Intro();
        obj.meth3();

        System.out.println("end");
    }
}

```
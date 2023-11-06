```java
public class A9_MethodReturn {
    int meth1() {
        System.out.println("hi");
        return 99;
    }

    public static void main(String[] args) {
        System.out.println("Java is Awesome");

        A9_MethodReturn obj = new A9_MethodReturn();
        int x = obj.meth1();
        System.out.println("meth1() is returning : "+x);
        System.out.println(x+1);
    }
}

```
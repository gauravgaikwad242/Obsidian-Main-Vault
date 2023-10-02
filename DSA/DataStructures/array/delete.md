- to delete at specific position
- we have to move all element from position to delete to last index one place to left and then set last element as 0.
```java
package array;

public class Delete {

    public static void delete(int[] arr, int position) {
        for (int i = position - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

    }

    public static void main(String[] args) {
        int[] intarray = new int[6];
        intarray[0] = 0;
        intarray[1] = 1;
        intarray[2] = 1;
        intarray[3] = 2;
        intarray[4] = 3;
        intarray[5] = 4;

        delete(intarray, 3);
        for (int integer : intarray) {
            System.out.println(integer);
        }

        /*
         * output
         * 0
         * 1
         * 2
         * 3
         * 4
         * 0
         */
    }
}

```
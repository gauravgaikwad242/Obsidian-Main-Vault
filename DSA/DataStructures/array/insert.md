- to insert at a position
- to do this we have to move all the elements on right of the position to one place to right 

- i.e. if we have to insert at position 3 ( i.e. index 2) we have to move from 3 to 4 and 4 to 5 and so on
```java
package array;

public class Insert {

    public static void insert(int[] arr, int position, int element) {
    //in this case loop will start at i =5, 4, till i = 3;
    //i.e. index 4>5, 3>4, 2>3 and then we can insert at index 2 as it will be blank 
        for (int i = arr.length - 1; i >= position; i--) {
        //moving to one position right 
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = element;
    }

    public static void main(String[] args) {
        int[] intarray = new int[6];
        intarray[0] = 0;
        intarray[1] = 1;
        intarray[2] = 3;
        intarray[3] = 4;
        intarray[4] = 5;
        insert(intarray, 3, 2);

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
         * 5
         */
    }
}
```
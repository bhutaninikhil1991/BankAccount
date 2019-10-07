import java.util.Arrays;

public class IntArray {
    private Integer[] arr;
    public Integer[] newarr;

    public IntArray() {
        arr = new Integer[10];
    }

    public IntArray(int intialCapacity) {
        arr = new Integer[intialCapacity];
    }

    private void add(int x) {
        boolean IsArrayFull = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                IsArrayFull = false;
                break;
            }
        }

        if (IsArrayFull) {
            // create new array
            newarr = new Integer[arr.length + 1];
            // copy elements
            for (int i = 0; i < arr.length; i++)
                newarr[i] = arr[i];
            // assign new array to old array
            arr = newarr;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = x;
                break;
            }
        }
    }

    private void add(int index, int x) {
        if (index > arr.length - 1) {
            // create new array
            newarr = new Integer[index + 1];
            // copy elements
            for (int i = 0; i < arr.length; i++)
                newarr[i] = arr[i];
            // assign new array to old array
            arr = newarr;
            // assign the value to index
            arr[index] = x;
        } else if (index >= 0 && index < arr.length) {
            if (arr[index] == null)
                arr[index] = x;
            else {
                // create new array
                newarr = new Integer[arr.length + 1];
                // copy elements
                for (int i = 0; i < arr.length; i++)
                    newarr[i] = arr[i];
                // assign new array to old array
                arr = newarr;
                int temp;
                // move to next index position
                for (int i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i - 1];
                }

                // assign value to index
                arr[index] = x;
            }
        } else
            System.out.println("index is out of range");

    }

    private void set(int index, int x) {
        if (index > arr.length - 1) {
            // create new array
            newarr = new Integer[index];
            // copy elements
            for (int i = 0; i < arr.length; i++)
                newarr[i] = arr[i];
            // assign new array to old array
            arr = newarr;
            // assign the value to index
            arr[index] = x;
        } else if (index >= 0 && index < arr.length)
            arr[index] = x;
        else
            System.out.println("index is out of range");
    }

    private void delete(int index) {
        if (index >= 0 && index < arr.length) {
            for (int i = index; i < arr.length - 1; i++)
                arr[i] = arr[i + 1];
            // clear the last index
            arr[arr.length - 1] = null;
        } else
            System.out.println("index is out of range");
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;
        IntArray myArray = (IntArray) o;
        if (this.arr.length != myArray.arr.length)
            return false;
        int n = this.arr.length < myArray.arr.length ? this.arr.length : myArray.arr.length;
        for (int i = 0; i < n; i++) {
            if (this.arr[i] != myArray.arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        IntArray array = new IntArray();
        IntArray array1 = new IntArray(12);
        
        //Array
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(3, 12);
        array.add(12, 3);
        array.set(3, 3);
        array.delete(3);
        array.delete(0);
        array.set(11, 12);
        array.set(12, 13);
        
        //Array 1
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(9);
        array1.add(10);
        array1.add(11);
        array1.add(3);
        array1.add(12);
        array1.delete(3);
        array1.delete(0);
        array1.set(11, 12);
        array1.set(10, 13);
        
        System.out.println("Array : " + array.toString());
        System.out.println("Array 1: " + array1.toString());
        System.out.println("Are both the arrays equal? " + array.equals(array1));
    }
}
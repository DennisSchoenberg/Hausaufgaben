package hausaufgabe49;

public class Main {
    public static void main(String[] args) {
        try {
            // Case 1: Creating MyArray with a null array
            MyArray<String> myArray1 = new MyArray<>(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Case 2: Accessing an element at an invalid index
            MyArray<Integer> myArray2 = new MyArray<>(new Integer[]{1, 2, 3});
            int value = myArray2.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Case 3: Adding an element at an invalid index
            MyArray<Double> myArray3 = new MyArray<>(new Double[]{1.0, 2.0, 3.0});
            myArray3.add(10, 4.0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Demonstrating successful usage
        MyArray<Character> myArray4 = new MyArray<>(new Character[]{'a', 'b', 'c'});
        System.out.println("Original Array: " + myArray4);

        // Adding an element successfully
        myArray4.add('d');
        System.out.println("Array after adding 'd': " + myArray4);

        // Removing an element successfully
        myArray4.remove(1);
        System.out.println("Array after removing element at index 1: " + myArray4);
    }
}

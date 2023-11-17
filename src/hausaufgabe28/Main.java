package hausaufgabe28;

public class Main {
    public static void main(String[] args) {
        double[] arr = {4, 2, 7, 1, -5, 6};
        MyArray myArray = new MyArray(arr);

        myArray.set(myArray.indexOf(1), 10);
        myArray.add(myArray.indexOf(7), 123 );

        myArray.remove(myArray.indexOf(7));


        System.out.print(myArray);


    }
}

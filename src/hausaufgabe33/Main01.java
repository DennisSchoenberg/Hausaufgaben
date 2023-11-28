package hausaufgabe33;

public class Main01 {

    public static void flipSigns(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;

        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -4, 8, -3, -6};
        print(arr);
        flipSigns(arr);
        System.out.println();
        print(arr);

    }
}

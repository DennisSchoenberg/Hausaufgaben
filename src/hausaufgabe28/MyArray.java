package hausaufgabe28;

public class MyArray {
    private double[] array;

    public MyArray() {
        array = new double[0];

    }

    public MyArray(double[] array) {
        this.array = new double[array.length];
        copy(array, this.array);
    }

    private void copy(double[] src, double[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];

        }
    }

    public double get(int index) {
        return array[index];


    }

    public void set(int index, double value)  {
        if (index < 0 || index >= array.length) {
            return;
        }
        array[index] = value;

    }

    public int size() {
        return array.length;
    }

    public int indexOf(double val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void add(int index, double val) {
        if (index < 0 || index > array.length) {
            return;

        }
        double[] newArray = new double[array.length + 1];
        copy(array, newArray);
        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];

        }
        newArray[index] = val;
        array = newArray;
    }

    public void remove(int index) {
        if (index < 0 || index > array.length) {
            return;
        }
        double[] newArray = new double[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        array = newArray;
    }
    // отсюда начинается выпонение домашнего задания.

    public boolean contains(double val) {
        return indexOf(val) != -1;
    }

    public boolean isEmpty() {
        return array.length == 0;

    }

    public void add(double val) {
        add(array.length, val);
    }

    public void removeLast() {
        remove(array.length - 1);
    }

    public void remove(double val) {
        remove(indexOf(val));
    }

    public void replace(double oldVal , double newVal) {
        set(indexOf(oldVal), newVal);
    }

    public String toString() {
        String res = "[ ";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
            if (i != array.length - 1) {
                res += ", ";
            }

        }
        res += " ]";
        return res;
    }
}

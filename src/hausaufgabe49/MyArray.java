package hausaufgabe49;

import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {
    private Object[] array;

    // конструктор по умолчанию
    public MyArray() {
        array = new Object[0];
    }

    // конструктор с параметрами
    /* Добавлена проверка на null входного массива, и если передается null,
     то выбрасывается IllegalArgumentException (исключение с сообщением об ошибке).
     */
    public MyArray(E[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        this.array = new Object[array.length];
        copy(array, this.array);
    }

    private void copy(Object[] src, Object[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    /* Добавлена проверка на допустимый диапазон индекса,
     и если индекс выходит за границы, выбрасывается IndexOutOfBoundsException (исключение с сообщением об ошибке).
     */
    public E get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (E) array[index];
    }

    /* Добавлена проверка на допустимый диапазон индекса,
     и если индекс выходит за границы, выбрасывается IndexOutOfBoundsException (исключение с сообщением об ошибке).
     */
    public void set(int index, E value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    public int indexOf(E val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    /* Добавлена проверка на допустимый диапазон индекса,
     и если индекс выходит за границы, выбрасывается IndexOutOfBoundsException (исключение с сообщением об ошибке).
     */
    public void add(int index, E val) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Object[] newArray = new Object[array.length + 1];
        copy(array, newArray);

        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }

        newArray[index] = val;
        array = newArray;
    }

    public void add(E val) {
        add(array.length, val);
    }

    /* Добавлена проверка на допустимый диапазон индекса,
    и если индекс выходит за границы, выбрасывается IndexOutOfBoundsException (исключение с сообщением об ошибке).
     */
    public void remove(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Object[] newArray = new Object[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }

        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[ ");
        for (int i = 0; i < array.length; i++) {
            res.append(array[i]);
            if (i != array.length - 1) {
                res.append(", ");
            }
        }
        res.append(" ]");
        return res.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(array);
    }

    private static class MyIterator<E> implements Iterator<E> {
        private Object[] array;
        private int currentIndex;

        public MyIterator(Object[] array) {
            currentIndex = 0;
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }


        /* Обновлен метод next(),
         чтобы выбрасывало java.util.NoSuchElementException, если больше нет элементов.
         */

        @Override public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            currentIndex++;
            return (E) array[currentIndex - 1];
        }
    }
}

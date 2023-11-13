package hausaufgabe25.task2;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.checkInk();
        pen.write("Hello, i am writing with this pen");
        pen.checkInk();
        pen.write("And now im gonna refill it");
        pen.checkInk();
        pen.write("Напишем ещё немного белиберды");
        pen.checkInk();
        pen.refill();
        System.out.println("А теперь заполним чернила.");
        pen.checkInk();
    }
}

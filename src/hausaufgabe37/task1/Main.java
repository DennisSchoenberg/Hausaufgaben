package hausaufgabe37.task1;

public class Main {

    public static void  printInfo(Tv tv) {
        System.out.println("you are watching channel " + tv.getCurrentChannel());
    }
    public static void main(String[] args) {
        Tv tv = new Tv (4.5, 46);
        Remote remote = new Remote(4.5);
        printInfo(tv);
        remote.swichChannelForward(tv);
        printInfo(tv);
        remote.swichChannelBackward(tv);
        printInfo(tv);
        remote.setChannelManually(tv,25);
        printInfo(tv);
        remote.setChannelManually(tv, -1);

    }
}

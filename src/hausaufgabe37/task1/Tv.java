package hausaufgabe37.task1;

public class Tv {
    private double frequency;
    private int currentChannel;

    public Tv(double frequency, int currentChannel) {
        this.frequency = frequency;
        this.currentChannel = currentChannel;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;

    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 1 && currentChannel <= 99) {
            this.currentChannel = currentChannel;

        } else {
            System.out.println("channel dont exist");
        }
    }
}


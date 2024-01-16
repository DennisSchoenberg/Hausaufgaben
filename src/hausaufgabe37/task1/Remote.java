package hausaufgabe37.task1;

public class Remote {
    private final double frequency;

    public Remote(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
    public void swichChannelForward(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }
    public void swichChannelBackward(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }
    public void setChannelManually(Tv tv, int channel) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(channel);
        }
    }
}


public class Timer {
    private ClockHand second;
    private ClockHand seconds;

    public Timer() {
        this.second = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.second.advance();

        if (this.second.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + second;
    }
}

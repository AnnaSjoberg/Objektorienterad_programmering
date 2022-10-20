package sprint2.Uppg11;

public class VideoTape {
    private int totalTime;
    private int usedTime;
    private int remainingTime;

    public VideoTape(int totalTime, int usedTime) {
        this.totalTime = totalTime;
        this.usedTime = usedTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public int getRemainingTime() {
        return totalTime-usedTime;
    }
}

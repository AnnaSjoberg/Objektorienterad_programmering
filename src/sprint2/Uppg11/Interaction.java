package sprint2.Uppg11;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Interaction {
    private boolean test;
    private VideoTape videoTape;
    private TVProgram tvProgram;

    public Interaction(boolean test) {
        this.test = test;
    }

    public VideoTape getVideoTape() {
        return videoTape;
    }

    public TVProgram getTvProgram() {
        return tvProgram;
    }

    public void setInputForTVProgram(TVProgram tvProgram) {
        if (test) {
            this.tvProgram = tvProgram;
        } else {
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What time does the TV program start?");
                    LocalTime start = LocalTime.parse(scanner.nextLine());
                    System.out.println("What time does the TV program end?");
                    LocalTime end = LocalTime.parse(scanner.nextLine());
                    if (start.isBefore(end)) {
                        this.tvProgram = new TVProgram(start, end);
                        return;
                    } else {
                        System.out.println("Start and end must be on the same date.");
                    }
                } catch (DateTimeParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setInputForVideoTape(VideoTape videoTape) {
        if (test) {
            this.videoTape = videoTape;
        } else {
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What is the total length of the tape?");
                    int totalLength = scanner.nextInt();
                    System.out.println("How much of the tape is already in use?");
                    int usedTime = scanner.nextInt();

                    if (totalLength > usedTime && usedTime >= 0) {
                        this.videoTape = new VideoTape(totalLength, usedTime);
                        return;
                    } else {
                        System.out.println("Neither total length, used time or remaining time on tape can be less than zero");
                    }
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printMessage() {
        System.out.println(compileMessage());
    }

    protected String compileMessage() {
        if (videoTape.getRemainingTime() >= tvProgram.getDurationMinutes()){
            return "The program fits on tape";
        }else {
            return "The program does not fit on tape";
        }

    }
}

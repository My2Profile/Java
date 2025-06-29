package Ex5;

public class Time implements Comparable<Time> {
    private int hour, minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour)
            return this.hour - other.hour;
        return this.minute - other.minute;
    }
}
package Ex3;

public class Time {
    
    public int hour;
    public int minute;
    public int second;

    public Time(int hour, int minute, int second) {
        try {
            if (hour < 0 || hour > 23) {
                throw new IllegalArgumentException("Hour must be between 0 and 23.");
            }
            if (minute < 0 || minute > 59) {
                throw new IllegalArgumentException("Minute must be between 0 and 59.");
            }
            if (second < 0 || second > 59) {
                throw new IllegalArgumentException("Second must be between 0 and 59.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal(int hour, int minute, int second) {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard(int hour, int minute, int second) {
        String period = (hour < 12) ? "AM" : "PM";
        if (hour == 0) {
            hour = 12; // Midnight case
        } else if (hour > 12) {
            hour -= 12; // Convert to 12-hour format
        }
        return String.format("%02d:%02d:%02d %s", hour, minute, second, period);
    }

    public Time add(Time other) {
        int newHour = this.hour + other.hour;
        int newMinute = this.minute + other.minute;
        int newSecond = this.second + other.second;

        // Handle overflow
        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }
        if (newHour >= 24) {
            newHour -= 24;
        }

        return new Time ( newHour, newMinute, newSecond);
    }

}

package Ex3;

public class Test {

    public static void main(String[] args) {
        Time time1 = new Time(10, 30, 45);
        Time time2 = new Time(5, 45, 30);

        System.out.println("Time 1 (Universal): " + time1.toUniversal(time1.hour, time1.minute, time1.second));
        System.out.println("Time 1 (Standard): " + time1.toStandard(time1.hour, time1.minute, time1.second));

        System.out.println("Time 2 (Universal): " + time2.toUniversal(time2.hour, time2.minute, time2.second));
        System.out.println("Time 2 (Standard): " + time2.toStandard(time2.hour, time2.minute, time2.second));

        Time addedTime = time1.add(time2);
        System.out.println("Added Time (Universal): " + addedTime.toUniversal(addedTime.hour, addedTime.minute, addedTime.second));
        System.out.println("Added Time (Standard): " + addedTime.toStandard(addedTime.hour, addedTime.minute, addedTime.second));
    }
}
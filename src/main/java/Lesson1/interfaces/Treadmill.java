package Lesson1.interfaces;

public class Treadmill {
    private static int distance;


    public Treadmill(int distance) {
        this.distance = distance;
    }
    public static void printInfo() {
        System.out.println("Дистанция: "+distance);
    }

    public static void distanceRun(int nextInt) {
        System.out.println("Пробежал дистанцию в " + nextInt +" M ."+" Из - "+distance);
    }

}


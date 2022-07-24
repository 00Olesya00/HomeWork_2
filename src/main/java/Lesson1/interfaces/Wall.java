package Lesson1.interfaces;

public class Wall {
    public static int wall;


    public Wall(int wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "Robot {" + "Впереди стена " +
                wall + "m" + '}';
    }
    public static void printInfo() {
        System.out.println("В переди стена высотой: "+ wall);
    }
    public static void JumpWall( int nextInt) {
        if (nextInt > wall) {
            System.out.println("Перепрыгнул через стену!");
        } else {
            System.out.println("Прыгнул на высоту " + nextInt + " M ." + " Из - " + wall);
        }
    }

}

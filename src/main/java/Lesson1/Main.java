package Lesson1;


import Lesson1.interfaces.Treadmill;
import Lesson1.interfaces.Wall;

public class Main{

    public static void main(String[] args) {
        Robot robot = new Robot("Nano",200,20);

        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(5);
        Treadmill.printInfo();
        robot.printInfo();
        robot.toString();
        robot.RunStart();
        robot.RunDistance(robot.runDistance);
        Wall.printInfo();
        robot.jump();
        robot.Jump_Up(robot.jump_up);
        Нuman human = new Нuman(" Олег ", 100, 3);
        Treadmill.printInfo();
        human.printInfo();
        human.toString();
        human.RunStart();
        human.RunDistance(human.runDistance);
        Wall.printInfo();
        human.jump();
        human.Jump_Up(human.jump_up);

        Cat cat = new Cat(" Кот Васька ",110,5);
        Treadmill.printInfo();
        cat.printInfo();
        cat.toString();
        cat.RunStart();
        cat.RunDistance(human.runDistance);
        Wall.printInfo();
        cat.jump();
        cat.Jump_Up(cat.jump_up);


        Participants participants = new Participants("Nano",200,20);
        Participants participants2 = new Participants(" Олег ", 100, 3);
        Participants participants3 = new Participants(" Кот Васька ",110,5);
        Participants[] participants1 ={participants,participants2,participants3};


    }

}


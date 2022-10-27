
package Lesson_1;

import Lesson_1.interface1.Barrier;
import Lesson_1.interface1.Barrier.Distance;
import Lesson_1.interface1.Barrier.Jumping;
import Lesson_1.interface1.Members;

import static Lesson_1.interface1.Barrier.Jumping.height;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(" Робот Nano", 200, 20);
        Нuman human = new Нuman("Человек Олег ", 100, 3);
        Cat cat = new Cat("Человек Олег ", 100, 3);
        Wall wall = new Wall("Стена",5 );
        Treadmill treadmill = new Treadmill("Дистанция",150);
        Members[] members ={robot,cat,human} ;
        Barrier.Jumping[] jumpings = {robot,cat,human};
        Barrier.Distance[] distances ={robot,cat,human};
        Barrier[] barriers = {wall,treadmill};
        robot.printInfo();
        for(Barrier.Jumping jumping:jumpings){
            jumping.jumping();
        }
      //  doJump(robot);


    }
    public static void doJump (Jumping l){
        System.out.println("В переди стена высотой - " +height);
        l.jumping();
    }
//    public static void doDistance (Distance [] l) {
//        for (int i = 0; i < ; i++) {
//
//        }


//    }
    }


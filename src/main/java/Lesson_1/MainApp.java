
package Lesson_1;

import Lesson_1.interface1.Obstacles;
import Lesson_1.interface1.Player;

public class MainApp {
    public static void main(String[] args) {

        Obstacles[] obstacles = new Obstacles[4];
        obstacles[0] = new Treadmill(10);
        obstacles[1] = new Treadmill(60);
        obstacles[2] = new Wall(2);
        obstacles[3] = new Wall(3);


        Player[] player = new Player[3];
        player[0] = new Human("Aski", 500, 3);
        player[1] = new Robot("Vold M", 80, 1);
        player[2] = new Cat("Klod", 50, 2);


        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!obstacles[j].trial(player[i])) {
                    break;
                }

            }

        }
    }
}



package Lesson1;

import Lesson1.interfaces.Treadmill;
import Lesson1.interfaces.Wall;

import java.util.concurrent.ThreadLocalRandom;

public class Нuman {
    private String nickname;
    int runDistance;
    int jump_up;

    public Нuman(String nickname, int runDistance, int jump_up) {
        this.nickname = nickname;
        this.runDistance =runDistance;
        this.jump_up = jump_up;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void jump() {
        String jump = "Человек прыгает";
        System.out.println(jump);

    }

    public void Jump_Up(int wall) {
        jump_up= ThreadLocalRandom.current().nextInt(3);
        Wall.JumpWall(jump_up);
        if (jump_up<5){
            System.out.println("Не смог  преодалеть стену!");
        }

    }
    public void RunStart() {
        String run = "Человек  начинает бежать";
        System.out.println(run);
    }


    @Override
    public String toString() {
        return "Human {" +
                "Имя - " +'\''+ nickname + '\'' +
                ". Может пробежать - " + runDistance + " m. " +
                "Прыгает на высоту - " + jump_up + " m. "+
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void RunDistance(int distance) {
        runDistance = ThreadLocalRandom.current().nextInt(100);
        Treadmill.distanceRun(runDistance);
        if (runDistance<100){
            System.out.println("Не смог пробежать все растояние!");
        }


    }
}

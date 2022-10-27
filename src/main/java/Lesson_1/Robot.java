package Lesson_1;

import Lesson_1.interface1.Barrier;
import Lesson_1.interface1.Barrier.Distance;
import Lesson_1.interface1.Barrier.Jumping;
import Lesson_1.interface1.Members;

import java.util.concurrent.ThreadLocalRandom;

public class Robot implements Barrier.Jumping, Barrier.Distance, Members {
    private String nickname;
    private int runDistance;
    private int jump_up;

    public Robot(String nickname, int runDistance, int jump_up) {
        this.nickname = nickname;
        this.runDistance = runDistance;
        this.jump_up = jump_up;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJump_up() {
        return jump_up;
    }

    @Override
    public String toString() {
        return "Робот { " +
                "Имя - " + '\'' + nickname + '\'' +
                ". Может пробежать - " + runDistance + " m. " +
                "Прыгает на высоту - " + jump_up + " m. " +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void RunStart() {
        String run = " Робот начинает бежать";
        System.out.println(run);

    }

    @Override
    public void jumping() {
        jump_up = ThreadLocalRandom.current().nextInt(20);
        if (jump_up < 5) {
            System.out.println("Прыгнул на высоту: " + jump_up + " Не смог  преодалеть стену!");

        }
    }

    @Override
    public void Distance() {
        runDistance = ThreadLocalRandom.current().nextInt(200);
        if (runDistance < 150) {
            System.out.println("Пробежал: " + runDistance + " Недобежал!");

        }
    }
}
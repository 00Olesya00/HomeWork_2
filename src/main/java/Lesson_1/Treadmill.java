package Lesson_1;

import Lesson_1.interface1.Obstacles;
import Lesson_1.interface1.Player;

public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        if (distance > 0) {
            this.distance = distance;
        } else {
            System.out.println("�������� ���� ��������� ������� �������");
        }
    }

    @Override
    public int getLevel() {
        return distance;
    }

    @Override
    public boolean trial(Player player) {
        if (player.getEndurance() >= getLevel()) {
            player.run();
            return true;
        } else {
            System.out.println("������� " + player.toString() + "����� � ������� �������, �� ���� ���������� ���������� � " + distance + " ������ � �������� �� ��������");
        }
        return false;
    }
}

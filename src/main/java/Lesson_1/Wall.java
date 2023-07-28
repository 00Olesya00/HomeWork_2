package Lesson_1;


import Lesson_1.interface1.Obstacles;
import Lesson_1.interface1.Player;

public class Wall implements Obstacles {
        private int height;

        public Wall(int height) {
                if (height > 0) {
                        this.height = height;
                } else {
                        System.out.println("�������� ���� ������ ������� �������");
                }
        }

        public int getLevel() {
                return height;
        }

        @Override
        public boolean trial(Player player) {
                if (player.getAgility() >= getLevel()) {
                        player.jump();
                        return true;
                } else {
                        System.out.println("������� " + player.toString() + "�� ���� ���������� ����������� ����� � " + height + " ����� � �������� �� ��������");
                        return false;
                }
        }
}

package Lesson_2;

public class MainApp {

    public static void main(String[] args) {

        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * 4));
            }
        }

        array[3][2] = "������ �����";

        for (String[] anArr : array) {
            for (String anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

        try {
            SumArr4x4(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println("��������� ����� ������");
    }

    public static void SumArr4x4(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        if (!isQuadratic4x4(strArr)) {
            throw new MyArraySizeException("Error size array");
        }
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("��������� ������ ������: ���������� ������ [" + (i + 1) + "] ���������� ������� [" + (j + 1) + "]");
                }
            }
        }
        System.out.println(sum);
    }


    public static boolean isQuadratic4x4(String[][] array) {
        for (String[] arr : array) {
            if (array.length != 4 || array.length != arr.length) {
                return false;
            }
        }
        return true;
    }
}
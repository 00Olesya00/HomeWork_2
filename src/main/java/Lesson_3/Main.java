package Lesson_3;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arr = new String[20];

        for (int i = 0; i < arr.length; i++) {
            if (i < 6) {
                arr[i] = "cat";
            } else if (i < 15) {
                arr[i] = "dog";
            } else {
                arr[i] = "horse";
            }
        }

        Map<String, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int countValue = mapCount.getOrDefault(arr[i], 0);
            mapCount.put(arr[i], countValue + 1);
        }

        System.out.println(mapCount);

        PhoneBook phoneBook;
        phoneBook = new PhoneBook();

        phoneBook.add("Severov", "89163098588");
        phoneBook.add("Rusert", "89160978530");
        phoneBook.add("Ludanov", "8916900055");
        phoneBook.add("Iranova", "89163270942");
        phoneBook.add("Severov", "89167978587");
        phoneBook.add("Jok", "89166578512");
        phoneBook.add("Lego", "8916388506");

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("Severov"));
    }
}

package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("радуга");
        words.add("небо");
        words.add("земля");
        words.add("солнце");
        words.add("море");
        words.add("река");
        words.add("облака");
        words.add("дождь");
        words.add("небо");
        words.add("море");
        words.add("солнце");
        words.add("река");

        Set<String> uniqueWords = new HashSet<>(words);

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }

        System.out.println("Уникальные слова:");
        for (String word:uniqueWords){
            System.out.println(word);
        }

        System.out.println("Количество повторений:");
        for (String word:uniqueWords){
            System.out.println(word + " - " + wordCounts.get(word) + "раз(а)");
        }
        System.out.println();

        System.out.println("Телефонный справочник:");

        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Симонов","45-56-33");
        phoneBook.add("Дуров","76-34-67");
        phoneBook.add("Краёв","21-56-89");
        phoneBook.add("Киров","56-34-67");
        phoneBook.add("Киров","34-63-72");
        phoneBook.add("Пирогова","92-37-51");
        phoneBook.add("Краёв","470-34-05");

        List<String>simonovNumbers=phoneBook.get("Симонов");
        List<String>kirovNumbers=phoneBook.get("Киров");
        List<String>pirogovaNumbers=phoneBook.get("Пирогова");
        List<String>krayevNumbers=phoneBook.get("Краёв");
        List<String>ivanovNumbers=phoneBook.get("Иванов");

        System.out.println("Симонов:"+ simonovNumbers);
        System.out.println("Киров:"+ kirovNumbers);
        System.out.println("Пирогова:"+ pirogovaNumbers);
        System.out.println("Краёв:"+ krayevNumbers);
        System.out.println("Иванов:"+ ivanovNumbers);

    }
}







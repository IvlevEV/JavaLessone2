package Lessone3;

import java.util.*;

public class Test {

        public static void main(String[] args){

            Phonebook phone = new Phonebook();

            System.out.println("Наполняем справочник");
            phone.add("Иванов", "+79059216518");
            //phonebook.add("Иванов", "4541");
            //Exception in thread "main" java.lang.IllegalArgumentException: 4541не являеться номером телефона
            phone.add("Петров", "89059216518");
            phone.add("Сидоров", "+73818555555");
            phone.add("Иванов", "8999005512");


            System.out.println();

            System.out.println("Получаем номера");
            System.out.println("Иванов");
            System.out.println(phone.get("Иванов"));
            System.out.println("Петров");
            System.out.println(phone.get("Петров"));
            System.out.println("Сидоров");
            System.out.println(phone.get("Сидоров"));
            System.out.println();


            System.out.println("Случай отсутствия записи");
            System.out.println("Кузнецов");
            System.out.println(phone.get("Кузнецов"));
            System.out.println();

            System.out.println("Пробуем записать существующий номер");
            phone.add("Иванов", "89111212120");
            System.out.println("Иванов");
            System.out.println(phone.get("Иванов"));

            List<String> words = Arrays.asList(
                    "Mercedes", "BMW", "Audi", "Toyota", "Volkswagen",
                    "Opel", "Subaru", "Range Rover", "Toyota", "Volkswagen",
                    "BMW", "Audi", "Toyota", "Subaru", "Subaru",
                    "Audi", "Toyota", "Mitsubishi", "Mitsubishi", "Toyota"
            );

            Set<String> unique = new HashSet<String>(words);

            System.out.println("Первоначальный массив");
            System.out.println(words.toString());
            System.out.println("Уникальные слова");
            System.out.println(unique.toString());
            System.out.println("Cколько раз встречается каждое слово");
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(words, key));
            }

        }
}



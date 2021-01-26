package Lessone3;

import java.util.*;

public class Phonebook {

    private Map<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String name, String number){

        validate(number);



        if(book.containsKey(name)){
            List<String> numbers = book.get(name);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для имени %s", number, name));
            } else {
                System.out.println(String.format("Номер %s уже существует для имени %s", number, name));
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для имени %s", number, name));
        }
    }
    //[+7|8][0-9]{6,7,15}
// ^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{7,10}$

    private void validate(String number) {
        if (!number.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")){
            throw new IllegalArgumentException(number + "не являеться номером телефона");
        }
    }

    public List<String> get(String name){
        if(book.containsKey(name)){
            return book.get(name);
        } else {
            System.out.println(String.format("В справочнике нет записи для имени %s", name));
            return new ArrayList<>();
        }
    }
}
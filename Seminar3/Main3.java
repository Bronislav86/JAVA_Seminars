package Seminar3;

import java.util.ArrayList;
import java.util.List;

/*
 Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
 что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
 Напишите метод для заполнения данной структуры.
 */
public class Main3 {

    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        add_book(shopBook, "Сказка", "Золотой ключик");
        add_book(shopBook, "Роман", "Мастер и Маргарита");
        add_book(shopBook, "Сказка", "Репка");
        add_book(shopBook, "Фентези", "Гарри Поттер");
        add_book(shopBook, "Роман", "Война и Мир");
        add_book(shopBook, "Фентези", "Ночной дозор");

        System.out.println(shopBook);

    }
    private static void add_book (List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> bookshelf = shopBook.get(i);
            if(bookshelf.get(0).equals(genre)){
                bookshelf.add(nameBook);
                return;
            }
        }
        List<String> newBookshelf = new ArrayList<>();
        newBookshelf.add(genre);
        newBookshelf.add(nameBook);
        shopBook.add(newBookshelf);
    }
}


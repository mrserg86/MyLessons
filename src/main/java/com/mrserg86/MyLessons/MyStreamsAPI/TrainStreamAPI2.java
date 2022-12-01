// Задача. Задано множество фамилий сотрудников.
// Разработать программу, которая отображает все фамилии, начинающиеся на букву 'J'.

package com.mrserg86.MyLessons.MyStreamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainStreamAPI2 {

    public static void findName()    {

        // 1. Организовать ввод фамилий с клавиатуры.
        //    Конец ввода - пустая строка ""
        Scanner scan = new Scanner(System.in);
        String surname;
        List<String> workers = new ArrayList<>();

        System.out.println("Введите фамилии:  ");
        while(true) {
            System.out.println("Фамилия:  ");
            surname = scan.nextLine();
            if(surname.equals("") ==true) {
                break;
            }
            workers.add(surname);
        }

        System.out.println("Список сотрудников:  " + workers);

    workers.stream().filter(str -> str.charAt(0)=='J').forEach(System.out::println);

    }
}

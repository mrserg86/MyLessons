//Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.

package com.mrserg86.MyLessons.MyStreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainStreamAPI3 {

    public static void sortStrings() {
        String[] strokes = {"abcd", "dcba", "fkj", "a", "b", "c", "x", "xy", "lplok", "dfgaesrgomb", "azbx", "zaxbcy"};
        List<String> list = new ArrayList<>(Arrays.asList(strokes));

        list.forEach(System.out::println);

        //в естественном порядке
        list.stream().sorted((str1,str2) -> str1.compareTo(str2)).forEach(System.out::println);

        //в порядке убывания
        list.stream().sorted((str1,str2) -> str2.compareTo(str1)).forEach(System.out::println);

    }

}

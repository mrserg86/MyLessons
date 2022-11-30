// Задача. Для любого набора случайно сгенерированных чисел нужно определить количество чётных.

package com.mrserg86.MyLessons.MyStreamsAPI;

import java.util.*;

public class TrainStreamAPI {

    public static void demoStream() {

        // 1. Создать поток данных из случайного массива чисел
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number;
        Random rnd = new Random();

        for(int i=0; i<10; i++) {
            number = rnd.nextInt() % 100;
            list.add(number);
        }

        // 2. Определить количество чётных чисел.
        int count = (int)(list.stream().filter((n) -> (n%2)==0).count());

    }

}
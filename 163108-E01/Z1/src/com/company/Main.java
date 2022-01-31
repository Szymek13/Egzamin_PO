package com.company;
import java.time.LocalTime;

public class Main {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab)
    {
        for (int i=0; i<tab.length-1; i++)
        {
            if (tab[i].compareTo(tab[i+1] > 0))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String [] tabStr = {"Abc", "Xyz", "Mno"};
        System.out.println(isSorted(tabStr));
        Integer [] tabInt = {23, 4, 19};
        System.out.println(isSorted(tabInt));
    }
}

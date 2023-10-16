package ru.vsu.cs.ukhin;

import ru.vsu.cs.ukhin.search.BinarySearch;
import ru.vsu.cs.ukhin.search.LinearSearch;
import ru.vsu.cs.ukhin.search.Search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Search> searches = new ArrayList<>();
        searches.add(new LinearSearch());
        searches.add(new BinarySearch());


        int[] searchArray = new int[10000];
        for(int i = 0; i < searchArray.length; i++){
            searchArray[i] = i;
        }
        for(Search s:searches){
            for(int i = 0; i < searchArray.length; i++){
                s.search(searchArray, i);
            }
            System.out.println(s.getName()
                    +"; MinTime="+ s.getMinTime()
                    +"; AvgTime="+s.getAvgTime()
                    +"; MaxTime="+s.getMaxTime());
        }
    }
}
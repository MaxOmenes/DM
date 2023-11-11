package ru.vsu.cs.ukhin;

import ru.vsu.cs.ukhin.models.BinarySearch;
import ru.vsu.cs.ukhin.models.InterpolationSearch;
import ru.vsu.cs.ukhin.models.LinearSearch;
import ru.vsu.cs.ukhin.models.Search;
import ru.vsu.cs.ukhin.tools.FileReader;
import ru.vsu.cs.ukhin.tools.FileWriter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Search> searches = new ArrayList<>();
        searches.add(new LinearSearch());
        searches.add(new BinarySearch());
        searches.add(new InterpolationSearch());
//        FileWriter f = new FileWriter(args[0]);
//        for (int i = 0; i < 10000; i++) {
//            f.print(i+", ");
//        }

        int[] searchArray = new FileReader(args[0]).read();
        FileWriter f = new FileWriter(args[1]);
        for(int i = 0; i < searchArray.length; i++){
            searchArray[i] = i;
        }
        for(Search s:searches){
            for(int i = 0; i < searchArray.length; i++){
                s.search(searchArray, i);
            }
            f.println(s.getName()
                    +"; MinTime="+ s.getMinTime()
                    +"; AvgTime="+s.getAvgTime()
                    +"; MaxTime="+s.getMaxTime());
        }
        f.close();
    }
}
package ru.vsu.cs.ukhin.search;

public interface Search {

    int search(int[] searchArray, int a);
    double getMinTime();
    double getMaxTime();
    double getAvgTime();
    String getName();
}

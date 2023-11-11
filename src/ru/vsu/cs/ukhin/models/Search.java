package ru.vsu.cs.ukhin.models;

public interface Search {

    int search(int[] searchArray, int a);
    double getMinTime();
    double getMaxTime();
    double getAvgTime();
    String getName();
}

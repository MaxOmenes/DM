package ru.vsu.cs.ukhin.search;

public class LinearSearch implements Search {

    private double minTime;
    private double maxTime;
    private double allTimes;
    private int count;
    private final String name = "Linear";

    @Override
    public int search(int[] searchArray, int a) {
        int i = 0;
        boolean found = false;
        for(int n:searchArray){
            i++;
            if(n == a){
                found = true;
                break;
            }
        }
        setTime(i);
        return i;
    }

    @Override
    public double getMinTime() {
        return minTime;
    }

    @Override
    public double getMaxTime() {
        return maxTime;
    }

    @Override
    public double getAvgTime() {
        return allTimes/count;
    }

    @Override
    public String getName() {
        return name;
    }

    private void setTime(int a){
        if (a < minTime){
            minTime = a;
        }else if(a > maxTime){
            maxTime = a;
        }

        count++;
        allTimes +=a;
    }
}

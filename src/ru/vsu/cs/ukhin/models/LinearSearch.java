package ru.vsu.cs.ukhin.models;

public class LinearSearch implements Search {

    private double minTime = Double.MAX_VALUE;
    private double maxTime = Double.MIN_VALUE;
    private double allTimes;
    private int count;
    private final String name = "Linear";

    @Override
    public int search(int[] searchArray, int a) {
        int index = -1;
        int i = 0;
        for(int j = 0; j < searchArray.length; j++){
            i++;
            if(searchArray[j] == a){
                index = j;
                break;
            }
        }
        setTime(i);
        return index;
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

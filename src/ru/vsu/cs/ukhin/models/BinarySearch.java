package ru.vsu.cs.ukhin.models;

public class BinarySearch implements Search{
    private double minTime = Double.MAX_VALUE;
    private double maxTime = Double.MIN_VALUE;
    private double allTimes;
    private int count;
    private final String name = "Binary";
    @Override
    public int search(int[] searchArray, int a) {
        int index = -1;
        int i = 0;
        int leftEl = 0;
        int rightEl = searchArray.length - 1;
        int el;
        do{
            i++;
            el = leftEl+(rightEl - leftEl)/2;
            if (a == searchArray[el]){
                index = el;
                break;
            }
            else if(a < searchArray[el]){
                rightEl = el-1;
            }else if(a > searchArray[el]){
                leftEl = el+1;
            }
        }while (leftEl < rightEl);
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

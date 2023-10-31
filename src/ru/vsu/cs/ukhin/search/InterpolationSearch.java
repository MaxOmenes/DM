package ru.vsu.cs.ukhin.search;

public class InterpolationSearch implements Search{
    private double minTime = Double.MAX_VALUE;
    private double maxTime = Double.MIN_VALUE;
    private double allTimes;
    private int count;
    private final String name = "Interpolation";
    @Override
    public int search(int[] searchArray, int a) {
        int highEnd = (searchArray.length - 1);
        int lowEnd = 0;

        int i = 0;

        while (a >= searchArray[lowEnd] && a <= searchArray[highEnd] && lowEnd <= highEnd) {
            i++;
            int probe
                    = lowEnd + (highEnd - lowEnd) * (a - searchArray[lowEnd]) / (searchArray[highEnd] - searchArray[lowEnd]);

            if (highEnd == lowEnd) {
                if (searchArray[lowEnd] == a) {
                    setTime(i);
                    return lowEnd;
                } else {
                    setTime(i);
                    return -1;
                }
            }

            if (searchArray[probe] == a) {
                setTime(i);
                return probe;
            }

            if (searchArray[probe] < a) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        setTime(i);
        return -1;
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

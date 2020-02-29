package DataTypes;

public class OnlineStatistics {
    private int sum;
    private double average;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private int numberOfValues;

    public void addValue(int value) {
        numberOfValues++;
        sum += value;
        max = Math.max(max, value);
        min = Math.min(min, value);
    }

    public double getAverage() {
        average = ((double) sum) / numberOfValues;
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getSum() {
        return sum;
    }



    public void reset() {
        sum = 0;
        numberOfValues = 0;
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        average = 0;
    }


}

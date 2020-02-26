package DataTypes;

public class OnlineStatistics {
    int sum;
    double average;
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    int values;

    public double getAverage() {
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

    public void addValue(int value) {

    }


}

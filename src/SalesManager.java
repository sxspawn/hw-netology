public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int trunkAvg() {
        int min = min();
        int max = max();
        int cnt = 0;
        int sum = 0;
        for (int sale : sales) {
            if (min < sale && sale < max) {
                sum += sale;
                cnt++;
            }
        }
        return cnt == 0 ? -1 : sum / cnt;
    }
}
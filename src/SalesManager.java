public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long trunkAvg() {
        long min = min();
        long max = max();
        long cnt = 0;
        long sum = 0;
        for (long sale : sales) {
            if (min < sale && sale < max) {
                sum += sale;
                cnt++;
            }
        }
        return cnt == 0 ? -1 : sum / cnt;
    }
}
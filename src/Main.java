
public class Main {
    public static void main(String[] args) {
        long[] sales = {40, 3, 16, 98, 16, 3, 98};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Обрезанное среднее количество продаж: " + salesManager.trunkAvg());
    }
}

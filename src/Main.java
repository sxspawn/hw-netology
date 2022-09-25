public class Main {
    public static void main(String[] args) {
        int[] sales = {46, 93, 169, 92, 154};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Обрезанное среднее количество продаж: " + salesManager.trunkAvg());
    }
}

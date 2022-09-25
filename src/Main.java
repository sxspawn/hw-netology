public class Main {
    public static void main(String[] args) {
        long[] sales = {46, 93, 169, 92, 154};
        SalesManager salesManager = new SalesManager(sales);
        long res = salesManager.max();
        System.out.println("Максимальное количество продаж: " + res);
    }
}

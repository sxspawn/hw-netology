public class Main {
    public static void main(String[] args) {
        int[] sales = {46, 93, 169, 92, 154};
        SalesManager salesManager = new SalesManager(sales);
        int res = salesManager.max();
        System.out.println("Максимальное количество продаж: " + res);
    }
}

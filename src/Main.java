public class Main {
    public static void main(String[] args) {
        SalesManager stats = new SalesManager(new long[]{10, 20, 15, -10, 5});
        System.out.println("Максимальная продажа: " + stats.max());
    }
} 
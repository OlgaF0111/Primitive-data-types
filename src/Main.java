public class Main {
    public static void main(String[] args) {

        int cost = 50_000; //стоимость билета
        int bonus = 20; //стоимость 1 бонусной мили
        int miles = cost / bonus; //количество бонусных милей
        System.out.println("Количество бонусных милей" + miles);
    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float w = 70.0F; // Вес в килограммах
        float h = 170.0F; // Рост в см
        float bmi = service.calculate((int) w, (int) h);

        System.out.println("Ваш индекс тела равен " + bmi);

    }
}
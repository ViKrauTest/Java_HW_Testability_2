public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 68.4;           //Вес указываем в кг
        double growth = 1.72;           //Рост указываем в м
        double bmi = service.calculate(weight, growth);
        String result = String.format("%.2f",bmi);
        System.out.println("Индекс массы тела:" + result);
    }
}

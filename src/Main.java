public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.74;
        double weight = 76;
        double index = service.calculate(growth, weight);
        String result = String.format("%.2f", index);
        System.out.println("Индекс массы тела " + result);

    }
}
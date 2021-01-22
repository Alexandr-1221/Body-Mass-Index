public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(77, 1.80);
        System.out.println(BMI);
    }
}

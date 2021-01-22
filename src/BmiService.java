public class BmiService {
    public double calculate (int weight, double high) {
        double BMI = weight / (high * high);
        return BMI;
    }
}

public class Calculator<T extends Number> {
    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Square of 5: " + intCalc.square(5));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Square of 3.2: " + doubleCalc.square(3.2));
    }
}

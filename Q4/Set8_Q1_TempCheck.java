public class Set8_Q1_TempCheck {
    static void checkTemperature(int temp) {
        if (temp < 0 || temp > 100) {
            throw new IllegalArgumentException("Temperature out of range");
        }
    }

    public static void main(String[] args) {
        try {
            checkTemperature(105); // change this value to test
            System.out.println("Temperature is valid");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

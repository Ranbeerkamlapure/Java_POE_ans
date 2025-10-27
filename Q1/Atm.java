import java.util.Scanner;

class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}

class Atm{
    public void validatePIN(String pin) throws InvalidPINException {
        if (pin.length() != 4 || !pin.matches("\\d{4}")) {
            throw new InvalidPINException("PIN must be exactly 4 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine();

        ATMMachine atm = new ATMMachine();
        try {
            atm.validatePIN(pin);
            System.out.println("PIN accepted.");
        } catch (InvalidPINException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

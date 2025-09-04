import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in Indian Rupees (INR): ");
        double amountInRupees = scanner.nextDouble();

        System.out.print("Convert to (USD, EUR, CNY, THB, PHP): ");
        String convertTo = scanner.next().toUpperCase();

        double conversionRate = 0;

        if (convertTo.equals("USD")) {
            conversionRate = 0.012;
        } else if (convertTo.equals("EUR")) {
            conversionRate = 0.011;
        } else if (convertTo.equals("CNY")) {
            conversionRate = 0.088;
        } else if (convertTo.equals("THB")) {
            conversionRate = 0.40;
        } else if (convertTo.equals("PHP")) {
            conversionRate = 0.63;
        } else {
            System.out.println("Invalid currency");
            scanner.close();
            return;
        }

        double convertedAmount = amountInRupees * conversionRate;
        System.out.println(amountInRupees + " INR = " + convertedAmount + " " + convertTo);

        scanner.close();
    }
}

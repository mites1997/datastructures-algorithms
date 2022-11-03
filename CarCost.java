import java.util.Scanner;

public class CarCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select car model");
        String carName = scanner.nextLine();
        double carCost = findCost(carName);
        if (carCost == -1) {
            throw new RuntimeException("Invalid Car selected");
        }
        System.out.println("Do you need insurance?");
        String insuranceNeeded = scanner.nextLine();
        System.out.println("Do you need additional accessories?");
        String additionalAccessories = scanner.nextLine();
        System.out.println("Enter Car discount");
        String discount = scanner.next();
        calculateCost(carCost, insuranceNeeded, additionalAccessories, discount);


    }

    private static void calculateCost(double carCost, String insuranceNeeded, String additionalAccessories, String discount) {

        double discountAmount = 0;


        if (insuranceNeeded == "yes" || additionalAccessories == "yes") {

            if (discount.contains("%")) {
                discountAmount = (2 / 100) * carCost;
            } else {
                discountAmount = Double.valueOf(discount);
            }

        }
        if (insuranceNeeded == "no" && additionalAccessories == "no") {
            System.out.println("Additional features has to be selected");
            discountAmount = 0;
        }

        if (discountAmount > 30000) {
            throw new RuntimeException("Max discount applied");
        }


        double rtoTax = 113990;
        double tcsCharges = 11000;
        double insurance = 47300;
        double additionalCost = 15000;
        double totalCost = carCost + rtoTax + tcsCharges + insurance + additionalCost - discountAmount;
        System.out.println("total car cost is " + totalCost);
        System.out.println("total car cost is " + discountAmount);
    }

    private static double findCost(String carName) {
        double cost = 0;
        switch (carName) {
            case "Polo Trendline":
                cost = 870000;
                break;
            case "Polo Highline":
                cost = 1009000;
                break;
            case "Virtus Trendline":
                cost = 1105000;
                break;
            case "Virtus Highline":
                cost = 1308000;
                break;
            case "Taigun Trendline":
                cost = 1489000;
                break;
            case "Taigun Highline":
                cost = 1542000;
                break;
            case "Taigun Topline":
                cost = 1771000;
                break;
            default:
                cost = -1;
                break;

        }
        return cost;
    }
}



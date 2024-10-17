import java.util.Scanner;

public class SmartFashionBillingSystem {
    public static void main(String[] args) {
        
	System.out.println("   _____                      _     ______        _     _             ");
        System.out.println("  / ____|                    | |   |  ____|      | |   (_)            ");
        System.out.println(" | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __  ");
        System.out.println("  \\___ \\| '_ ` _ \\ / _` | '__| __| |  __/ _` / __| '_ \\| |/ _ \\| '_ \\ ");
        System.out.println("  ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |");
        System.out.println(" |_____/|_| |_| |_\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|");
        System.out.println("                                                                      ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Date: ");
        String date = scanner.nextLine();

		System.out.println();

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();

        System.out.println("______________________________________________________________________________________");

        System.out.println("  _______     _____ _     _      _       ");
        System.out.println(" |__   __|   / ____| |   (_)    | |      ");
        System.out.println("    | |_____| (___ | |__  _ _ __| |_ ___ ");
        System.out.println("    | |______\\___ \\| '_ \\| | '__| __/ __|");
        System.out.println("    | |      ____) | | | | | |  | |\\__ \\");
        System.out.println("    |_|     |_____/|_| |_|_|_|   \\__|___/");
        System.out.println("                                        ");

        System.out.print("Number of T-Shirts: ");
        int quantityTS = Integer.parseInt(scanner.nextLine());
        System.out.println();
	System.out.print("Unit Price of T-Shirt: ");
        double unitPriceTS = Double.parseDouble(scanner.nextLine());
        System.out.println();
	System.out.print("Discount Rate for T-Shirts (%): ");
        double discountRateTS = Double.parseDouble(scanner.nextLine());
        System.out.println();
	double finalAmountTS = calculateFinalAmount(quantityTS, unitPriceTS, discountRateTS);

	System.out.println("----------------------------------------------------------");
	System.out.println("| Description  |     QTY    |   Unit Price  |   Amount   |");
        System.out.println("|--------------|------------|---------------|------------|");
        System.out.printf("| %-12s | %10d | %13.2f | %10.2f |\n", "T-Shirt", quantityTS, unitPriceTS, finalAmountTS);
        System.out.println("----------------------------------------------------------");

	System.out.println("______________________________________________________________________________________");

        System.out.println("  _______                                ");
        System.out.println(" |__   __|                               ");
        System.out.println("   | |_ __ ___  _   _ ___  ___ _ __ ___ ");
        System.out.println("   | | '__/ _ \\| | | / __|/ _ \\ '__/ __|");
        System.out.println("   | | | | (_) | |_| \\__ \\  __/ |  \\__ \\");
        System.out.println("   |_|_|  \\___/ \\__,_|___/\\___|_|  |___/");
        System.out.println("                                        ");

	System.out.print("Number of Trousers: ");
        int quantityTrousers = Integer.parseInt(scanner.nextLine());
	System.out.println();
        System.out.print("Unit Price of Trousers: ");
        double unitPriceTrousers = Double.parseDouble(scanner.nextLine());
	System.out.println();
        System.out.print("Discount Rate for Trousers (%): ");
        double discountRateTrousers = Double.parseDouble(scanner.nextLine());
        System.out.println();
	double finalAmountTrousers = calculateFinalAmount(quantityTrousers, unitPriceTrousers, discountRateTrousers);

	System.out.println("----------------------------------------------------------");
	System.out.println("| Description  |     QTY    |   Unit Price  |   Amount   |");
        System.out.println("|--------------|------------|---------------|------------|");
        System.out.printf("| %-12s | %10d | %13.2f | %10.2f |\n", "Trousers", quantityTrousers, unitPriceTrousers, finalAmountTrousers);
        System.out.println("----------------------------------------------------------");

	System.out.println("______________________________________________________________________________________");

	System.out.println("   _____ _     _      _       ");
        System.out.println("  / ____| |   (_)    | |      ");
        System.out.println(" | (___ | |__  _ _ __| |_ ___ ");
        System.out.println("  \\___ \\| '_ \\| | '__| __/ __|");
        System.out.println("  ____) | | | | | |  | |\\__ \\");
        System.out.println(" |_____/|_| |_|_|_|   \\__|___/");
        System.out.println("                              ");
	
	System.out.print("Number of Shirts: ");
        int quantityShirts = Integer.parseInt(scanner.nextLine());
	System.out.println();
        System.out.print("Unit Price of Shirts: ");
        double unitPriceShirts = Double.parseDouble(scanner.nextLine());
	System.out.println();
        System.out.print("Discount Rate for Shirts (%): ");
        double discountRateShirts = Double.parseDouble(scanner.nextLine());
	System.out.println();
        double finalAmountShirts = calculateFinalAmount(quantityShirts, unitPriceShirts, discountRateShirts);

	System.out.println("----------------------------------------------------------");
	System.out.println("| Description  |     QTY    |   Unit Price  |   Amount   |");
        System.out.println("|--------------|------------|---------------|------------|");
        System.out.printf("| %-12s | %10d | %13.2f | %10.2f |\n", "Shirts", quantityShirts, unitPriceShirts, finalAmountShirts);
        System.out.println("----------------------------------------------------------");

	System.out.println("______________________________________________________________________________________");

	System.out.println("   _____ _                _       ");
        System.out.println("  / ____| |              | |      ");
        System.out.println(" | (___ | |__   ___  _ __| |_ ___ ");
        System.out.println("  \\___ \\| '_ \\ / _ \\| '__| __/ __|");
        System.out.println("  ____) | | | | (_) | |  | |\\__ \\");
        System.out.println(" |_____/|_| |_|\\___/|_|   \\__|___/");
        System.out.println("                                  ");
	
	System.out.print("Number of Shorts: ");
        int quantityShorts = Integer.parseInt(scanner.nextLine());
	System.out.println();
        System.out.print("Unit Price of Shorts: ");
        double unitPriceShorts = Double.parseDouble(scanner.nextLine());
	System.out.println();
        System.out.print("Discount Rate for Shorts (%): ");
        double discountRateShorts = Double.parseDouble(scanner.nextLine());
	System.out.println();
        double finalAmountShorts = calculateFinalAmount(quantityShorts, unitPriceShorts, discountRateShorts);

	System.out.println("----------------------------------------------------------");
	System.out.println("| Description  |     QTY    |   Unit Price  |   Amount   |");
        System.out.println("|--------------|------------|---------------|------------|");
        System.out.printf("| %-12s | %10d | %13.2f | %10.2f |\n", "Shorts", quantityShorts, unitPriceShorts, finalAmountShorts);
        System.out.println("----------------------------------------------------------");

	System.out.println("______________________________________________________________________________________");

	double totalAmount = finalAmountTS + finalAmountTrousers + finalAmountShirts + finalAmountShorts;

	System.out.println("  ____  _ _ _        _____                                            ");
        System.out.println(" |  _ \\(_) | |      / ____|                                           ");
        System.out.println(" | |_) |_| | |_____| (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _ ");
        System.out.println(" |  _ <| | | |______\\___ \\| | | | '_ ` _ \\| '_ ` _ \\ / _` | '__| | | |");
        System.out.println(" | |_) | | | |      ____) | |_| | | | | | | | | | | | (_| | |  | |_| |");
        System.out.println(" |____/|_|_|_|     |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |");
        System.out.println("                                                                __/ |");
        System.out.println("                                                               |___/ ");
        
        System.out.println("Customer: " + name);
        System.out.println("Date: " + date);

        System.out.println(" _________________________________________________________");
        System.out.println(" | Description |     QTY    |   Unit Price  |   Amount   |");
        System.out.println(" |-------------|------------|---------------|------------|");
        System.out.printf(" | %-12s | %10d | %13.2f | %10.2f |\n", "T-Shirt", quantityTS, unitPriceTS, finalAmountTS);
        System.out.printf(" | %-12s | %10d | %13.2f | %10.2f |\n", "Trousers", quantityTrousers, unitPriceTrousers, finalAmountTrousers);
        System.out.printf(" | %-12s | %10d | %13.2f | %10.2f |\n", "Shirts", quantityShirts, unitPriceShirts, finalAmountShirts);
        System.out.printf(" | %-12s | %10d | %13.2f | %10.2f |\n", "Shorts", quantityShorts, unitPriceShorts, finalAmountShorts);
        System.out.println("----------------------------------------------------------");
        System.out.printf(" | %-12s |            |               | %10.2f |\n", "Total", totalAmount);
        System.out.println("----------------------------------------------------------");
    }

	public static double calculateFinalAmount(int quantity, double unitPrice, double discountRate) {
        	double totalPrice = quantity * unitPrice;
        	double discountAmount = totalPrice * (discountRate / 100);
        	return totalPrice - discountAmount;
    	}

}

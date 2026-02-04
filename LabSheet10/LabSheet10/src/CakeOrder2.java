import java.util.Scanner;

public class CakeOrder2 extends Bakery{
    public String selectFlavor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Chocolate\n" +
                "Press 2 for Vanilla\n" + "Press 3 for Strawberry\n" +
                "Press 4 for Lemon \n" + "Press 5 for Red Velvet");

        while (true) {
            System.out.print("Enter a flavor number : ");
            int input = scanner.nextInt();
            if (input == 1) {
                return "Chocolate";
            } else if (input == 2) {
                return "Vanilla";
            } else if (input == 3) {
                return "StrawBerry";
            } else if (input == 4) {
                return "Lemon";
            } else if (input == 5) {
                return "Red Velvet";
            }
        }
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        CakeOrder2 myOrder = new CakeOrder2();


        System.out.println("Press 1 to order Birthday cake");
        System.out.println("Press 2 to order Cup cake");
        System.out.print("Enter an option: ");
        String chose = scanner.nextLine();

        if (chose.equals("1")){
            String flavor = myOrder.selectFlavor();
            System.out.print("Enter a message: ");
            String message = scanner.nextLine();
            System.out.print("How many pounds: ");
            double pound = scanner.nextDouble();

            BirthdayCake bdCake = new BirthdayCake(message, pound, flavor, 350.0);
            System.out.println("\n" + bdCake);

        } else if (chose.equals("2")) {
            String flavor = myOrder.selectFlavor();
            System.out.print("How many pieces: ");
            int pieces = scanner.nextInt();

            CupCake cupCake = new CupCake(pieces,flavor,70);
            System.out.println("\n" +cupCake);

        } else{
            System.out.println("\nWrong option!! Try again!!");
        }
    }
}

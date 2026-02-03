import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birth Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);

        System.out.println(order1);

        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor : ");
        String flavor_cupcake = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece,flavor,65);

        System.out.println(order2);

        System.out.println("Chocobanana's Details:");
        System.out.print("Enter a flavor : ");
        String flavor_chocobanana = scanner.next();
        System.out.print("How many stick: ");
        int stick = scanner.nextInt();

        Chocobanana order3 = new Chocobanana(stick,0,flavor);

        System.out.println(order3);

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice()));


    }
}

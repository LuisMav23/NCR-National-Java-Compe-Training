import java.util.Scanner;

public class currencyConverter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("**********************\n");
        System.out.print("  CURRENCY CONVERTER  \n");
        System.out.print("**********************\n");
        System.out.print("(1) Philippine Peso\n");
        System.out.print("(2) Japanese Yen\n");
        System.out.print("(3) Euro\n");
        var amount = 0.0;
        do{
            System.out.print("Enter an amount in USD: ");
            amount = sc.nextDouble();
            if (amount < 0.0)System.out.println("Invalid amount, please try again.");
        }while(amount < 0.0);
        var option = 0;
        do{
            System.out.print("Enter quote currency: ");
            option = sc.nextInt();
            if (option > 3 || option < 1)System.out.println("Invalid choice, please try again.");
        }while(option > 3 || option < 1);
        switch(option){
            case 1: System.out.print("\nInput amount in PHP: " + (amount * 55.25));
            break;
            case 2: System.out.print("\nInput amount in JYP: " + (amount * 132.58));
            break;
            case 3: System.out.print("\nInput amount in EURO: " + (amount * 0.94));
            break;
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class TipCac {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("""
                <<<<< WELCOME TO REGNOS FOOD SERVICE >>>>>
                   <<< What would you like to order? >>>
                We have:            # Price #
                  < Fried rice >    < 1500 >
                  < Plantain >      < 800 >
                  < Chicken >       < 3500 >
                  < Chips >         < 1000 >
                  < Beef >          < 2000 >
                  < Hot dog >       < 2800 >
                  < Gelato >        < 1500 >
                  < cruffin >       < 800 >
                  < Spaghetti >     < 1200 >
                  < chicken and chips >     < 5500 >
                
                """);

        double VAT = 17.50;

        ArrayList<String> item = new ArrayList<>();
        ArrayList <Integer>  quantity = new ArrayList<>();
        ArrayList <Double>  price = new ArrayList<>();


        System.out.println("Please place your order: ");
        String userInput1 = scanner.nextLine();
        item.add(userInput1);

        System.out.println("how much per unit: ");
        double userInput3 = scanner.nextInt();
        price.add(userInput3);

        System.out.println("how many? : ");
        int userInput2 = scanner.nextInt();
        quantity.add(userInput2);

        System.out.println("Add more item? ");
        String userInput4 = scanner.next();

        while (!userInput4.equals("yes") && !userInput4.equals("no")){
            System.err.println("invalid response!!!");
            System.out.println("Add more item? ");
            userInput4 = scanner.next();
        }

        while (!userInput4.equals("no")){
            System.out.println("Please place your order: ");
            item.add(scanner.next());

            System.out.println("how much per unit: ");
            userInput3 = scanner.nextInt();
            price.add(userInput3);

            System.out.println("how many pieces: ");
            userInput2 = scanner.nextInt();
            quantity.add(userInput2);

            System.out.println("Add more item? ");
            userInput4 = scanner.next();
            while (!userInput4.equals("yes") && !userInput4.equals("no")){
                System.err.println("invalid response!!!");
                System.out.println("Add more item? ");
                userInput4 = scanner.next();
            }
        }

        System.out.println("what is your name: ");
        String userInput5 = scanner.next();
        double discount = 5 ;
        System.out.println();
        System.out.println(  );
        TipMachine tipMachine = new TipMachine("REGNOS FOOD STORE");
        tipMachine.displayInput(userInput5, item, quantity, price, discount, VAT);
        System.out.println();
        System.out.println(" how much did the customer give to you? ");
        double userPay = scanner.nextDouble();
        tipMachine.displayReceipt(userInput5, item, quantity, price, discount, VAT, userPay);
    }

}








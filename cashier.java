import java.util.Scanner;
public class cashier {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        double keyboard = 49.99;
        double mouse = 19.99;
        double monitor = 99.99;

        System.out.println("\nES Companies Portal - Cashier App 2");
        System.out.println("====================================");

        System.out.println("1. Keyboard - $49.99 \n2. Mouse - $19.99 \n3. Monitor - $99.99 \n4. Exit");
        System.out.println("Choose :");
        int itemNumber = scn.nextInt();
 

        System.out.println("Input quantity [1..20] :");
        int quantity = scn.nextInt();

        if (quantity>20) {
            System.out.println("Out of stock!");
            System.out.println("\nThanks for using this application!");
            System.exit(0);
        }

        double money = 0;
        double total = 0;
        System.out.println("ES Companies Portal - Cashier App 2\n=======================================");

        switch(itemNumber){
            case 1:
            System.out.println("Item's name : Keyboard");
            System.out.println("Price: $49.99");
            System.out.println("Quantity :" +quantity); 
            System.out.println("");
            total = keyboard*quantity;
            System.out.println("Total:" +total);
            System.out.print("Input your money [min"+total+"]:");
            money = scn.nextDouble();

            if(money<total){
                System.out.println("Not enough money");
            }
            else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : $" +(money-total));
            }
            System.out.println("Thanks for using this application!");
                break;

            case 2 :
            System.out.println("Item's name : mouse");
            System.out.println("Price: $19.99");
            System.out.println("Quantity :" +quantity);
            System.out.println("");
            total =mouse*quantity;
            System.out.println("Total : $" +total);
            System.out.print("Input your money [min"+total+"]");
            money = scn.nextDouble();
            if(money<total){
                System.out.println("Not enough money");
            }
            else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : $" +(money-total));
            }
            System.out.println("Thanks for using this application");
                break;

            case 3:
            System.out.println("Item's name : monitor");
            System.out.println("Price: $99.99");
            System.out.println("Quantity :" +quantity);
            System.out.println("");
            total =monitor*quantity;
            System.out.println("Total : $" +total);
            System.out.print("Input your money [min"+total+"]");
            money = scn.nextDouble();
            if(money<total){
                System.out.println("Not enough money");
            }
            else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : $" +(money-total));
            }
            System.out.println("Thanks for using this application");
                break;
                
            case 4:
            System.out.println("4. Exit");
            break;
            default:
            break;
        }
    }

}

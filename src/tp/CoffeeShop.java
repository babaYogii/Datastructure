package tp;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {

     int Totalbill=coffeeMachine();

        System.out.println("Your bill is "+ Totalbill +" Thank you for visiting ...");


    }




    static int coffeeMachine(){
        int totalbill=0;
        Scanner sc = new Scanner(System.in);

        int orders;

        do{

        while(true){
            System.out.println("Do you want to order coffee ");
            System.out.println("1)Yes");
            System.out.println("2)No");
            int type=sc.nextInt();
            switch (type){
                case 1:
                {
                    System.out.println("1) Espresso ");
                    System.out.println("2) Cappuccino ");
                    System.out.println("3) Latte ");
                    System.out.println("Choose which coffee you want to order");
                    int a=sc.nextInt();
                    switch (a){
                        case 1:
                        {
                            totalbill+=CofExpresso();
                            break;
                        }
                        case 2:
                        {
                            totalbill+=CofCappuccino();
                            break;
                        }
                        case 3:
                            totalbill+=CoffeeLatte();
                            break;
                    }


                    break;
                }

                case 2:
                    System.out.println("Thank you for visiting ..");
                  break;
                default:
                    System.out.println("Please Enter valid choice between 1 and 2 \nVisit again");
            }

             break;
        }

            System.out.println("Please select 1 if you want to buy more ...");
            System.out.println("1)YES");
            System.out.println("2)No");
            orders=sc.nextInt();

        }while(orders==1);


        return totalbill;
    }



    static int CofExpresso(){
        int bill=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Milk");
        System.out.println("2) Cream");
        System.out.println("3) Syrup");
        System.out.println("4) Milk with cream");
        System.out.println("5) Milk with Syrup");
        System.out.println("6) Syrup with Cream");
        System.out.println("7) Milk , cream and Syrup");

        System.out.println("Choose your Espresso coffee order : ");
        int a=sc.nextInt();
        System.out.println("Please enter the quantity of coffee");
        int quant=sc.nextInt();



        switch(a) {
            case 1:
                bill=60*quant;
                break;
            case 2:
                bill=75*quant;
                break;
            case 3:
                bill=100*quant;
                break;
            case 4:
                bill=(60+75)*quant;
                break;
            case 5:
                bill=(60+100)*quant;
               break;
            case 6:
                bill=(100+75)*quant;
                break;
            case 7:
                bill=(60+75+100)*quant;
                break;
            default:
                System.out.println("Please select a coffee number ");
        }




        return bill;
    }

    static int CofCappuccino(){
        int bill=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("1) Milk");
        System.out.println("2) Cream");
        System.out.println("3) Syrup");
        System.out.println("4) Milk with cream");
        System.out.println("5) Milk with Syrup");
        System.out.println("6) Syrup with Cream");
        System.out.println("7) Milk , cream and Syrup");


        System.out.println("Choose you Cappuccino coffee order : ");

        int type=sc.nextInt();
        System.out.println("Please enter the number of coffee you want");
        int quant=sc.nextInt();


        switch(type){
            case 1:
                bill=(80)*quant;
                break;
            case 2:
                bill=(90)*quant;
                break;
            case 3:
                bill=(125)*quant;
                break;
            case 4:
                bill=(80+90)*quant;
                break;
            case 5:
                bill=(80+125)*quant;
                break;
            case 6:
                bill=(125+90)*quant;
                break;
            case 7:
                bill=(80+90+125)*quant;
                break;
            default:
                System.out.println("Please select a proper coffee");

        }


        return bill;
    }

    static int CoffeeLatte(){
        int bill=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("1) Milk");
        System.out.println("2) Cream");
        System.out.println("3) Syrup");
        System.out.println("4) Milk with cream");
        System.out.println("5) Milk with Syrup");
        System.out.println("6) Syrup with Cream");
        System.out.println("7) Milk , cream and Syrup");


        System.out.println("Choose you Cappuccino coffee order : ");

        int type=sc.nextInt();
        System.out.println("Please enter the number of coffee you want");
        int quant=sc.nextInt();


        switch(type) {
            case 1:
                bill = (100) * quant;
                break;
            case 2:
                bill = (125) * quant;
                break;
            case 3:
                bill = (150) * quant;
                break;
            case 4:
                bill = (225) * quant;
                break;
            case 5:
                bill = (100+150) * quant;
                break;
            case 6:
                bill = (125+150) * quant;
                break;
            case 7:
                bill = (100+125+150) * quant;
                break;
            default:
                System.out.println("Please select a proper coffee");
        }

                return bill;

    }


}

package Exercise_6_e;

import java.text.DecimalFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //method1();
        GetInput user1=new GetInput();
        double result=user1.calculateValue(user1.getOne(),
                user1.getTwo(),
                user1.getFive(),
                user1.getTen(),
                user1.getTwenty(),
                user1.getFifty());
        DecimalFormat df=new DecimalFormat("€ ###0.0#");
        System.out.println(df.format(result/100));
    }




//    private static void method1() {
//        System.out.println("How many do you have coins");
//        Scanner scan=new Scanner(System.in);
//        String count= scan.nextLine();
//        int s=Integer.parseInt(count);
//        String coins[] = new String[s];
//        for (int i = 0; i <s ; i++) {
//            System.out.println("How many coins do you have: "+i+1);
//            coins[i]= scan.nextLine();
//        }
//
//
//        Coin newCalculation=new Coin();
//        double result=newCalculation.calculateValue("1","2","3");
//        System.out.println(result);
//    }


}
package Exercise_6_e;

import java.util.Scanner;

public class GetInput extends Coin{
    public static final int MAX=6;
    private String one;
    private String two;
    private String five;
    private String ten;
    private String twenty;
    private String fifty;

    public GetInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many do you have one coins:");
        setOne(scan.nextLine());
        System.out.println("How many do you have two coins:");
        setTwo(scan.nextLine());
        System.out.println("How many do you have five coins:");
        setFive(scan.nextLine());
        System.out.println("How many do you have ten coins:");
        setTen(scan.nextLine());
        System.out.println("How many do you have twenty coins:");
        setTwenty(scan.nextLine());
        System.out.println("How many do you have fifty coins:");
        setFifty(scan.nextLine());
        scan.close();
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTwenty() {
        return twenty;
    }

    public void setTwenty(String twenty) {
        this.twenty = twenty;
    }

    public String getFifty() {
        return fifty;
    }

    public void setFifty(String fifty) {
        this.fifty = fifty;
    }
}

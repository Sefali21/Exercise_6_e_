package Exercise_6_e;

public class Coin {
    public static final String CURRENCY="EURO";
    private String value;

    public Coin(){
        value="0";
    }
    public void setValue(String value){ this.value=value;}
    public String getValue(){return value;}

    public double calculateValue(String... values){
        double result=0d;
        for (var c:values ) {
            double d1=Double.parseDouble(c);
            result+=d1;
        }
        return result;
    }
    public double calculateValue(String one, String two, String five, String ten, String twenty, String fifty){
        double result=0d;
        double d1=Double.parseDouble(one);
        result+=d1;
        double d2=Double.parseDouble(two);
        result+=(d2*2);
        double d5=Double.parseDouble(five);
        result+=(d5*5);
        double d10=Double.parseDouble(ten);
        result+=(d10*10);
        double d20=Double.parseDouble(twenty);
        result+=(d20*20);
        double d50=Double.parseDouble(fifty);
        result+=(d50*50);
        return result;
    }

}

import java.util.*;
import java.text.DecimalFormat;

public class Currency_Converter {
    public static void main(String[] args) {
        double rupee,dollar,pound,euro,KWD,yen,yuan;
        int code;

        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to Aravind's Currency Converter***\nEnter the Currency Code you want to convert:");

        System.out.println("1.Rupee\n2.Dollar\n3.Pound\n4.Euro\n5.Kuwaiti Dinar\n6.Japanese Yen\n7.Chinese yuan");
        code=sc.nextInt();
        System.out.println();

       switch(code){
        case 1 : System.out.println("Enter the amount in rupees :");
                 rupee=sc.nextDouble();

                 System.out.println();
                 dollar=rupee/82.54;
                 System.out.println(rupee+" Rupees = "+f.format(dollar)+" Dollors");

                 System.out.println();
                 pound=rupee/93.31;
                 System.out.println(rupee+" Rupees = "+f.format(pound)+" Pounds");

                 System.out.println();
                 euro=rupee/81.37;
                 System.out.println(rupee+" Rupees = "+f.format(euro)+" Euros");

                 System.out.println();
                 KWD=rupee/ 266.15;
                 System.out.println(rupee+" Rupees = "+f.format(KWD)+" Kuwaiti Dinars");

                 System.out.println();
                 yen=rupee/1.79;
                 System.out.println(rupee+" Rupees = "+f.format(yen)+" Japanese Yens");

                 System.out.println();
                 yuan=rupee/0.088;
                 System.out.println(rupee+" Rupees = "+f.format(yuan)+" Chinese yuans");

                 break;
        
        case 2 : System.out.println("Enter the amount in Dollar :");
                dollar=sc.nextDouble();
                
                System.out.println();
                rupee=dollar*82.54;
                System.out.println(dollar+" Dollars = "+f.format(rupee)+" Rupees");

                System.out.println();
                pound=dollar*0.88;
                System.out.println(dollar+" Dollars = "+f.format(pound)+" Pounds");

                System.out.println();
                euro=dollar*1.01;
                System.out.println(dollar+" Dollars = "+f.format(euro)+" Euros");

                System.out.println();
                KWD=dollar*0.31;
                System.out.println(dollar+" Dollars = "+f.format(KWD)+" Kuwaiti Dinars");

                System.out.println();
                yen=dollar*147.69;
                System.out.println(dollar+" Dollars = "+f.format(yen)+" Japanese Yens");

                System.out.println();
                yuan=dollar*7.24;
                System.out.println(dollar+" Dollars = "+f.format(yuan)+" Chinese yuans");

                break;

        case 3 : System.out.println("Enter the amount in Pound :");
                 pound=sc.nextDouble();

                 System.out.println();
                 rupee=pound*93.31;
                 System.out.println(pound+" Pound = "+f.format(rupee)+" Rupees");

                 System.out.println();
                 dollar=pound*1.13;
                 System.out.println(pound+" Pound = "+f.format(dollar)+" Dollars");

                System.out.println();
                 euro=pound*1.15;
                 System.out.println(pound+" Pound = "+f.format(euro)+" Euros");

                 System.out.println();
                 KWD=pound*0.35;
                 System.out.println(pound+" Pound = "+f.format(KWD)+" Kuwaiti Dinars");

                 System.out.println();
                 yen=pound*166.96;
                 System.out.println(pound+" Pound = "+f.format(yen)+" Japanese Yens");

                 System.out.println();
                 yuan=pound*8.19;
                 System.out.println(pound+" Pound = "+f.format(yuan)+" Chinese yuans");

                 break;

        case 4 : System.out.println("Enter the amount in Euro :");
                 euro=sc.nextDouble();

                 System.out.println();
                 rupee=euro*81.37;
                 System.out.println(euro+" Euros = "+f.format(rupee)+" Rupees" );

                 System.out.println();
                 dollar=euro*0.99;
                 System.out.println(euro+" Euros = "+f.format(dollar)+" Dollars");

                 System.out.println();
                 pound=euro*0.87;
                 System.out.println(euro+" Euros = "+f.format(pound)+" Pounds");

                 System.out.println();
                 KWD=euro*0.31;
                 System.out.println(euro+" Euros = "+f.format(KWD)+" Kuwaiti Dinars");

                 System.out.println();
                 yen=euro*145.62;
                 System.out.println(euro+" Euros = "+f.format(yen)+" Japanes Yens");

                 System.out.println();
                 yuan=euro*7.14;
                 System.out.println(euro+" Euros = "+f.format(yuan)+" Chinese Yuans");

                 break;

        case 5 : System.out.println("Enter the amount in Kuwaiti Dinar : ");
                KWD=sc.nextDouble();

                System.out.println();
                rupee=KWD*266.15;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(rupee)+" Rupees");

                System.out.println();
                dollar=KWD*3.22;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(dollar)+" Dollars");

                System.out.println();
                pound=KWD*2.85;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(pound)+" Pounds");

                System.out.println();
                euro=KWD*3.27;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(euro)+" Euros");

                System.out.println();
                yen=KWD*0.0021;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(yen)+" Japanes Yens");

                System.out.println();
                yuan=KWD*0.043;
                System.out.println(KWD+" Kuwaiti Dinars = "+f.format(yuan)+" Chinese Yuans");

                break;

        case 6 : System.out.println("Enter the amount in Japanese Yen : ");
                 yen=sc.nextDouble();

                 System.out.println();
                 rupee=yen*0.56;
                 System.out.println(yen+" Japanese Yen = "+f.format(rupee)+" Rupees");

                 System.out.println();
                 dollar=yen*0.0068;
                 System.out.println(yen+" Japanese Yen = "+f.format(dollar)+" Dollars");

                 System.out.println();
                 pound=yen*0.0059;
                 System.out.println(yen+" Japanese Yen = "+f.format(pound)+" Pounds");

                 System.out.println();
                 euro=yen*0.0068;
                 System.out.println(yen+" Japanese Yen = "+f.format(euro)+" Euros");

                 System.out.println();
                 yuan=yen*0.049;
                 System.out.println(yen+" Japanese Yen = "+f.format(yuan)+" Chinese Yuans");

                 break;
                 
        case 7 : System.out.println("Enter the amount of Chinese Yuan:");
                 yuan=sc.nextDouble();

                 System.out.println();
                 rupee=yuan*11.29;
                 System.out.println(yuan+" Chinese Yuans = "+f.format(rupee)+" Rupees");

                 System.out.println();
                 dollar=yuan*0.14;
                 System.out.println(yuan+" Japanese Yen = "+f.format(dollar)+" Dollars");

                 System.out.println();
                 pound=yuan*0.12;
                 System.out.println(yuan+" Japanese Yen = "+f.format(pound)+" Pounds");

                 System.out.println();
                 euro=yuan*0.14;
                 System.out.println(yuan+" Japanese Yen = "+f.format(euro)+" Euros");

                 System.out.println();
                 yen=yuan*20.26;
                 System.out.println(yuan+" Japanese Yen = "+f.format(yen)+" Chinese Yuans");

        default : System.out.println("Enter the valid currency code to continue");

       }
    }
}

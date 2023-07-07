import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int year,zodyac;

       Scanner inp = new Scanner(System.in);

       System.out.println("dogum yilinizi giriniz :");
        year = inp.nextInt();
        zodyac=year%12;



        switch (zodyac){
            case 1:
                System.out.println("Your Chinese zodiac sign: Maymun");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign: Horoz");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign: Kopek ");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign: Domuz");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign: Fare");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign: Okuz");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign: Kaplan");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign: Tavsan ");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign: Ejderha");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign: Yilan");
                break;
            case 11:
                System.out.println(" Your Chinese zodisc sign: At");
                break;
            case 12:
                System.out.println("Your Chinese zodiac sign: Koyun");
                break;


        }
    }
}
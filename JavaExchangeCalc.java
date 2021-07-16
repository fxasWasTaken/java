import java.util.Scanner;

public class JavaExchangeCalc{
    public static void main(String args[]) {
        Scanner skan = new Scanner(System.in);
        double kurs1, kurs2, wynik;
        System.out.println("This is my first calculator in Java");
        System.out.println("This calculator was made to calculate exchange rates (please use , not . )");
        System.out.print("Please, insert value you want to exchange: ");
        kurs1 = skan.nextDouble();
        System.out.print("\n"+"Awesome, now please insert your exchange rate: ");
        kurs2 = skan.nextDouble();
        wynik = kurs1 * kurs2;
        System.out.print("\n"+"It is "+ wynik);
        
    }
}
}

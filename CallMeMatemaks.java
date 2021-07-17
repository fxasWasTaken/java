import java.util.Scanner;


public class  CallMeMatemaks{
    public static void main(String args[]) {
        System.out.println("Basic Math Operators\n");
        Scanner skan = new Scanner(System.in);
        int sound = 0, number1 = 0, number2 = 0, wynik, wiek, wzrost;
        System.out.println("How loud is your music?");
        sound = skan.nextInt();
        ++sound;
        System.out.println("Yoo, It's getting louder O_o");
        System.out.println(sound+"\n"+"Now please tell me a number: ");
        number1 = skan.nextInt();
        System.out.println("Now tell me a different number: ");
        number2 = skan.nextInt();
        wynik = number1 / number2;
        System.out.println("Inside first number we can fit "+wynik+" of second number");
        wynik = number1 % number2;
        if(wynik != 0){
            System.out.println("And we will be missing "+wynik);
            }else{
            System.out.println("That fits perfectly!\n");    
        }
        System.out.println("\nPlease tell me, how tall are you (in cm)? ");
        wzrost = skan.nextInt();
        if(wzrost>=150){
            System.out.println("May I ask you, how old are you?");
            wiek = skan.nextInt();
            if(wiek>=18){
                System.out.println("Ok we have two specific types of beer... if your height number is even you will get Sosna beer, but if it's not you will get Lesiak beer");
                wzrost=wzrost%2;
                switch (wzrost) {
                    case 0:
                        System.out.println("Your number is even... here's your Sosna beer!");
                        break;
                    case 1:
                        System.out.println("Your number is odd... here's your Lesiak beer!");
                        break;
                    default:
                        System.out.println("Emm, Sorry we ran out of your beer... but we can give you second one for free!");
                        break;
                }
            }
        }else{
            System.out.println("I cannot sell you this product\n");
        }
        int lastnumber, bonus = 0, zmienna96;
            System.out.println("Ok, give me last number but it has to be greater than 0 and lower than 10"+"\nWe will count starting from your number up to number 10");
            lastnumber = skan.nextInt();
        while(bonus==0){
            if (lastnumber > 0 && lastnumber < 10) {  
                bonus = 1;
            }else if(lastnumber <= 0 ){
                System.out.println("Your number is too low");
                lastnumber = skan.nextInt();
            }else if(lastnumber >= 10 ){
                System.out.println("Your number is too high");
                lastnumber = skan.nextInt();
            }
        }
        for (zmienna96=lastnumber; zmienna96<11;zmienna96+=1){
            System.out.println(zmienna96+"...");
        }
        
    }
}

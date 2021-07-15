import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.print("print ");
        System.out.println("println.");
        System.out.print("print ");
        System.out.println("println.");
        System.out.println("The difference between print and println is quiet simple, print will print everything in the same line...BUT, when you use println (ln=line) everything after this will be executed in the next line");
        double zmienna1;
        zmienna1 = 20.4;
        //This WHOLE line will be ignored
        System.out.println(zmienna1+" bonus"+'\n'+'\n');
        // "\n" creates new line
        System.out.println("java.util.Scanner was added... now give him the data to scan:");
        Scanner zmienna2 = new Scanner(System.in);
        System.out.println("You typed: "+ zmienna2.nextLine());
        //.nextLine forces the whole line to be executed after the previous one(without it, this println wouldn't be possible)
    }

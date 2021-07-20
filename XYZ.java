import java.util.Scanner;

public class XYZ {
    public void menu() {
        boolean loop2 = true;
        String y;
        Scanner skan2 = new Scanner(System.in);
        Lipa zmienna96 = new Lipa();

        String[] prizes = {"10PLN", "25PLN", "100PLN", "1000PLN!"};
        String[] options = {"prizes", "start", "leave"};
        System.out.println("\n\nRules are simple, if you will get more than three you win\n1. "+options[0]+"\n2. "+options[1]+"\n0. "+options[2]);
        
        while (loop2==true) {
            y = skan2.next();
            
            switch (y) {
                case "0":
                    System.out.println("See you next time");
                    loop2=false;
                    break;

                case "1":
                    System.out.println("if you got 3 "+prizes[0]+"\nif you got 4 "+prizes[1]+"\nif you got 5 "+prizes[2]+"\nif you got 6 "+prizes[3]);
                    System.out.println("\n1. "+options[0]+"\n2. "+options[1]+"\n0. "+options[2]);
                    break;
                
                case "2":
                    System.out.println("Good Luck, Have Fun!\n");
                    zmienna96.losowanie();
                    break;

                default:
                    System.out.println("\nSomething went wrong, try again"+"\nRemember to type a number!");
                    break;
            
                
            }
        }
        skan2.close();
    }
    
}
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Lipa{
    public void losowanie(){
        int[] zmienna1 = new int[6];
        int[] zmienna2 = new int[6];
        int los=0,p=0,los2=0,k=0,l=0,g=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your numbers one by one"+"\nAll of your numbers should be between 1 and 99");
        for (l = 0; l <6; l++){
                p=l+1;
                System.out.print("\n\n"+p+". ");
                los2 = scan.nextInt();
                if (los2 >= 100 || los2 <= 0) {
                    System.out.println("This number is unacceptable!\nTry again");
                    k++;
                }
                for (int x = 0; x < l; x++){
                    if (zmienna2[x] == los2){
                        System.out.println("This number was already used!\nTry again");
                        k++;
                    }
                }
                if(k==0){
                zmienna2[l] = los2;
                }else{
                    l = -1;
                    k = 0;
                    for(int m = 0; m <6; m++){
                        zmienna2[m]=0;
                    }
                }
        }
        scan.close();
        System.out.println("Your numbers are: ");
        for (int i = 0; i <6; i++){
            int j=i+1;
            System.out.println(j+". "+zmienna2[i]);
        }

        System.out.println("We will start the machine in");
        for (int i = 0; i < 5; i++) {
        System.out.println(5-i+".");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
        System.out.println("\n----------\n");
        for (int i = 0; i < 6; i++) {
            try {
                TimeUnit.SECONDS.sleep(2+i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            los = ThreadLocalRandom.current().nextInt(00, 99 + 1);
            for (int x = 0; x < i; x++){
                if (zmienna1[x] == los && los < 100){
                    los++;
                }
            }
            zmienna1[i] = los;
            p = i+1;
            System.out.println(p+". "+zmienna1[i]);
        }
        for(int i = 0; i<6; i++){
            System.out.println("\n\n");
            for(int u = 0; u<6; u++){
                if(zmienna1[i]==zmienna2[u]){
                    g++;
                }
            }
        }
        System.out.println("You hit "+g+" out of six");
    }
}
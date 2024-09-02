import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        boolean pertence = false;
        
        System.out.println("Digite um valor:");
        int numUsuario = scan.nextInt();

        if (numUsuario < 0) {
            System.out.println("O valor 0 não pertence à sequência");
        }
        
        int i = 0, j = 1;

        while (i <= numUsuario) {
            if (i == numUsuario) {
                System.out.println("O valor pertence à sequência");
                pertence = true;
                break;
            }

            int acum = i;
            i = j;
            j = i + acum;
        }

        if(pertence == false) 
        System.out.println("O valor não pertence à sequência");

        scan.close();
    }
}
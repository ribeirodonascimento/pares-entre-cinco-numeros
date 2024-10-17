import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Pares = 0;

       
        for (int i = 1; i <= 5; i++) {
            int valor = s.nextInt();

            if (valor % 2 == 0) {
                Pares++;
            }
        }

        System.out.println(Pares + " valores pares");
    }
}
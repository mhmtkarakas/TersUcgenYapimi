import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayisini giriniz: ");
        int numberDigits = input.nextInt();

        for(int i=numberDigits; i>=1; i--){
            for(int j = 1; j<=numberDigits-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Genap");
        }

        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("Kelipatan 3 & 5");
        }
    }   
}

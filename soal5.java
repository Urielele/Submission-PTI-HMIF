import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String nim = input.next();
        double ipk = input.nextDouble();

        System.out.println("Halo " + nama + " dengan NIM " + nim + ", IPK Anda saat ini adalah " + ipk);
    }
    
}

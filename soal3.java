import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata = input.next().toLowerCase();
        String reverseKata = new StringBuilder(kata).reverse().toString(); 
        
        if(kata.equals(reverseKata)){
            System.out.println("Palindrom nich");
        }else{
            System.out.println("Gak palindrom nich");
        }
    }
}

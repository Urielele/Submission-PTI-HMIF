import java.util.Scanner;

public class soal4 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];

        isi_arr(a);
        isi_arr(b);
        jumlah_arr(a, b);
    }

    public static void isi_arr(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void jumlah_arr(int[][]arrA, int[][]arrB){
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[0].length; j++) {
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            }
            System.out.println();
        }
    }
}

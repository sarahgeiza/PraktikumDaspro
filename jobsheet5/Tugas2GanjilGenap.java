import java.util.Scanner;
public class Tugas2GanjilGenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Angka :");
        int number = sc.nextInt();

        if (number %2 == 0) {
            System.out.print(number + " adalah angka genap");
        } else {
            System.out.print(number + " adalah angka ganjil");
        }
    }
}
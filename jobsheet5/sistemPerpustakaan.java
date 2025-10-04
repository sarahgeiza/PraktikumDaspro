import java.util.Scanner;
public class sistemPerpustakaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Mahasiswa membawa Kartu Mahasiswa? (True/False) ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa sudah Registrasi Online? (True/False) ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa == true || registrasiOnline == true) {
            System.out.println("Boleh Masuk");
            
        } else {
            System.out.println("Ditolak Masuk");
        }
    }
}

import java.util.Scanner;
public class aksesWIFIKampus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Jenis Pengguna (Mahasiswa/Dosen? )");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WIFI diberikan (dosen)");
        } else {
            if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.print("Masukkan jumlah SKS: ");
                int jumlahSKS = sc.nextInt();

                if (jumlahSKS >= 12) {
                    System.out.println("Akses WIFI diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            } else {
                System.out.println("Akses ditolak");
            }
        }

    }
}
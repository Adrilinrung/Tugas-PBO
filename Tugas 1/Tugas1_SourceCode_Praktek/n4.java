//13020220145,Adri Linrung, Kamis 29 Feb 2024
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a;
        Scanner masukan; // Objek Scanner untuk membaca input

        // Pesan untuk meminta pengguna memasukkan nilai integer
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");

        // Inisialisasi objek Scanner untuk membaca input dari keyboard
        masukan = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai integer dan menyimpannya ke dalam variabel 'a'
        a = masukan.nextInt(); // Pengguna diminta untuk memasukkan nilai integer

        // Menampilkan nilai yang dibaca dari pengguna
        System.out.print("Nilai yang dibaca : " + a);

        // Menutup objek Scanner setelah digunakan
        masukan.close();
    }
}

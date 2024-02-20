import java.time.Year;
import java.util.Scanner;

public class MenghitungUangKembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Harga: ");
        double totalHarga = scanner.nextDouble();

        System.out.print("Jumlah Uang Pembayaran: ");
        double uangPembayaran = scanner.nextDouble();

        double uangKembalian = uangPembayaran - totalHarga;

        System.out.println("Uang Kembalian: " + uangKembalian);
    }

}
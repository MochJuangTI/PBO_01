import java.util.Calendar;
import java.util.Scanner;
public class MenghitungUmur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur Anda adalah " + umur + " tahun.");
    }

}

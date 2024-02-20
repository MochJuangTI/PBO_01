import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double suhuCelcius = scanner.nextDouble();

        double suhuReamur = suhuCelcius * 4 / 5;
        double suhuFahrenheit = (suhuCelcius * 9 / 5) + 32;
        double suhuKelvin = suhuCelcius + 273.15;

        System.out.println("Konversi suhu:");
        System.out.println("Reamur: " + suhuReamur);
        System.out.println("Fahrenheit: " + suhuFahrenheit);
        System.out.println("Kelvin: " + suhuKelvin);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author 62898
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        double celcius = 100.0;
        double fahrenheit = 212.0;

        // Memanggil method dari class KonversiSuhu
        double toFahrenheit = konversi.celciusToFahrenheit(celcius);
        double toReamurFromCelcius = konversi.celciusToReamur(celcius);

        // Memanggil method dari class KonversiSuhu2
        double toReamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheit);

        // Menampilkan hasil
        System.out.println("Celcius ke Fahrenheit: " + toFahrenheit);
        System.out.println("Celcius ke Reamur    : " + toReamurFromCelcius);
        System.out.println("Fahrenheit ke Reamur : " + toReamurFromFahrenheit);
        
    }
}
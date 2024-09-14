/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author 62898
 */
public class KonversiSuhu {
    // Mengonversi dari Celcius ke Fahrenheit
    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    // Mengonversi dari Celcius ke Reamur
    public double celciusToReamur(double celcius) {
        return celcius * 4/5;
    }
}
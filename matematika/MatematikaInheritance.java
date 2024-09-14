/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author 62898
 */
// Kelas untuk mengeksekusi operasi matematika
public class MatematikaInheritance {
  public static void main(String[] args) {
      // Menggunakan objek Matematika2 yang mewarisi Matematika
      Matematika2 mat = new Matematika2();
      
      // Eksekusi dan cetak hasil operasi matematika
      System.out.println("Pertambahan : 20 + 10 = " + mat.pertambahan(20, 10));
      System.out.println("Pengurangan : 10 - 5  = " + mat.pengurangan(10, 5));
      System.out.println("Perkalian   : 10 * 3  = " + mat.perkalian(10, 3));
      System.out.println("Pembagian   : 21 / 2  = " + mat.pembagian(21, 2));
      System.out.println("Modulus     : 21 % 2  = " + mat.modulus(21, 2));
  }
}
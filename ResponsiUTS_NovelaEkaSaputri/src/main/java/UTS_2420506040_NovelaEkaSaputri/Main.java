/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_2420506040_NovelaEkaSaputri;

/**
 *
 * @author Novela
 */
public class Main {
    public static void main(String[] args) {
        // Objek Produk
        Produk laptop = new Elektronik("Laptop", 1500000, 2);
        Produk snack = new Makanan("Snack", 15000, "2025-12-30");

        // Objek Pegawai
        Pegawai Novela = new PegawaiTetap("Novela", 5000000, 1000000);
        Pegawai Ela = new PegawaiKontrak("Ela", 3000000, 12);
        
        // Output Produk (polimorfisme)
        System.out.println("=== Output Produk ===");
        laptop.tampilkanInfo();
        System.out.println();
        snack.tampilkanInfo();

        // Output Pegawai (polimorfisme)
        System.out.println("\n=== Output Pegawai ===");
        Novela.tampilkanInfo();
        System.out.println();
        Ela.tampilkanInfo();
    }
}

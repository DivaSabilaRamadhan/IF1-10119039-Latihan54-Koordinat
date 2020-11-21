/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini untuk menamilkan data yang sudah di masukkan
 */
public class Test {

    public static int x,y;
    public static String namaWarna;
    
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat Koordinat = new WarnaKoordinat(x,y,namaWarna);
        Koordinat.setX(10);
        Koordinat.setY(4);
        // Menampilkan hasil dari data yang dimasukkan 
        System.out.println("Warna Koordinat : " + Koordinat.getNamaWarna());
        System.out.println("Koordinat sumbu X : " + Koordinat.getX()+",y : " + Koordinat.getY());
    }
    
}

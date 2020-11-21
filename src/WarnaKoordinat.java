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
 * Deskripsi Program : beris class dari Warna Koordinat
 */
public class WarnaKoordinat extends Koordinat{
    public String namaWarna;
    
    WarnaKoordinat(int x,int y,String namaWarna){
        super(x,y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna (String namaWarna){
        this.namaWarna = namaWarna;
    }
}

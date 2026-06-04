/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum090426;

/**
 *
 * @author Mutiara Yulianda
 */
public class Siswa {
    private String nama;
    private String kelas;
    private int umur;
    private int absen;
    private static int jumlahObjek;
    
    public Siswa(){
        jumlahObjek++;
    }
    public Siswa(String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
        this.jumlahObjek ++;
              
    }
    public Siswa(String nama, String kelas, int umur, int absen){
        this.nama = nama;
        this.kelas = kelas;
        this.umur = umur;
        this.absen = absen;
        this.jumlahObjek ++;
              
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getKelas(){
        return kelas;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    
     public void setAbsen(int absen){
        this.absen = absen;
    }
    public int getAbsen(){
        return absen;
    }
    
    public static int getJumlahObjek(){
       return jumlahObjek ;
    }
    
    public void TampilkanData(){
        System.out.println("NAMA SISWA:"+nama);
        System.out.println("KELAS SISWA:"+kelas);
        System.out.println("UMUR SISWA:"+umur);
        System.out.println("ABSEN SISWA:"+absen);
                
        

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan51.GajiKaryawan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA              : Wahyu Muharik
 * KELAS             : FS112B
 * NIK               : 2022431637
 * Deskripsi Program : Program Untuk Menampilkan Gaji Karyawan Dengan Menggunakan 
 *                     Konsep Inheritance dan Polymorphism
 * 
 */
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Manager hrd = new Manager();
        
        System.out.println("====Program Penghitungan Gaji Karyawan====");
        System.out.print("Masukan NIK                     : ");
        hrd.setNik(input.nextLine());
        System.out.print("Masukan Nama                    : ");
        hrd.setNama(input.nextLine());
        System.out.print("Masukan Golongan (1/2/3)        : ");
        hrd.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        hrd.setJabatan(input.next());
        System.out.print("Masukan Jumlah Kehadiran        : ");
        hrd.setKehadiran(input.nextInt());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      : " + hrd.getNik());
        System.out.println("NAMA     : " + hrd.getNama());
        System.out.println("GOLONGAN : " + hrd.getGolongan());
        System.out.println("JABATAN  : " + hrd.getJabatan());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN\t: " + hrd.tunjanganGolongan(hrd.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "  + hrd.tunjanganJabatan(hrd.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + hrd.tunjanganKehadiran(hrd.getKehadiran()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Gaji Total\t: " + hrd.gajiTotal());
    }
}

        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan51.GajiKaryawan;

/**
 *
 * @author Wahyu Muharik
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran(){
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        if(jabatan.equalsIgnoreCase("Manager")){
            tunjanganJabatan = 2000000;
        }
        else if(jabatan.equalsIgnoreCase("Kabag")){
            tunjanganJabatan = 1000000;
        }
        else{
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1 -> tunjanganGolongan = 500000;
            case 2 -> tunjanganGolongan = 1000000;
            case 3 -> tunjanganGolongan = 1500000;
            default -> tunjanganGolongan = 0;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran; 
    }
}

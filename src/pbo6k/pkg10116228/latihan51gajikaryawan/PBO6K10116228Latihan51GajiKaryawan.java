/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan51gajikaryawan;
import java.util.Scanner;
/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program : program ini berisi program yang menampilkan hasil gaji
 *                    karyawan
 */
public class PBO6K10116228Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
    
        Manager manager = new Manager ();
        System.out.print("Masukkan NIK = ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama = ");
        manager.setNama(scn2.next());
        System.out.print("Masukkan Golongan (1/2/3) = ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) = ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran = ");
        manager.setKehadiran(scn5.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK = " + manager.getNik());
        System.out.println("Nama = " + manager.getNama());
        System.out.println("Golongan = " + manager.getGolongan());
        System.out.println("Jabatan = " + manager.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan = " + manager.tunjanganGolongan
                                                     (manager.getGolongan()));
        System.out.println("Tunjangan Jabatan = " + manager.tunjanganJabatan
                                                    (manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran = " + manager.tunjanganKehadiran
                                                     (manager.getKehadiran()));
        System.out.println("Gaji Total = " + manager.totalGaji());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan36.objectorientedtargetsaldo;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program menentukan target saldo
 * yang ditentukan
 */
public class Target {
    public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    }

    public void hitungLamaSaldoTarget(int parSaldo, int parSaldoTarget){
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo,bunga);
            parSaldo += hitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }  
}

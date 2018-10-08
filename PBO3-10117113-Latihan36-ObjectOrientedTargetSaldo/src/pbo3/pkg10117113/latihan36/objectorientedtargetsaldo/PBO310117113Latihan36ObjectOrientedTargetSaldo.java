/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan36.objectorientedtargetsaldo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.Scanner;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program menentukan target saldo
 * yang ditentukan
 */
public class PBO310117113Latihan36ObjectOrientedTargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Target tabung = new Target();
        System.out.print("Saldo Awal : Rp. ");
        tabung.saldo = scanner.nextInt();
        System.out.print("Bunga/Bulan : ");
        tabung.bunga = scanner.nextInt();
        System.out.print("Saldo Target : Rp. ");
        int saldoTarget = scanner.nextInt();
        
        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
        
    }
    
}


package kalkulatorsederhana;

import java.util.Scanner;
public class KalkulatorSederhana {

    public static void main(String[] args) {
        int total = 0, bil1, bil2;
    Scanner input=new Scanner(System.in);
    System.out.print("Masukan Bilangan Ke 1 :");
    bil1=input.nextInt();
    System.out.print("Masukan Bilangan Ke 2 :");
    bil2=input.nextInt();
   
   
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.print("Masukan Pilihan Anda :");
        int pilihan = input.nextInt();
       
        switch(pilihan){
            case 1:
                System.out.println( bil1+ "+" + bil2);
                System.out.print("Hasilnya = ");
                total = bil1 + bil2;
                break;
            case 2:
                System.out.println( bil1+ "-" + bil2);
                System.out.print("Hasilnya = ");
                total = bil1 - bil2;
                break;
            case 3:
                System.out.println( bil1+ "/" + bil2);
                System.out.print("Hasilnya = ");
                total = bil1 / bil2;
                break;
            case 4:
                System.out.println( bil1+ "*" + bil2);
                System.out.print("Hasilnya = ");
                total = bil1 * bil2;
                break;
            default:
                System.out.println("Anda harus mengisi angka");
        }
        
        System.out.println(total);
       
        }
    }
 
        
        
    
    


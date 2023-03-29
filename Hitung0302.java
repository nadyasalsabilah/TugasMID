/*
* Nadya Salsabilah
*13020210302
*/
package hitung0302;
import java.util.Scanner;
  
public class Hitung0302{
	public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
		
		int jarak, konversi;

		System.out.print("Masukkan Jarak yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jarak = konversi*1609;

		System.out.println("konversi dari : "+ konversi + "mil, adalah : ");
		System.out.println(jarak+" meter : ");	
	}
}
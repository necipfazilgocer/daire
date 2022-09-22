package daire;
import java.util.Scanner;
public class daire {

	public static void main(String[] args) {
	double r,alan,cevre;
	System.out.print("Dairenin yarıçapını giriniz.");
	Scanner scanner=new Scanner(System.in);
	r=scanner.nextInt();
	alan=(r*r)*(3.14);
	cevre=2*(3.14)*r;
	System.out.println("Dairenin alanı="+alan);
	System.out.print("Dairenin çevresi="+cevre);
	

	}

}

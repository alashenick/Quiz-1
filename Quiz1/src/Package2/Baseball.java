package Package2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Baseball {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			
		System.out.println("Enter player name: ");
		String PlayerName = input.nextLine();
		
		System.out.println("Enter at bats: ");
		double AB = input.nextDouble();
		
		System.out.println("Enter hits: ");
		double H = input.nextDouble();
		
		System.out.println("Enter doubles: ");
		double Double2B = input.nextDouble();
		
		System.out.println("Enter triples: ");
		double Triple3B = input.nextDouble();
		
		System.out.println("Enter at home runs: ");
		double HR = input.nextDouble();
		
		System.out.println("Enter runs: ");
		double R = input.nextDouble();
		
		System.out.println("Enter walks: ");
		double BB = input.nextDouble();
		
		double BA = findBA(H,AB);
		double OBP = findOBP(H,BB,AB);
		double SLG = findSLG(Double2B, Triple3B, HR, H, AB);
		double OBS = findOBS(OBP, SLG);
		double TB = findTB(Double2B, Triple3B, HR, H);
		
		
		DecimalFormat dec1 = new DecimalFormat("0.000");
		DecimalFormat dec2 = new DecimalFormat("0");
		
		System.out.println("Batting average is " + dec1.format(BA));
		System.out.println("On base percentage is " + dec1.format(OBP));
		System.out.println("Slugging percentage is " + dec1.format(SLG));
		System.out.println("On base plus slugging is " + dec1.format(OBS));
		System.out.println("Total bases is " + dec2.format(TB));
		
		
		
	}
		
	public static double findBA(double H, double AB) {
		double BA = H / AB;
		return BA;	
	}
		
	public static double findOBP(double H, double BB, double AB) {
		double OBP = (H + BB) / (AB + BB);
		return OBP;
	}
	
	public static double findSLG(double Double2B, double Triple3B, double HR, double H, double AB) {
		double SLG = (2*Double2B + 3*Triple3B + 4*HR+ (H - Double2B - Triple3B - HR)) / AB;
		return SLG;
	}
	
	public static double findOBS(double OBP, double SLG) {
		double OBS = (OBP + SLG);
		return OBS;
	}
	
	public static double findTB(double Double2B, double Triple3B, double HR, double H) {
		double TB = (2*Double2B + 3*Triple3B + 4*HR+ (H - Double2B - Triple3B - HR));
		return TB;
	}
	

}



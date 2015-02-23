package quarterBackRating;

import java.util.Scanner;

public class qbRating {
	public static double mm(double num){
		if (num < 0){
			num = 0;
		}
		else if (num > 2.375){
			num = 2.375;
		}
		else {
		}
		return num;
	}
	@SuppressWarnings("resource")
	public static void main (String[] args){
		double attempts = 0;
		double completes = 0;
		double yards = 0;
		double touchdowns = 0;
		double interceptions = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double passerRating = 0;
		
		Scanner att = new Scanner(System.in);
		System.out.println("How many passing attempts have you made?");
		attempts = att.nextDouble();
		
		Scanner ints = new Scanner(System.in);
		System.out.println("How many interceptions have you had?");
		interceptions = ints.nextDouble();
		
		Scanner yds = new Scanner(System.in);
		System.out.println("How many passing yards have you run?");
		yards = yds.nextDouble();
		
		Scanner td = new Scanner(System.in);
		System.out.println("How many touchdown passes have you made?");
		touchdowns = td.nextDouble();
		
		Scanner comp = new Scanner(System.in);
		System.out.println("How many were completed?");
		completes = comp.nextDouble();
		comp.close();
		a = (((completes/attempts)-0.3) *5);
		b = (((yards/attempts)-3)*0.25);
		c = ((touchdowns/attempts)*20);
		d = (2.375-((interceptions/attempts)*25));
		
		passerRating = (((mm(a) + mm(b) + mm(c) + mm(d))/6)*100);
		System.out.println("Your Quarterback Rating is " + (String.format("%.1f",passerRating) + "%"));
	}
}
package booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Doubleroombooking {
	int nosPersons,nosDays;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     Scanner s = new Scanner(System.in);
	public int acbooking() {
		 int cost=0;
		System.out.println("Enter no of persons");
		int nosPersons=s.nextInt();
		System.out.println("Enter no of days");
		int nosDays=s.nextInt();
		
		for(int p=0;p<nosPersons;p++)
		{
			for(int e=0;e<nosDays;e++)
			{
				cost=cost+500;
			}
		}
		return cost;
	}
public int nACbooking() throws NumberFormatException, IOException {
		 int cost=0;
		System.out.println("Enter no of persons");
		int nosPersons=Integer.parseInt(br.readLine());
		System.out.println("Enter no of days");
		int nosDays=Integer.parseInt(br.readLine());
		
		for(int p=0;p<nosPersons;p++)
		{
			for(int e=0;e<nosDays;e++)
			{
				cost=cost+350;
			}
		}
		return cost;
	}
	

}

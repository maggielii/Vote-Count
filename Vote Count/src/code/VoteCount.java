package code;

import java.util.Scanner;

public class VoteCount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int V = input.nextInt();
		int singerA = 0;
		int singerB = 0;
		
		for(int count = V; count>0; count--)
		{
			char vote = input.next().charAt(0);  ;
			
			if(vote == 'A')
			{
				singerA++;
			}

			if(vote == 'B')
			{
				singerB++;
			}

		}
		
		if(singerA > singerB)
			System.out.println("A");
		else if(singerA < singerB)
			System.out.println("B");
		else
			System.out.println("Tie");
	}

}

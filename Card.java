/*
	creating Card class with get and set methods for generating a card
*/


import java.util.Scanner;
public class Card
{
	//declaring enum for suits => s-spades, h-hearts, d-diamonds, c-clubs
	enum suit
	{
		spades,hearts,diamonds,clubs;
	}
	
	private int randomSuit,randomNum;
	Scanner sc;//creating Scanner class object
	suit suitName[];

	//cardNumbers c_numbers[];
	private String n;
	int res;
	Card()
	{
		sc=new Scanner(System.in);
		suitName=new suit[4];
		
		//c_numbers=new cardNumbers[14];
		
	}
	int set()
	{
		//1.generating random number for suits

		double d=0+(Math.random()*4);
		randomSuit=(int)d;
	    suitName=suit.values();
		

		//2.generating random number btw 1-13
	    d=1+(Math.random()*13);
		randomNum=(int)d;
		
		//assigning special words like "ACE, JACK, QUEEN, KING"
		if(randomNum==1)
		{
			n="Ace";
		}
		else if(randomNum==11)
		{
			n="Jack";
		}
		else if(randomNum==12)
		{
			n="Queen";
		}
		else if(randomNum==13)
		{
			n="King";
		}
		else
		{
			n=String.valueOf(randomNum);
		}
		res=randomNum;
		//c_numbers=cardNumbers.values();
		return res;
	}

	//for displaying randomly generated number and suit for a card;
	void get()
	{
		System.out.print(n+" of "+suitName[randomSuit]);	
		System.out.print(" \t\t");
	}
	
}//end of Card class



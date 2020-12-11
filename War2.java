//interface containing all function for the game.
interface myFunction1
{
	void selectTwoCards();//for selecting the cards randomly.
	void findResult(int a,int b);//for finding the final result that who is winner.
	void selectTwoCardsAgain();//for displaying the discarded results
}
class War2 implements myFunction1 
{
	//selecting randomly 2 cards
	int finalRes1,finalRes2,n;

	//select 2 cards for computer and human
	public void selectTwoCards()
	{
		myFunction1 findres=new War2();
		Card player=new Card();
		Card player1=new Card();
		finalRes1=player.set();
		player.get();

		finalRes2=player1.set();
		player1.get();
				
		findres.findResult(finalRes1,finalRes2);
		System.out.print("\n");


	}

	//displays the discarded results
	public void selectTwoCardsAgain()
	{
		myFunction1 findres=new War2();
		Card player=new Card();
		Card player1=new Card();
		finalRes1=player.set();
		player.get();

		finalRes2=player1.set();
		player1.get();
				
		System.out.print("Discard");
		System.out.print("\n");

	}


	// find the winner of the war
	public void findResult(int a, int b)
	{
		finalRes1=a;
		finalRes2=b;
		myFunction1 findres=new War2();
		
		 if(finalRes1>finalRes2)
		{
			System.out.print("Computer wins");
			
		}
		//if the war is tie then this section will executes
		else if(finalRes1==finalRes2)
		{
			System.out.print("Tie");
			System.out.print("\n");
			System.out.println("WAR is CALLED!");
			/*loop for displaying 10 cards and discard them and test the 11th card and check result,
				if the result is tie then again this process will initiate until we get the clear winner.
			*/
			for(n=0;n<=10;n++)
			{
				if(n<10)
				{
				findres.selectTwoCardsAgain();
				}
				else if(n>=10)
				{
					findres.selectTwoCards();
					break;
				}

			}
		}
		else if(finalRes1<finalRes2)
		{
			System.out.print("Human wins");
		}


	}
	
	public static void main(String args[])
	{
		myFunction1 obj=new War2();
		System.out.println("\033[1mComputer Player 	Human Player 	    	Result\033[0m");

		obj.selectTwoCards();
	}
}


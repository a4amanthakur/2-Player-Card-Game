//interface for security
interface myFunction
{
	void selectTwoCards();
	
}
/*
	creating war class for :
	1.selecting 2 cards randomly
	2.find the war results
*/
class War implements myFunction 
{
	//selecting randomly 2 cards
	int finalRes1,finalRes2;
	public void selectTwoCards()
	{
		Card player=new Card();//object creation for Card class
		Card player1=new Card();
		System.out.println("\033[1mComputer Player 	Human Player 	    	Result\033[0m");
		finalRes1=player.set();
		player.get();

		finalRes2=player1.set();
		player1.get();
		//taking decision of the war
		if(finalRes1==finalRes2)
		{
			System.out.print("Tie");
		}
		else if(finalRes1>finalRes2)
		{
			System.out.print("Computer wins");
		}
		else
		{
			System.out.print("Human wins");
		}


		System.out.print("\n");


	}
	
	public static void main(String args[])
	{
		myFunction obj=new War();
		obj.selectTwoCards();
	}
}


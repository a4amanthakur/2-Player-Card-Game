# 2-Player-Card-Game

ASSIGNMENT TWO – GAME ZONE
---------------------------

ASSIGNMENT QUESTION – Game Zone Part 1 :
------------------------------------------
In the last assignment, you created a card class. Modify the card class so the
setValue() method does not allow a card’s value to be less than 1 or higher than 13.
If the argument to setValue() is out of range, assign 1 to the card’s value.
You also created a PickTwoCards application that randomly selects two playing cards
and displays their values. In that application, all card objects were arbitrarily assigned
a suit represented by a single character, but they could have different values, and the
player observed which of two card objects had the higher value. Now, modify the
application so the suit and the value both are chosen randomly. Using two card
objects play a very simple version of the card game War. Deal two cards – one for the
computer and one for the player – and determine the higher card, then display a
message indicating whether the cards are equal, the computer won, or the player won.
(Playing cards are considered equal when they have the same value, no matter what
the suit is). For this game, assume the Ace (value 1) is low. Make sure that the two
cards dealt are not the same card. For example, a deck cannot contain more than one
card representing the 2 of spades. If two cards are chosen to have the same value,
change the suit for one of them. Save the application as War.java


ASSIGNMENT QUESTION – EXAMPLE OUTPUT Part 1:
Computer Player   Human Player    Result
11 of Clubs       11 of Spades    Tie

Computer Player Human Player    Result
5 of Spades     3 of Spades     Computer wins



ASSIGNMENT QUESTION – Game Zone Part 2:
---------------------------------------
Now modify the game using the newly modified card class so that when a tie is declared,
that each player “puts down 10 cards each” and compares the 11 th card to see if there is a
clear winner. If there is a tie, repeat the process until there is a clear winner. The table
below shows four typical executions. Recall that in this version of War, you assume
that the ace is the lowest-valued card. Save the game as War2.java.
So I expect a Card.java, War.java and War2.java file; Each working off the other. No
need to reinvent the wheel! Lastly I expect, when WAR is called, to see all ten cards
displayed.


ASSIGNMENT QUESTION – EXAMPLE OUTPUT Part 2:
-------------------------------------------

Computer Player   Human Player    Result
11 of Clubs       11 of Spades    Tie
WAR is CALLED!
8 of clubs 		    10 of diamonds 	Discard
King of hearts 		6 of spades 		Discard
8 of hearts 		  7 of clubs  		Discard
4 of spades 	  	Ace of spades		Discard
Ace of hearts 		3 of clubs  		Discard
3 of clubs 		    Ace of spades   Discard
Ace of hearts 		5 of clubs 		  Discard
10 of diamonds 		Ace of spade 		Discard
King of spades 		Jack of club 		Discard
6 of spades 		  10 of hearts   	Discard
Queen of hearts 	7 of hearts 		Computer wins



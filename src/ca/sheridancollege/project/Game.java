/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * @modified Priyanka
 */
package ca.sheridancollege.project;

import java.util.Scanner;


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * This class allows to enter player's name.
 * It lets the game set size of group of cards for each player and lets game print which player has how many cards.
 * @author dancye
 * @modified Paul Bonenfant Jan 2020
 */
public abstract class Game {
    
    private Player p1, p2;
public void play()
{
GroupOfCard gC1 = new GroupOfCard();
gC1.shuffle();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name Of Player1:");
String player1=sc.nextLine();

System.out.println("Enter Name Of Player2:");
String player2=sc.nextLine();
p1 = new Player(player1);
p2 = new Player(player2);

do
{
p1.hasCard(gC1.deal());
p2.hasCard(gC1.deal());
}
while (gC1.getSize() >= 2);
p1.useWonCard();
p2.useWonCard();
ShowCard down = new ShowCard(); // Card for cards in a war
for (int t=1; t<=100; t++)
{
if (!enoughCards(1))
{
    break;
}
Card c1 = p1.playCard();
Card c2 = p2.playCard();
System.out.println("\nTurn " + t + ": ");
System.out.println(p1.getName() + ": "+c1+"out of "+p1.NumberOFCards()+"Cards");
System.out.println(p2.getName() + ": "+c2+"out of "+p2.NumberOFCards()+"Cards");
if (0 <= c1.compareTo(c2))
{
p1.hasCard(c1); p1.hasCard(c2);
}
else if (c1.compareTo(c2) < 0)
{
p2.hasCard(c1); p2.hasCard(c2);
}
else // War
{
down.clear();
down.addCard(c1); 
down.addCard(c2);
boolean done = false;
do
{ 
    int NumberOF = c1.getRank();
if (!enoughCards(NumberOF))
{
    break;
}
System.out.println("\nWaaaaaaaaaaaar! Players put down " +NumberOF + " card(s).");
System.out.print("\n");

for (int m=1; m<=NumberOF; m++)
{
c1 = p1.playCard();
c2 = p2.playCard();
down.addCard(c1);
down.addCard(c2);
}
System.out.println(p1.getName()+": "+ c1 + " out of "+p1.NumberOFCards());
System.out.println(p2.getName()+": " + c2 + " out of "+p2.NumberOFCards());
if (c1.compareTo(c2) > 0)
{
p1.hasCards(down);
done = true;
}
else if (c1.compareTo(c2) < 0)
{
p2.hasCards(down);
done = true;
}
}
while (!done);
} // end of for t=1 to 100

}
}
boolean enoughCards(int n)
{
return !(p1.NumberOFCards() < n || p2.NumberOFCards() < n);
}

    /**
     *
     * @return
     */
public Player getWinner()
{
if (p1.NumberOFCards() > p2.NumberOFCards())
{
return p1;
}
else if (p2.NumberOFCards() > p1.NumberOFCards())
{
return p2;
}
else
{
return null;
}
}



}//end class

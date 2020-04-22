/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;



/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * It defines that the deck has 52 cards.
 * @author dancye
 * @modified Paul Bonenfant Jan 2020
 * @modified Priyanka
 */
public class GroupOfCard {

    private Card [] groupOfCard;
private int numCards;

public GroupOfCard()
{
groupOfCard = new Card [52];
fill();
}
public void shuffle()
{
for (int next = 0; next < numCards-1; next++)
{
int r = myRandom(next, numCards-1);
Card temp = groupOfCard[next];
groupOfCard[next] = groupOfCard[r];
groupOfCard[r] = temp;
}
}
public Card deal()
{
if (numCards == 0) 
return null;
numCards--;
return groupOfCard[numCards];
}
public int getSize()
{
return numCards;
}
private void fill()
{
int index = 0;
for (int r = 1; r <= 13; r++)
for (int s = 1; s <= 4; s++)
{
groupOfCard[index] = new Card(r, s);
index++;
}
numCards = 52;
}
private static int myRandom(int low, int high)
{
return (int)((high+1-low)*Math.random()+low);
}


}//end class

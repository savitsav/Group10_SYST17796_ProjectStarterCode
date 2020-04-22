package ca.sheridancollege.project;

//@modifier:Simranpal Kaur
// This class lets you set the cards value as top card or bottom card.

public class ShowCard
{
    
private final Card [] showCard;
private int top, bottom; // top ≤ bottom
public ShowCard()
{
showCard = new Card[52];
top = 0; bottom = 0;
}
public int getSize()
{
return bottom - top;
}
public void clear()
{
 top = 0; bottom = 0;
}
public void addCard(Card c)
{
showCard[bottom] = c;
bottom++;
}
public void addCards(ShowCard p)
{
while(p.getSize() > 0)
{ 
addCard(p.nextCard());   
}
}

public Card nextCard()
{
if (top == bottom)
{
return null; // should not happen
}
Card c = showCard[top];
top++;
return c;
}
}

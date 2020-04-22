package ca.sheridancollege.project;
/*
*This class is giving single card to each player
*it checks whether the player has enough cards to play
*@author Savita Savita
*/
public class Player {
private ShowCard playCard, decisionCard;
private String names;

public Player(String name)
{
names = name;
playCard = new ShowCard();
decisionCard = new ShowCard();
}
public Card playCard()
{
if(playCard.getSize() == 0)
{
    useWonCard();
}
if (playCard.getSize() > 0)
{
return playCard.nextCard();
}
return null;
}
public String getName() {
return names;
}
public void hasCard(Card c) {
decisionCard.addCard(c);
}
public void hasCards(ShowCard p) {
decisionCard.addCards(p);
}
public void useWonCard()
{
playCard.clear(); // reset front and end to 0
playCard.addCards(decisionCard);
decisionCard.clear(); // reset front and end to 0
}
public int NumberOFCards()
{
return playCard.getSize() + decisionCard.getSize();
}
}
package ca.sheridancollege.project;

import java.util.Objects;
/*
*A Card object is defined by its ranks and its suits.We represent the ranks using the integers from 1 to 13.
*suits are represented as a String object,
*We code the suits with the String values HEART,DIAMOND,SPADE,CLUBS .
*@author Savita Savita

*/
public class Card implements Comparable<Object>
{
    //Fields make final By Priyanka
private  int ranks;
private  int suits;
private Object value;

    /**
     *
     * @param rank
     * @param suit
     */
public Card(int rank, int suit)
{
ranks = rank;
suits = suit;
}
public int getRank()
{
return ranks;
}
public int getSuit()
{
return suits;
}
@Override
public int compareTo(Object ob)
{
Card other = (Card)ob;
int thisRank = this.getRank();
int otherRank = other.getRank();
if(thisRank == 1)
{
    thisRank = 14;
} // make aces high
if (otherRank == 1)
{
    otherRank = 14;
}
return thisRank - otherRank;
}
//Changes Made By Simran
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.ranks;
        hash = 53 * hash + this.suits;
        hash = 53 * hash + Objects.hashCode(this.value);
        return hash;
    }
    
// Changes Made by Priyana
@Override
public boolean equals(Object ob)
{
if (ob instanceof Card)
{
Card other = (Card)ob;
return value==other.value && suits==other.suits;
}
else
	{
	return false;
	}
}
@Override
public String toString()
{
String val;
String [] suitsList =
{ "", "CLUBS", "DIAMONDS", "HEARTS", "SPADES" };
    switch (ranks) {
        case 1:
            val = "Ace";
            break;
        case 11:
            val = "Jack";
            break;
        case 12:
            val = "Queen";
            break;
        case 13:
            val = "King";
            break;
        default:
            val = String.valueOf(ranks); // int to String
            break;
    }
String s = val + " of " + suitsList[suits];
for (int k=s.length()+1; k<=17; k++) s = s + " ";
{
return s;
}
}
}
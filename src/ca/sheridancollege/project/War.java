package ca.sheridancollege.project;
//modifier:Simranpal Kaur
// It is themain class.
//It creats the instance of game class and calls the play method.

public class War
{
public static void main(String [] args)
{
Game game = new Game() {};
game.play();
Player results = game.getWinner();
if (results == null)
{
    System.out.println("TIE GAME");
}
else
{
    System.out.println("\nWinner is "+ results.getName()+":-)");
}
}
}
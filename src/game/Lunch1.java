package game;
import java.util.*;

class Guesser
{
    int guessNum;
    
    int guessingNumber() 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("kindly!guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player
{
    int guessNum;
    
     int  guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player ! guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Umphire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumberFromGusser()
    {
        Guesser g1=new Guesser();
        numFromGuesser=g1.guessingNumber();
    }
    void collectNumberFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber(); 
    }
    void Compare()
    {
    	if(numFromGuesser==numFromPlayer1)
    	{
    		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
    		{
    			System.out.println("Congratulation !! All Players WON The Game");
    		}
    		else if(numFromGuesser==numFromPlayer2)
    		{
    			System.out.println("Congratulation !! Player 1 And Player 2 WON The Game");	
    		}
    		else if(numFromGuesser==numFromPlayer3)
    		{
    			System.out.println("Congratulation !! Player 1 And Player 3 WON the Game");
    		}
    		else
    		{
    		System.out.println("Congratulation! Player1 WON the Game");
    		}
    	}
    	else if(numFromGuesser==numFromPlayer2)
    	{
    		if(numFromGuesser==numFromPlayer3)
    		{
    			System.out.println("Congratulation !! Player 2 And Player 3 WON The Game");
    		}
    		else
    		{
    		System.out.println("Congratulation! Player2 WON the Game");
    		}
    	}
    	else if(numFromGuesser==numFromPlayer3)
    	{
    		System.out.println("Congratulation! Player3 WON the Game");
    	}
    	else
    	{
    		System.out.println("Bad luck all are Incorrect");
    	}   
    }
}
public class Lunch1 
{
	public static void main(String[] args) 
	{
		System.out.println(" GAME STARTED !!");
	    Umphire u=new Umphire();
		u.collectNumberFromGusser();
		u.collectNumberFromPlayer();
		u.Compare();	
	}
}

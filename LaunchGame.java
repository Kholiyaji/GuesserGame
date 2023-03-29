import java.util.Scanner;

class Player{
    int num1;
    int num2;
    int num3;


    public int  Player1() {
        System.out.println("Enter the number guess by player 1");
        Scanner sc=new Scanner(System.in);
        num1= sc.nextInt();
        return num1;
    }

    public int Player2() {
        System.out.println("Enter the number guess by player 2");
        Scanner sc=new Scanner(System.in);
        num2= sc.nextInt();
        return num2;
    }

    public int Player3() {
        System.out.println("Enter the number guess by player 3");
        Scanner sc=new Scanner(System.in);
        num3= sc.nextInt();
        return num3;
    }
}

class Umpire{
  int numguess;
  int numP1;
  int numP2;
  int numP3;
    public void getNumberFromGuesser() {
        Guesser Guess=new Guesser();
        numguess=Guess.guessNumber();
    }

    public void collectFromPlayer() {
        Player p=new Player();
       numP1= p.Player1();
       numP2= p.Player2();
       numP3= p.Player3();
    }

    public void calcResult() {
        if(numguess==numP1){
            System.out.println("player 1 wins");
        }
        if(numguess==numP2){
            System.out.println("player 2 wins");
        }
        if(numguess==numP3){
            System.out.println("player 3 wins");
        }
        else {
            System.out.println("BETTER LUCK NEXT TIME");
        }
    }
}

class Guesser{
int numg;
    public  int guessNumber() {
        System.out.println("Enter the number you guess");
        Scanner input=new Scanner(System.in);
        numg=input.nextInt();
        return numg;
    }
}
public class LaunchGame {
    public static void main(String[]args){
   Umpire umpire=new Umpire();
   umpire.getNumberFromGuesser();
   umpire.collectFromPlayer();
   umpire.calcResult();
    }
}

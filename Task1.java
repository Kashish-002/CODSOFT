import java.util.Random;
import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Random randomnum=new Random();
        Scanner sc=new Scanner(System.in);
        int score=0;

        int random_num=randomnum.nextInt(100);
        System.out.println("WELCOME!");
        System.out.println("Number Guessing Game");
        int round=3;
        for(int i=0;i<round;i++){
            System.out.println("Round="+(i+1));
            
        int chance=0;

        int num_tries=3;
        for(int j=0;j<num_tries;j++){
            System.out.println("Enter a number between 0 and 100:");
            int guess_num=sc.nextInt();

            if(guess_num==random_num){
                System.out.println("Number was:"+random_num);
                System.out.println("Hurray!You guessed the number right");
                break;
            }

            if(guess_num<random_num){
                System.out.println("Your guess is too low.Try again");
            }
            else{

                System.out.println("Your guess is too high.Try again");
            }
            chance++;
        }
           
        if(chance==3){
            score+=0;
            System.out.println("Score="+score);
            System.out.println("The number was="+random_num);
        }
        else if(chance<=1){
            score+=500;
            System.out.println("Score="+score);
            System.out.println("The number was="+random_num);
        }

    
        else{
            System.out.println("Score="+score);
            System.out.println("The number was="+random_num);
            
        }
        System.out.println("Thank You for playing!");
        System.out.println("GAME OVER"); 
    }
    sc.close();
       }  
    }




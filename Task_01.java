import java.util.Random;
import java.util.Scanner;
public class Task_01{
    public static void main(String[] args){
        Random randomnum=new Random();
        Scanner sc=new Scanner(System.in);

        int random_num=randomnum.nextInt(100);
        System.out.println("Welcome!");
        System.out.println("Number Guessing Game");

        int num_tries=3;

        for(int i=0;i<num_tries;i++){
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
          
        }
        System.out.println("The number was:"+random_num);

        System.out.println("Thank you for playing.");


       sc.close();
    }
}
package practice;

import java.util.Scanner;

public class Number_guessing_game {
    public static void main (String[]args) {
        System.out.println("*welcome to the guessing game*");
        System.out.println("System will select a random number between 1 and 100");
        System.out.println("You have to guess the number within 7 trials");
        int result=0;
        int min = 0;
        int max = 100;
        int s=0;
        int i=1;
        int b =(int)(Math.random()*(max-min+1)+min);
        for(i=1;i<7;i++) {
            System.out.println("Round " +i);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            s = sc.nextInt();
            if(b<s) {
                System.out.println("the number is greater than the guessing number");
            }
            else if(b>s){
                System.out.println("the number is lower than the guessing number");
            }
            else if(b==s) {
                System.out.println("the number is same as guessing number in the guessing of in :"+i+"trail");
                result++;
                break;
            }
            else {
                System.out.println("you guesse the number in trails"+i+"and your trail is over");
            }
        }
        System.out.println(b);
        System.out.println("This is your result:"+ result + " after the attempts"+i);
    }
}
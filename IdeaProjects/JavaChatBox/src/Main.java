// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// This is my first project added to Git Hub on java And I took this Project From JetBrains Academy and HyperSkill
import java.util.*;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("chatbot", 2023);
        remindName();
        ageGuess();
        countingNum();
        test();
        end();
     }

     static void greet(String name ,int birthyear){
            System.out.println("Hello! My name is "+name+".");
            System.out.println("I was created in " + birthyear +".");
            System.out.println("PLease , remind me your name.");
            }
    static void remindName(){
            String name = scanner.nextLine();
            System.out.println("What a great name you have, " + name + "!");
             }

    static void ageGuess(){
            System.out.println("Let's me guess your age?");
            System.out.println("Please provide the reminders of your age when divided by 3 , 5 and 7 ");
            int r3 = scanner.nextInt();
            int r5 = scanner.nextInt();
            int r7 = scanner.nextInt();

            int Age = (r3 * 70 + r5 * 21 + r7 * 20) % 105;

            System.out.println("Your age is " + Age + ";" + " That's a good time to start programming.");
            System.out.println("Now I will prove you that i can count to any number you want");
            }

    static void countingNum(){
             int num = scanner.nextInt();
             for (int i = 0; i <= num; i++){
                 System.out.println( i + "!");
             }

             System.out.println("Completed, have a nice day");
            }


    static void test(){
         System.out.println("Let's test your Knowledeg of Prgramming.");
         System.out.println("Why do you use methods?");
         int n = -1;
         for(int i =0 ; i > n;i++){
             System.out.println("1. To repeat a statement multiple times.\n");
             System.out.println("2. To decompose a program into several small subroutines.\n");
             System.out.println("3. To determine the execution time of a program.\n");
             System.out.println("4. To interrupt the execution of a program.\n");

             int Ans = scanner.nextInt();
             if(Ans == 2){
                 break;
             }else{
                 System.out.println("Please ,try again");
             }
          }
      }

      static void end() {
             System.out.println("Congratulations, have a nice day!\n");
          }
   }

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("===================Expense Tracker======================");
         System.out.println("1. ADD EXPENSE");
         System.out.println("2. DELETE EXPENSE");
         System.out.println("3.EXIT");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Youve selected to add an expense");
        }
        else if(choice == 2) {
            System.out.println("youve selected to delete an expense");
    
        }
        else if(choice == 3) {
            System.out.println("you have chosen to exit");
        }
        else {
            System.out.println("invalid choicce");
        }

    }
}
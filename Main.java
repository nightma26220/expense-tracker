
import java.util.*;

// Test commit for contribution tracking - Testing GitHub contributions display
// Version: 1.0
public class Main{
    public static void main(String[] args){
        ArrayList<Expense> expenses =  new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("===================Expense Tracker======================");
         System.out.println("1. ADD EXPENSE");
         System.out.println("2. VIEW EXPENSE");
         System.out.println("3. DELETE EXPENSE");
         System.out.println("4.SEARCH EXPENSE");
         System.out.println("5.TOTAL SPENDING");
         System.out.println("6.UPDATE");
         System.out.println("7.EXIT");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        //adding an expense
        if(choice == 1) {
            sc.nextLine();

            System.out.print("Enter the id ");
            int id=sc.nextInt();

            sc.nextLine();

            System.out.print("Enter the title ");
            String title=sc.nextLine();

            System.out.print("Enter the Amount ");
            double amount=sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter the Category ");
            String category = sc.nextLine();
        
           Expense expense=new Expense(id,title,amount,category);
            
            expenses.add(expense);

            System.out.println("Total Expenses:" + expenses.size());

            System.out.println("\n Expense added successfully..!");

            System.out.println("ID:"+ expense.id);
            System.out.println("Title:"+ expense.title);
            System.out.println("Amount" + expense.amount);
            System.out.println("Category" + expense.category);


        }
        //viewing an expense
        else if(choice == 2) {
            if( expenses.isEmpty()){
                System.out.println("No expenses found.");
            }

            else {
                for(Expense e : expenses){
                    System.out.println("ID : "+ e.id);
                    System.out.println("Title : "+e.title);
                    System.out.println("Amount : "+ e.amount);
                    System.out.println("Category :" + e.category);

                    System.out.println("----------------------------");
                }
            }
    
        }
        //deleting an expense
        else if(choice ==3){
            System.out.println("please enter the id to be deleted!");
            int removeId = sc.nextInt();
            System.out.println("you have etnered the id no "+removeId+" to be deleted");
            boolean found = false;
            for(int i=0; i<expenses.size(); i++) {
                Expense e = expenses.get(i);
                if(e.id == removeId){
                    expenses.remove(i);
                     found = true;
                    System.out.println("Expense deleted successfully");
                    break;
                }
               
            }
            if(!found){
                System.out.println("Oops you have entered the invalid id");
            }
        }

        //searching an expense through id

        else if(choice==4){
            System.out.println("Enter id number to be searched:");
            int SearchId=sc.nextInt();

            boolean found=false;
            for(Expense e : expenses){
                if(e.id==SearchId){
                    System.out.println("Expense Found! ");

                    System.out.println("ID:"+e.id);
                    System.out.println("TITLE"+e.title);
                    System.out.println("AMOUNT"+e.amount);
                    System.out.println("CATEGORY"+e.category);
                    found = true;
                    break;
                }
            }

            if(found==false){
                System.out.println("Sorry expense not found..:");
            }
            
        }
        //calculating total expense
        else if( choice==5){
            double total=0;
            for(Expense e:expenses){
                total+=e.amount;
            }
            System.out.println("Your spending total is"+total);
        }
        //updating an expense
        else if(choice==6){
            System.out.println("Please enter the id to be updated");
            int updateId=sc.nextInt();
            sc.nextLine();
            boolean found=false;
            for(Expense e:expenses){
                if(e.id==updateId){
                    System.out.println("New Title");
                    String title=sc.nextLine();
                    System.out.println("New Amount:");
                    double amount=sc.nextDouble();
                    sc.nextLine();
                    System.out.println("New Category");
                    String category=sc.nextLine();
                    System.out.println("So you new updated id is:");
                    e.title=title;
                    e.amount=amount;
                    e.category=category;

                    System.out.println("ID"+e.id);
                    System.out.println("TITLE"+e.title);
                    System.out.println("AMOUNT"+e.amount);
                    System.out.println("CATEGORY"+e.category);
                    found=true;
                    break;
                }
                if(!found){
                    System.out.println("OOps Expense not found");
                }
                

                
            }
        }
        else if(choice==7) {
            System.out.println("you have chosen to exit");

            break;
        }
        else {
            System.out.println("invalid choicce");
        }

    }
}
}
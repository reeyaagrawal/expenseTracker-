import java.util.ArrayList;
import java.util.Scanner;

class tracker{
    ArrayList<String> items=new ArrayList<>();
    ArrayList<Double> amounts=new ArrayList<>();
    double amount;
    double total;
    String item;
    Scanner sc=new Scanner(System.in);

    tracker(){
        amount=0;
        item="";
        total=0;
    }

    void enterData(){
        sc.nextLine();
        System.out.print("Enter item where u spent moneyy! ");
        item=sc.nextLine();        
        System.out.print("Enter amount youu spentt :( ");
        amount=sc.nextDouble();
        items.add(item);
        amounts.add(amount);
        total+=amount;
    }

    void viewAllRecord(){
        for(int i=0;i<items.size();i++){
            System.out.println("item\t"+items.get(i)+"\nAmount\t"+amounts.get(i)+"\n----------------");
        }
    }

    void viewTotal() {
        System.out.println("Total Expense: " + total);
    }

    void display(){
        int choice;
        // sc.nextInt();
        do{
            System.out.println("Enter choice \n1.To enter data\n2.To view last records\n3.To view total\n4.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    enterData();
                    break;
                case 2:
                    viewAllRecord();
                    break;
                case 3:
                    viewTotal();
                    break;
                case 4:
                    System.out.println("System ended successfully");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }while(choice != 4);
    }

}

public class expenseTracker {
    public static void main(String[] args) {
        tracker obj=new tracker();
        obj.display();
        
    }
}

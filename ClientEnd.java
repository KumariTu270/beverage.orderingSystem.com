package orderingsystemforbeverage;
import java.util.Scanner;

public class ClientEnd {
    public static void main(String[] args){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.showlist();
        System.out.println("Select the items from the catalog : ");
        String input = scanner.nextLine();
        String []choices = input.split(",");
        int []clientChoice = new int[choices.length] ;
        for(int i =0 ;i<choices.length ; i++){
            clientChoice[i]=Integer.parseInt(choices[i]);
        }
       new BillService().calculateBill(clientChoice , menu.getMenuCard());
    }
}


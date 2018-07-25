package orderingsystemforbeverage;

import java.util.HashMap;
import java.util.Map;

public class BillService {
    void calculateBill(int []clientChoice , Map<Integer , Beverage> menuCard){
        int bill=0 ;
        int totalBill=0 ;
        int tax=0 ;
        int k=0;
        final String PRINT_LINE = "-----------------------------------------------------";
        Map<Integer , Integer> frequencyCount = new HashMap<>();
        for(int i=0 ; i<clientChoice.length ; i++){
            frequencyCount.put(clientChoice[i] , frequencyCount.getOrDefault(clientChoice[i] , 0)+1);
        }

        int orderNumber = 1;
        System.out.println("No.     Item        Quantity       Price");
        for(Map.Entry printingBill : frequencyCount.entrySet()){
            for(k =0 ; k<(Integer) printingBill.getValue() ; k++){
                bill = bill+menuCard.get(printingBill.getKey()).getPrice();
                tax = tax + menuCard.get(printingBill.getKey()).getTax();
                totalBill = totalBill+menuCard.get(printingBill.getKey()).getPrice() + menuCard.get(printingBill.getKey()).getTax() ;
            }
            System.out.println(orderNumber+".      "+menuCard.get(printingBill.getKey()).getBeverageName()+"       "+k+"       "+menuCard.get(printingBill.getKey()).getPrice());
            orderNumber++;
        }


        System.out.println(PRINT_LINE);
        System.out.println("        Total :     "+bill);
        System.out.println("        Taxes :     "+tax);
        System.out.println(PRINT_LINE);
        System.out.println("        Net :       "+totalBill);
        System.out.println(PRINT_LINE);
    }
}

package orderingsystemforbeverage;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<Integer, Beverage> menuCard = new HashMap<>();

    Menu(){
        menuCard.put(1 , new Coffee("CAPPUCCINO" , 50 , 18, BeverageCategory.Hot , "Coffee"));
        menuCard.put(2 , new Coffee("EXPRESSO" , 30 , 18, BeverageCategory.Hot , "Coffee" ));
        menuCard.put(3 , new Coffee("LATTE" , 40 ,18, BeverageCategory.Hot , "Coffee" ));
        menuCard.put(4 , new Tea("BLACK" , 10 , 5 ,BeverageCategory.Hot , "Tea" ));
        menuCard.put(5 , new Tea("MASALA" , 15 , 5 ,BeverageCategory.Hot , "Tea" ));
        menuCard.put(6 , new Coffee("OREO" , 110 ,18, BeverageCategory.Cold , "Coffee"));
        menuCard.put(7 , new Coffee("FRAPE" , 125 ,18, BeverageCategory.Cold , "Coffee"));
        menuCard.put(8 , new ColdDrinks("COCO-COLA" , 45 ,21, BeverageCategory.Cold  , "ColdDrink"));
        menuCard.put(9 , new ColdDrinks("MIRINDA" , 45 , 21,BeverageCategory.Cold  , "ColdDrink" ));
        menuCard.put(10 , new ColdDrinks("PEPSI" , 45 , 21,BeverageCategory.Cold  , "ColdDrink" ));
    }

    void showlist(){
        for(Map.Entry menuCardPrinting : menuCard.entrySet()){
            System.out.println(menuCardPrinting.getKey()+"."+((Beverage)menuCardPrinting.getValue()).getBeverageType()+"."+((Beverage)menuCardPrinting.getValue()).getTypeName()+"."+((Beverage)menuCardPrinting.getValue()).getBeverageName()+" = "+((Beverage)menuCardPrinting.getValue()).getPrice());
        }
    }

    Map<Integer , Beverage> getMenuCard(){
        return menuCard;
    }
}

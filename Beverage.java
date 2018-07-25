package orderingsystemforbeverage;

public interface Beverage {
       int getTax();
       String getTypeName();
       int getPrice();
       String getBeverageName();
       BeverageCategory getBeverageType();
}

package orderingsystemforbeverage;

public class ColdDrinks implements Beverage{
    private BeverageCategory beverageCategory;
    private int price;
    private String beverageName;
    private String typeName;
    private int tax;
    ColdDrinks(String name , int price ,int tax , BeverageCategory beverageCategory , String typeName){
        this.beverageName = name;
        this.price = price;
        this.beverageCategory = beverageCategory;
        this.typeName = typeName;
        this.tax = tax;
    }

    public int getTax(){
        return this.tax;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getPrice() {
        return price;
    }

    public String getBeverageName() {
        return beverageName;
    }
    public  BeverageCategory getBeverageType(){
        return beverageCategory;
    }

}

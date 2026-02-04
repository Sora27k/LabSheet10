public class Bakery {
    private String flavor;
    private double untilePrice;
    private int packingCost = 5;


    public Bakery(String flavor,double untilePrice){
        this.flavor = flavor;
        this.untilePrice = untilePrice;
    }
    public Bakery(){
        this("",0.0);
    }
    public String getFlavor(){
        return  this.flavor;
    }
    public  double getUntilePrice(){
        return  this.untilePrice;
    }

    public int getPackingCost() {
        return this.packingCost;
    }
    public  double calculateTotalPrice(){
        return  this.untilePrice + this.packingCost;
    }

    public void setUntilePrice(double price){
        this.untilePrice = price;
    }

    @Override
    public String toString() {
        return "Thank you for your order!";
    }
}

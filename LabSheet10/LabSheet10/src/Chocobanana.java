public class Chocobanana extends Bakery {
    private String topping;
    private int quantity;

    public Chocobanana(int quantity, String topping, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.topping = topping;
        this.quantity = quantity;
    }

    @Override
    public double calculateTotalPrice() {
        double tempPrice = this.getUntilePrice();
        if(topping.isEmpty()){
            return (tempPrice * quantity);

        }else{
            return ((tempPrice + 10) * quantity);
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "\nChocobanana (" + getFlavor() + ") x " + quantity + " pieces" +
                "\nTopping: " + topping +
                "\nTotal price of Chocobanana = " + calculateTotalPrice();
    }
}
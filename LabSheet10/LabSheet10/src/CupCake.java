public class CupCake extends Bakery{
    private int piece;

    public CupCake(int piece,String flavor_cupcake,double unitPrice){
        super(flavor_cupcake,unitPrice);
        this.piece = piece;
    }
    public  boolean isPaclingBox(){
        return  this.piece >= 6;
    }

    public  int geBoxNumber(){
        if (isPaclingBox()){
            return this.piece/6;
        }
        return 0;
    }

    public  int getBagNumber(){
        return  this.piece % 6;
    }

    @Override
    public int getPackingCost(){
        if (isPaclingBox()){
            return getBagNumber()*super.getPackingCost();
        }return 0;

    }

    @Override
    public  double calculateTotalPrice(){
        return (getUntilePrice() * this.piece) + (getPackingCost() + getBagNumber()*0.5);
    }


    public String toString() {
        return super.toString() +
                "\nCup Cake (" + getFlavor() + ") with " +
                (isPaclingBox()? getBagNumber() + " Box " : "") + getBagNumber() + " Bag" +
                "\nTotal price of CupCake = " + calculateTotalPrice();
    }
}

public class Chocobanana extends Bakery {

    private int stick;

    public Chocobanana(int stick,double unitPrice,String flavor){
        super(flavor,unitPrice);
        this.stick = stick;
    }

    public double promotion(){
        if (this.stick * getUntilePrice() > 100){
            return this.stick - ((this.stick * 25)*10/100);
        }return this.stick;
    }

    @Override
    public  double calculateTotalPrice(){
        return promotion();
    }

    public String toSring() {
        return super.toSring() +
                "\nChocobanana" + calculateTotalPrice();
    }
}

public class Chocobanana extends Bakery {
    private String topping;
    private int quantity; // เพิ่มตัวแปรเก็บจำนวน

    // Constructor รับค่า quantity เพิ่มเข้ามา
    public Chocobanana(int quantity, String topping, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.topping = topping;
        this.quantity = quantity;
    }

    // Override เมธอดคำนวณราคา
    @Override
    public double calculateTotalPrice() {
        // ตัวอย่างสูตร: (ราคาต่อชิ้น * จำนวน) + ค่าท็อปปิ้ง + ค่าแพ็คเกจ
        return (super.getUntilePrice() * quantity) + 10 + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nChocobanana (" + getFlavor() + ") x" + quantity + " pieces" +
                "\nTopping: " + topping +
                "\nTotal price of Chocobanana = " + calculateTotalPrice();
    }
}
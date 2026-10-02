public class Enums {
    enum Laptops {
        dell(200), hp(500), macbook(), asus(700);

        private int price;

        private Laptops(){
            
        }

        private Laptops(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public  void setPrice(int price){
            this.price = price;
        }
    }

    public static void main(String[] args) {
        // Laptops l = Laptops.dell;
        // System.out.println(l.getPrice());

        for(Laptops l : Laptops.values()){
            System.out.println(l + ":" + l.getPrice());
        }
    }
}
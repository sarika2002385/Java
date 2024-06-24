public class Shopping {
    public static void main(String[] args) {
      
        String itemName1 = "Shirt";
        double itemPrice1 = 1200.0;
        String itemName2 = "Jeans";
        double itemPrice2 = 2500.0;
        String itemName3 = "Jacket";
        double itemPrice3 = 4500.0;
        String itemName4 = "Shoes";
        double itemPrice4 = 3000.0;
        String itemName5 = "Hat";
        double itemPrice5 = 800.0;
        String itemName6 = "Socks";
        double itemPrice6 = 200.0;
        String itemName7 = "Belt";
        double itemPrice7 = 1000.0;
        String itemName8 = "Scarf";
        double itemPrice8 = 500.0;

        
        double totalBill = itemPrice1 + itemPrice2 + itemPrice3 + itemPrice4 + itemPrice5 + itemPrice6 + itemPrice7 + itemPrice8;

       
        if (totalBill > 5000) {
            System.out.println("Total Shopping Bill: $" + totalBill);
            System.out.println("Items Purchased:");
            System.out.println(itemName1 + " - $" + itemPrice1);
            System.out.println(itemName2 + " - $" + itemPrice2);
            System.out.println(itemName3 + " - $" + itemPrice3);
            System.out.println(itemName4 + " - $" + itemPrice4);
            System.out.println(itemName5 + " - $" + itemPrice5);
            System.out.println(itemName6 + " - $" + itemPrice6);
            System.out.println(itemName7 + " - $" + itemPrice7);
            System.out.println(itemName8 + " - $" + itemPrice8);
        } else {
            System.out.println("Total Shopping Bill is less than or equal to $5000. Current Bill: $" + totalBill);
        }
    }
}
package bonusprogram;

public class Main {
  public static void main(String[] args) {
    ShoppingSession ss = new ShoppingSession();
    ss.buy("milki", 2);
    ss.buy("bagguet", 2);
    System.out.println("total amount = " + ss.getTotalAmount());
  }
}


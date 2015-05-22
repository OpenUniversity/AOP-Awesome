package bonusprogram;

class ShoppingSession {
  int totalAmount = 0;

  void buy(String item, int amount) {
    String category = categoryOf(item);
    totalAmount = exhibit
      Buying(String category, int amount) {
	return totalAmount += amount;
      } (category, amount);
  }

  String categoryOf(String item) {
    if ("milki".equals(item))
	return "milk";
    if ("bagguet".equals(item))
	return "bread";

    return "unknown";
  }

  public int getTotalAmount() {
    return totalAmount;
  }
}


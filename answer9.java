enum House {
  Galaxy("$70000"), Mannet("$95000"), Antilia("$150000");

  private String price;

  //getter method
  public String getPrice() {
    return this.price;
  }

  //enum constructor
  private House(String price) {
    this.price = price;
  }

  public static void main(String arg[]) {
    House[] h = House.values();

    for(House hs : h)
      //use getter methods to get values
      System.out.println("House Name: " + hs.name() + " price: " + hs.getPrice() );
  }
}

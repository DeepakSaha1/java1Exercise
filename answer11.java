// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,
// print details of every banks
//Parent Bank
class Bank {
  String rateofinterest = "9%";
  void getDetails() {
    System.out.println("rateofinterest should be approx: " + rateofinterest);
  }
}

//SBI bank
class SBI extends Bank {
  SBI(String rateofinterest) {
    this.rateofinterest = rateofinterest;
  }
  void getDetails() {
    System.out.println("rateofinterest of SBI is: " + rateofinterest);
  }

  public static void main(String arg[]) {
    SBI sbi = new SBI("11%");
    sbi.getDetails();
  }
}

//BOI bank
class BOI extends Bank {
  BOI(String rateofinterest) {
    this.rateofinterest = rateofinterest;
  }
  void getDetails() {
    System.out.println("rateofinterest of BOI is: " + rateofinterest);
  }

  public static void main(String arg[]) {
    BOI boi = new BOI("9.5%");
    boi.getDetails();
  }
}

//ICICI Bank
class ICICI extends Bank {
  ICICI(String rateofinterest) {
    this.rateofinterest = rateofinterest;
  }
  void getDetails() {
    System.out.println("rateofinterest of ICICi is: " + rateofinterest);
  }

  public static void main(String arg[]) {
    ICICI icici = new ICICI("8.5%");
    icici.getDetails();
  }
}

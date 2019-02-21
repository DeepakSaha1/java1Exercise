class StaticDemo {
  static String firstName;
  String lastName;
  static int age;
  static StaticDemo staticDemo;

  static {
    firstName = "Deepak";
  }

  static String setLastName(String lastName) {
    staticDemo.lastName = lastName;
    return  lastName;
  }

  public static void main(String arg[]) {
    staticDemo = new StaticDemo();
    StaticDemo.age = 22;
    System.out.println("FirstName: " + firstName + " LastName: " + setLastName("Saha") + " Age: " + age);
  }
}

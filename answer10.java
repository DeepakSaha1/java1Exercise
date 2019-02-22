// Q10.Write a single program for following operation using overloading
//   A) Adding 2 integer number
//   B) Adding 2 double
//   C) multiplying 2 float
//   D) multiplying 2 int
//   E) concate 2 string
//   F) Concate 3 String

class SingleOperation {
  public int sum (int a, int b) {
    return (a + b);
  }


  public double sum (double a, double b) {
    return (a + b);
  }

  public int multiply (int a, int b) {
    return (a * b);
  }

  public float multiply (float a, float b) {
    return (a * b);
  }

  public String concat (String str1, String str2) {
    return (str1 + str2);
  }

  public String concat (String str1, String str2, String str3) {
    return (str1 + str2 + str3);
  }

  public static void main(String arg[]) {
    SingleOperation so = new SingleOperation();
    System.out.println(so.sum(1, 2));
    System.out.println(so.sum(1.5, 2.5));
    System.out.println(so.multiply(2, 3));
    System.out.println(so.multiply(2.5F, 3.0F));
    System.out.println(so.concat("Hello ", "World!"));
    System.out.println(so.concat("Hello ", "World! ", "Again"));
  }
}

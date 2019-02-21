import java.util.Scanner;
class CharOccurance {
  private static Scanner sc;
  private static String str;
  private static char char_;

  private static int charcount;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    str = sc.nextLine().toLowerCase();

    System.out.println("Length Of String: " + str.length());

    System.out.println("Enter a character to count in the string: " + str);
    char_ = sc.next().toLowerCase().charAt(0);

    System.out.println("Length Of String Without " + char_ + ": " + str.replace(String.valueOf(char_), "").length());

    charcount = str.length() - str.replaceAll(String.valueOf(char_), "").length();
    System.out.println("Occurrence Of " + char_+ " Char In String: " + charcount);
    }
}

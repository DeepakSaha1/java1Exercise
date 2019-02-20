import java.util.Scanner;
class ReplaceSubString {
  private static Scanner sc;
  public static void main(String arg[]) {
    sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String sentence = sc.nextLine();
    System.out.println(sentence);

    System.out.println("Enter substring to replace: ");
    String subString = sc.nextLine();

    System.out.println("Enter substring to replace with: ");
    String repSubString = sc.nextLine();

    System.out.println("New String after replacement: "+ replaceString(sentence, subString, repSubString));
  }

  static String replaceString(String sen, String subStr, String repSubStr) {
    String newSentence;
    String sen1 = sen.trim();
    int output = sen1.indexOf(subStr);
    if(output >= 0) {
      newSentence = sen1.replace(subStr, repSubStr);
      return newSentence;
    } else {
      return "no sub string found...";
    }
  }
}

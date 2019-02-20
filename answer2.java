import java.util.Scanner;

class Count {
  private static Scanner sc;
  private static String str;
  private static String str1;
  private static int wrc = 1;

  // List<String> list = Arrays.asList(text.split(" "));
  //
  //       Set<String> uniqueWords = new HashSet<String>(list);
  //       for (String word : uniqueWords) {
  //           System.out.println(word + ": " + Collections.frequency(list, word));
  //       }

  public static void main(String arg[]) {
    System.out.println("Enter the required Stirng: ");
    sc = new Scanner(System.in);
    str = sc.nextLine();
    countOccurances(str);
  }

  static void countOccurances(String string) {
    str1 = string.trim();
    String[] words = str1.split(" ");

    for(int i=0; i<words.length; i++)		//Outer loop for Comparison
		{
			for(int j=i+1; j<words.length; j++)	//Inner loop for Comparison
			{
			     if(words[i].equals(words[j]))	//Checking for both strings are equal
				       {
          					wrc=wrc+1;				//if equal increment the count
          					words[j]="0";			//Replace repeated words by zero
				        }
			}
			if(words[i]!="0")
			System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
			wrc=1;

    }

  }
}

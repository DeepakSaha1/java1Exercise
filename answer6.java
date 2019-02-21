import java.util.*;
class UniqueElement {
  static int singleNumber(int a[], int n) {
  TreeSet<Integer> s = new TreeSet<Integer>();
  for (int i : a)
    s.add(i);
  int arr_sum = 0;//sum of array

  for (int i : a)
    arr_sum += i;

  int set_sum = 0;//sum of set

  for (int i : s)
    set_sum += i;

    return (2 * set_sum - arr_sum);
  }

  public static void main(String[] args) {
    int a[] = {1, 2, 4, 1, 2};
    for(int b : a)
      System.out.print(b + " ");
    System.out.println();
    int n = a.length;
    System.out.println("The element with single " + "occurrence is " + singleNumber(a, n));
  }
}

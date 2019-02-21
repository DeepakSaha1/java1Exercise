class CommonElementsInArray {
  public static void main(String arg[]){
    int[] arr1 = {4,7,3,9,2};
    int[] arr2 = {3,2,12,9,40,32,4};
    for(int a : arr1)
      System.out.print(a + " ");
    System.out.println();
    for(int b : arr2)
      System.out.print(b + " ");
    System.out.println();
    System.out.println("Common array elements: ");
    for(int i=0; i<arr1.length; i++) {
      for(int j=0; j<arr2.length; j++) {
          if(arr1[i]==arr2[j])
            System.out.print(arr1[i] + " ");
      }
    }
  }
}

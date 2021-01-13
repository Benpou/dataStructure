package GenericPractice;

public class GenericSort {

  public static void main(String[] args) {
    Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};

    Character[] chatArray = {new Character('K'), new Character('a'), new Character('J'), new Character('r')};

    Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};

    String[] stringArray = {"Tom", "Susan", "Kim", "Abas"};

    //sort array
    //sort(intArray);
    //sort(chatArray);
    //sort(doubleArray);
    sort(stringArray);

    System.out.println("Sorted Integer Object:" + intArray);
    System.out.println("Sorted character object" + chatArray);
    System.out.println("Sorted double object" + doubleArray);
    System.out.println("Sorted string Object" );
    printList(stringArray);
  }

  public static <E extends Comparable<E>> void sort(E[] list) {
    E currentMin;
    int currentMinIndex;

    for (int i =0; i < list.length -1; i++) {
      //find the min in the list
      currentMin = list[i];
      currentMinIndex = i;

      for(int j=i+1; j < list.length; j++ ) {
        if (currentMin.compareTo(list[j]) > 0) {
          currentMin = list[j];
          currentMinIndex = j;
        }

      }
    //swap list[i] with list[currentMinIndex] if needed
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
  public static void printList(Object[] list) {
    for (int i =0; i< list.length; i++ ){
      System.out.print(list[i] + " ");
      System.out.println();
    }
  }
}

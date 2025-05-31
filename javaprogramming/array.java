public class array {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);    
    }
     System.out.println(cars.length);
}
}



//===========================for-each loop======================

/*public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "tata"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
} */


/*-----------------------multi-dimention----------------------- */
/*public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int[] row : myNumbers) {
      for (int i : row) {
        System.out.println(i);
      }
    }
  }
} */

class Recursion {
    //write a functions that finds the factorial of any number. It should demonstrate recursion.
    // 5! = 120.
    
  public static int findFactorialRecursive(int number){
      if (number == 2){
        return 2;
      }
      return number * findFactorialRecursive(number - 1);
  }

  public static void main(String[] args) {

      System.out.println(findFactorialRecursive(5));
  }

}

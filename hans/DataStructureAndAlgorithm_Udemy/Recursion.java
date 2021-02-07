
class Recursion {
// 5! = 5*4*3*2*1
// 5 * factorial(4)
// 5 * 4 * factorial(3)
  static int findFactorialRecurisve(int number) {
    if(number == 1) return number;

    return number * findFactorialRecurisve(number-1);
  }

  static int findFactorialIterative(int number) {
    int factorial = 1;
    int counter = number;
    for(int i=0; i<counter; i++) {
        factorial *= number;
        number--;
    }
    return factorial;
  }
}
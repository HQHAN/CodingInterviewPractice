import java.util.List;

class Main {
  public static void main(String[] args) {
    // LinkedList linkedList = new LinkedList("head");
    // linkedList.append("next1");
    // linkedList.append("next2");
    // linkedList.append("next3");
    // linkedList.append("next4");

    // linkedList.prepend("prepend1");
    // linkedList.prepend("prepend2");

    // linkedList.insert(6, "insert1");
    // linkedList.remove(6);

    // linkedList.reverse();
   
    // ListItem item = linkedList.head;
    // while( item != null) {
    //   System.out.println(item.value);
    //   item = item.next;
    // }

    // Stack stack = new Stack();
    // stack.push("google");
    // stack.push("Udemy");
    // stack.push("Discord");

    // while(stack.length > 0) {
    //   System.out.println(stack.pop().value);
    // }

    // MyQueue q = new MyQueue();
    //  System.out.println(q.peek());
    // q.push(1);
    // q.push(2);
    // q.push(3);
    // System.out.println(q.peek());

    // while(q.empty() == false) {
    //   System.out.println(q.pop());
    // }

    // System.out.println(q.peek());
    // System.out.println(Recursion.findFactorialRecurisve(5));

     

     System.out.println(reverseString("yoyo mastery"));
      //should return: 'yretsam oyoy'

      Integer[] input = new Integer[] {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
      // new Sort().bubbleSort(input);
      new Sort().quickSort(input, 0, input.length-1);
      for(int i : input) {
        System.out.println(i);
      }
      
  }

       //Implement a function that reverses a string using iteration...and then recursion!
      static String reverseString(String input) {
        if(input.length() == 1) {
          return input;
        }
        return reverseString(input.substring(1)) + input.charAt(0);

      }

}


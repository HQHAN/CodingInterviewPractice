class Node {
  public String value;
  public Node next;

  public Node(String value, Node next) {
    this.value = value;
    this.next = next;
  }
}


class Stack {
  public Node top;
  public Node bottom;
  public int length;

  public Stack() {

  }

  public void push(String value) {
     Node node = new Node(value, null);
    if(length == 0) {
      top = node;
      bottom = node;
    } else {
      Node prevTop = top;
      top = node;
      node.next = prevTop;
    }
    length++;
  }

  public Node pop() {
    if(top == null) return null;

    if(top == bottom) {
      bottom = null;
    }
    
    Node currentTop = top;
    Node nextToTop = top.next;
    top = nextToTop;
    length--;
    return currentTop;
  }

  public Node peek() {
    return top;
  }

  //isEmpty
}
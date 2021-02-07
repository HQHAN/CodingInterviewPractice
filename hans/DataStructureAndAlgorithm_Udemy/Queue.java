


class Queue {
  public Node first;
  public Node last;
  public int length;

  public Queue() {

  }

  public void enqueue(String value) {
     Node node = new Node(value, null);
    if(length == 0) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = node;
    }
    length++;
  }

  public Node dequeue() {
    if(first == null) return null;

    if(first == last) {
      last = null;
    }
    Node currentFirst = first;
    first = first.next;
    length--;
    return currentFirst;
  }

  public Node peek() {
    return first;
  }

  //isEmpty
}
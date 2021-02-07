class LinkedList {
  public ListItem head;
  public ListItem tail;
  public int length;
  public LinkedList(String headValue) {
    head = new ListItem(headValue, null, null);
    tail = head;
    length = 1;
  }

  public void append(String value) {
    if(tail != null) {
      ListItem item = new ListItem(value, tail, null);
      tail.next = item;
      tail = item;
      length++;
    }
  }

  public void prepend(String value) {
     ListItem item = new ListItem(value, null, head);
     head.before = item;
     head = item;
     length++;
  }

  public void insert(int index, String value) {
    ListItem item = new ListItem(value, null, null);
    if(index == 0) {
      prepend(value);
    } else if(index >= length) {
      append(value);
    } else {
      int counter = 0;
      ListItem replaceableNode = head;
      ListItem preReplaceableNode = null;
    
      while(replaceableNode != null) {
        if(counter == index) break;
        preReplaceableNode = replaceableNode;
        replaceableNode = replaceableNode.next;
        counter++;
      }

      if(preReplaceableNode != null) {
          preReplaceableNode.next = item;
          item.before = preReplaceableNode;
      }
      item.next = replaceableNode;
      replaceableNode.before = item;
    }
    length++;
  }

  public void remove(int index) {
    if(length == 0) return;
    if(length == 1) {
      head = null;
      tail = null;
      return;
    }

    if(index == 0) {
      head = head.next;
      head.before = null;
    } else if(index >= length - 1) {
       ListItem beforeTailItem = findItem(length-2);
       beforeTailItem.next = null;
       tail = beforeTailItem;
    } else {
      ListItem beforeItem = findItem(index-1);
      ListItem removableItem = beforeItem.next;
      beforeItem.next = removableItem.next;
      removableItem.next.before = beforeItem;
    }
    length--;
  }

  public void reverse() {
   ListItem current = head;
   ListItem previous = null;
   ListItem temp = null;
   tail = head;

   while(current != null) {
     temp = current.next;
     current.next = previous;
     previous = current;
     current = temp;
   }
   head = previous;   
  }
  
  private ListItem findItem(int index) {
    ListItem current = head;
    int count = 0;
    while(current != null) {
      if(count == index) break;
      current = current.next;
      count++;
    }
    return current;
  } 
}

class ListItem {
  public String value;
  public ListItem next;
  public ListItem before;

  public ListItem(String value, ListItem before, ListItem next) {
    this.value = value;
    this.before = before;
    this.next = next;
  }
}
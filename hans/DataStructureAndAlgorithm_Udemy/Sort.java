import java.util.ArrayList;
import java.util.List;


import java.util.Arrays;

class Sort {
  Sort() {}

  public void bubbleSort(int[] arry) {
    for(int i=0; i<arry.length; i++) {
      for(int j=0; j<arry.length ; j++) {
        if(j == arry.length -1) continue;
        
        if(arry[j] > arry[j+1]) {
          int temp = arry[j];
          arry[j] = arry[j+1];
          arry[j+1] = temp;
        }
      }
    }  
  }

  public void selectionSort(int[] arry) {
    int minIndex = 0;
    
    for(int i=0; i<arry.length; i++) {
      int currentMinValue = arry[i];

      for(int j=i+1; j<arry.length ; j++) {
        if(arry[j] < currentMinValue) {
          currentMinValue = arry[j];
          minIndex = j;
        }
      }

      int temp = arry[i];
      arry[i] = arry[minIndex];
      arry[minIndex] = temp;
    }
  }

  public List<Integer> insertionSort(int[] array) {
    ArrayList<Integer> list = new ArrayList();
    for(int i : array) {
      list.add(i);
    }

    for(int i=0; i<list.size(); i++) {
      int currentItem = list.get(i);
      if(currentItem < list.get(0)) {
        list.remove(i);
        list.add(0, currentItem);
      } else {
        for(int j=1; j<i; j++) {
          if(currentItem > list.get(j-1) && currentItem < list.get(j)) {
            list.remove(i);
            list.add(j, currentItem);
          }
        }
      }
    }

    return list;
  }

  public List<Integer> mergeSort(Integer[] array) {
		if(array.length == 1) {
			return Arrays.asList(array);
		}

		// split the array by half
		int middle = array.length / 2;
		Integer[] left = Arrays.copyOfRange(array, 0, middle);
		Integer[] right = Arrays.copyOfRange(array, middle, array.length);

		return merge(
				mergeSort(left),
				mergeSort(right)
		);
	}

	private List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> list = new ArrayList();
		int leftIndex = 0;
		int rightIndex = 0;

		while(leftIndex < left.size() && rightIndex < right.size()) {
			if(left.get(leftIndex) < right.get(rightIndex)) {
				list.add(left.get(leftIndex));
				leftIndex++;
			} else {
				list.add(right.get(rightIndex));
				rightIndex++;
			}
		}

		list.addAll(left.subList(leftIndex, left.size()));
		list.addAll(right.subList(rightIndex, right.size()));

		return list;
	}

  public void quickSort(Integer[] array, int start, int end) {
      if(start >= end) return;

      int pivotIndex = partition(array, start, end);

      quickSort(array, start, pivotIndex-1);
      quickSort(array, pivotIndex+1, end);

    return;
  }

  private int partition(Integer[] arry, int start, int end) {
    int partitionIndex = start;
    int pivotValue = arry[end];

    for(int i=start; i<end; i++) {
      if(arry[i] < pivotValue) {
        swap(arry, i, partitionIndex);
        partitionIndex++;
      }
    }
    swap(arry, partitionIndex, end);

    return partitionIndex;
  }

  private void swap(Integer[] arry, int a, int b) {
    int temp = arry[a];
    arry[a] = arry[b];
    arry[b] = temp;
  }
}
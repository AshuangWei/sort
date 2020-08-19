package com.sort;

import com.sort.bubble.BubbleSortService;
import com.sort.insertion.InsertionSortService;
import com.sort.selection.SelectionSortService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    BubbleSortService bubbleSortService = new BubbleSortService();
    bubbleSortService.bubbleSort();

    SelectionSortService selectionSortService = new SelectionSortService();
    selectionSortService.selectionSort();

    InsertionSortService insertionSortService = new InsertionSortService();
    insertionSortService.insertionSort();
  }

}

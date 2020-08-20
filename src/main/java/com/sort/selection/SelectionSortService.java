package com.sort.selection;

import java.time.ZonedDateTime;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class SelectionSortService {

  public void selectionSort() {
    int[] array = IntStream.range(1, 100001).map(i -> new Random().nextInt(100000)).toArray();
    long startEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    //System.out.println(Arrays.toString(array));
    System.out.println("选择排序start：" + startEpochMilli);
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      int temp = array[min];
      array[min] = array[i];
      array[i] = temp;
    }
    long endEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    System.out.println("选择排序end：" + endEpochMilli);
    //System.out.println(Arrays.toString(array));
    System.out.println("选择排序耗时：" + (endEpochMilli - startEpochMilli));
  }

}

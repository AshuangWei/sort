package com.sort.insertion;

import java.time.ZonedDateTime;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class InsertionSortService {

  public void insertionSort() {
    int[] array = IntStream.range(1, 100001).map(i -> new Random().nextInt(100000)).toArray();
    long startEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    //System.out.println(Arrays.toString(array));
    System.out.println("插入排序start：" + startEpochMilli);
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      for (int j = i; j > 0; j--) {
        if (temp < array[j - 1]) {
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
    }
    long endEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    System.out.println("插入排序end：" + endEpochMilli);
    // System.out.println(Arrays.toString(array));
    System.out.println("插入排序耗时：" + (endEpochMilli - startEpochMilli));
  }
}

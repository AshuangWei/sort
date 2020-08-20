package com.sort.bubble;

import java.time.ZonedDateTime;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class BubbleSortService {

  public void bubbleSort() {
    int[] array = IntStream.range(1, 10001).map(i -> new Random().nextInt(10000)).toArray();
    long startEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    //System.out.println(Arrays.toString(array));
    System.out.println("冒泡排序start：" + startEpochMilli);
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    long endEpochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
    System.out.println("冒泡排序end：" + endEpochMilli);
    //System.out.println(Arrays.toString(array));
    System.out.println("冒泡排序耗时：" + (endEpochMilli - startEpochMilli));
  }
}

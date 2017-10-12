import java.util.*;
import java.lang.*;
import java.io.*;

class tappingWater {
 
 public static int maxwaterBetweenTowers(int[] arr) {
 int max_so_far = 0;
 
 int[] maxRight = new int[arr.length];
 int maxLeft = 0;
 
 int rainwater = 0;
 
 for (int i = arr.length - 1; i >= 0; i--) {
    if (arr[i] > max_so_far) {
        max_so_far = arr[i];
    } 
    maxRight[i] = max_so_far;
 }
 System.out.println(Arrays.toString(arr));
 System.out.println(Arrays.toString(maxRight));
 
 for (int i = 0; i < arr.length; i++) {
	// System.out.println("min--"+Integer.min(maxLeft, maxRight[i]));
     rainwater = rainwater + Integer.max(Integer.min(maxLeft, maxRight[i]) - arr[i], 0);
    System.out.println(rainwater);
     if (arr[i] > maxLeft) {
         maxLeft = arr[i];
        }
 }
 
 return rainwater;
 }
 
 public static void main(String[] args) {
 int[] towerHeight = { 3, 0, 0, 2, 0, 4};
 //int[] towerHeight = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
 System.out.println(maxwaterBetweenTowers(towerHeight));
 }
}
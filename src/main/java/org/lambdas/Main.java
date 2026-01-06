package org.lambdas;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
//        // Example 1
//        int[] nums1 = {2, 7, 11, 15};
//        int target1 = 9;
//        System.out.println("Input: " + Arrays.toString(nums1) + ", Target: " + target1);
//        System.out.println("Output: " + Arrays.toString(twoSum(nums1, target1)));
//
//        // Example 2
//        int[] nums2 = {3, 2, 4};
//        int target2 = 6;
//        System.out.println("Input: " + Arrays.toString(nums2) + ", Target: " + target2);
//        System.out.println("Output: " + Arrays.toString(twoSum(nums2, target2)));
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i<nums.length ; i++){
//			int complement = target - nums[i];
//			if(map.containsKey(complement)){
//				return new int[] {map.get(complement), i};
//			}
//			map.put(nums[i], i);
//		}
//
//		throw new IllegalArgumentException("No two sum solution found");

//	    ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
//
//	    AtomicBoolean found = new AtomicBoolean(false);
//
//		char character = JOptionPane.showInputDialog("Input a character").charAt(0);
//	    Runnable thread1 = () -> {
//			try{
//				Thread.currentThread().setName("Thread-character");
//				for (char i = 'a'; i <= 'z'; i++){
//					if(i == character){
//						found.set(true);
//						System.out.println("thread 1 finish");
//						System.out.println("the character is: " + character);
//					}
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//	    };
//
//		Runnable thread2 = () -> {
//			try {
//				Thread.currentThread().setName("Thread-count");
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//		};
//
//		executor.submit(thread1);
//		executor.submit(thread2);

	}
}

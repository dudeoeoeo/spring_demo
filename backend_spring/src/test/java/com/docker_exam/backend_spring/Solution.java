package com.docker_exam.backend_spring;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import com.fasterxml.jackson.core.TreeNode;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
	
	public static void plusMinus(List<Integer> arr) {
		// Write your code here
        double[] num_arr = new double[3];
        for(Integer num : arr) {
            if(num == 0) num_arr[0]++;
            else if(num > 0) num_arr[1]++;
            else num_arr[2]++;
        }
        int size = arr.size();
        System.out.println(String.format("%.6f", (num_arr[0]/size)));
        System.out.println(String.format("%.6f", (num_arr[1]/size)));
        System.out.println(String.format("%.6f", (num_arr[2]/size)));
    }

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		long min = Long.MAX_VALUE;
		long max = 0;
		
		long sum = 0;
		for(Integer num : arr) {
			sum += num;
			min = Math.min(min, num);
			max = Math.min(max, num);
		}
		System.out.printf((sum - max)+" "+(sum - min));
    }
	
	public static String timeConversion(String s) {
		// Write your code here
		int len = s.length();
		String hour = s.substring(0,2);
		s = s.replace("AM", "");
		
		if(s.length() < len) {
			if(hour.equals("12")) {
				s = s.replace("12", "00");
			} 
			return s;
		} else {
			if(!hour.equals("12")) {
				int hh = Integer.parseInt(hour)+12;
				s = s.replace(hour, String.valueOf(hh));
			}
			s = s.replace("PM", "");
			return s;
		}
    }
	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int left = 0;
		int right = 0;
		int idx = 0;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).size() < arr.get(arr.size()-1).size()) continue;
			int size = arr.get(i).size()-1;
			left += arr.get(i).get(idx);
			right += arr.get(i).get(size-idx);
			idx++;
		}
		
		return Math.abs(left-right);
	}

	public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        int [][] ar = {{3}, {11,2,4}, {4,5,6}, {10,8,-12}};
        for(int i=0; i<ar.length; i++) {
        	arr.add(new ArrayList<Integer>());
        }
        for(int i=0; i<ar.length; i++) {
        	for(int j=0; j<ar[i].length; j++) {
        		arr.get(i).add(ar[i][j]);
        	}
        }
        //int re = Solution.diagonalDifference(arr);
	}
	
	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here
		int [] num_arr = new int[arr.size()];
		List<Integer> sorted = new ArrayList<Integer>();
		for(int i=0; i<arr.size(); i++) {
			num_arr[arr.get(i)]++;
		}
		for(int i=0; i<num_arr.length; i++) {
			sorted.add(num_arr[i]);
		}
		return sorted;
    }
}











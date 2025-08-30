package org.example.demotest;

import java.util.HashSet;
import java.util.Set;

public class test01 {
    public static void main(String[] args) {
//        int[] nums = {1, 4, 5, 3, 2};
//        System.out.println(findMin(nums));
//        System.out.println(nums.length);
//        System.out.println(nums.length);

        //System.out.println(minMaxDifference(11891));
        System.out.println(minimizedStringLength("aabccbc"));
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid:"+mid);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }


    public static int minMaxDifference(int num) {
        String s = Integer.toString(num);
        String t = s;
        int pos = 0;
        while (pos < s.length() && s.charAt(pos) == '9') {
            pos++;
        }
        if (pos < s.length()) {
            s = s.replace(s.charAt(pos), '9');
        }
        t = t.replace(t.charAt(0), '0');
        return Integer.parseInt(s) - Integer.parseInt(t);
    }

    public static int minimizedStringLength(String s) {
        Set<Character> charSet = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            charSet.add(c);
        }
        for (char c : charSet){
            sb.append(c);
        }
        System.out.println(sb.toString());
        return charSet.size();
    }

}

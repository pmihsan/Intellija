package leetcode;

import java.util.Arrays;

public class MediantwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(getMedian(nums1, nums2));
    }

    public static double getMedian(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
        double median;
        if(arr.length % 2 == 0){
            median = arr[arr.length/2 - 1] + arr[arr.length/2];
            median /= 2;
        }
        else{
            median = arr[arr.length/2];
        }
        return median;
    }
}

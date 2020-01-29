package mergesort;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
            int[] arr = {7,3,8,9,5};
            mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;
        if(length<2) return;

        int mid = length/2;
        int rest = length - mid;

        int[] left = new int[mid];
        int[] right = new int[rest];

        for(int i=0;i<mid;i++){
            left[i] = arr[i];
        }

        for(int i=mid;i<arr.length;i++){
            right[i-mid] = arr[i];
        }

        System.out.println("left="+Arrays.toString(left));
        System.out.println("right="+Arrays.toString(right));

        mergeSort(left);
        mergeSort(right);
        mergeSort(arr, left, right);
    }

    public static void mergeSort(int[] arr, int[] left, int[] right){

        int leftIndex=0,rightIndex=0,mergeIndex=0;

        while(leftIndex<left.length && rightIndex<right.length){
            if(left[leftIndex]<=right[rightIndex]){
                arr[mergeIndex++] = left[leftIndex++];
            }else{
                arr[mergeIndex++] = right[rightIndex++];
            }
        }

        while(leftIndex<left.length ){
            arr[mergeIndex++] = left[leftIndex++];
        }

        while(rightIndex<right.length ){
            arr[mergeIndex++] = right[rightIndex++];
        }

        System.out.println("after merge="+Arrays.toString(arr));
    }
}

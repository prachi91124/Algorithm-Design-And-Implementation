import java.util.Scanner;

public class bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int [] arr = new int[6];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        int ans = binarysearch(arr, target, 0, arr.length-1);

        if(ans == -1){
            System.out.println("Target doesn't exists");
        }
        else{
            System.out.println("Target exists at " + ans);
        }


    }
    static int [] sort(int[]arr){
        for(int i = 0; i< arr.length; i++){
            for(int j  = 0; j < arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }
        return arr;
    }
    static int binarysearch(int [] arr, int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target){
            return binarysearch(arr, target, mid+1, end);
        }  
        if(arr[mid] > target){
            return binarysearch(arr, target, start, mid-1);
        }
        return -1;
    }
}

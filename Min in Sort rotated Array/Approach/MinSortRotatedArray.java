//Approach (Binary Search)

import java.util.*;

class solution1{
    public  int MinRotatedArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        int max=n-1;
        while (min<max) {
            int mid=(min+max)/2;
           if(arr[mid]>arr[max]){
            min=mid+1;
           }
           else{
            max=mid;
           }
        }
       System.out.println(Arrays.toString(arr));
       return arr[min];
    }
}

public class MinSortRotatedArray{
    public static void main(String[] args) {
        solution1 obj=new solution1();
        System.out.println(obj.MinRotatedArray());
    }
}
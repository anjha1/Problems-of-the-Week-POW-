//Approach (Linear Search):

import java.util.*;

class solution{
    public  int MinRotatedArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min =arr[i];
            }
        }

        return min;
    }
}

public class MinSortRotatedArray1{
    public static void main(String[] args) {
        solution obj=new solution();
        System.out.println(obj.MinRotatedArray());
    }
}
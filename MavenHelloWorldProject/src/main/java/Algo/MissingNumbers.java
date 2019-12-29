package Algo;

public class MissingNumbers {
    int arr[] = { 1, 2, 4, 5, 6 };
    public MissingNumbers(){
        int n= arr.length;
        int total = (n *(n+1))/2;
        int totalValue=0;
        for(int i=0;i<arr.length;i++){
            totalValue+=arr[i];
        }
        int finalVal= totalValue-total;
        System.out.println("final value"+finalVal);
    }
}

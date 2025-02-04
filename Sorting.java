import java.util.Arrays;
public class Sorting{
    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]) small=j;
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void bubbleSort(int [] brr){
        for(int i=0;i<brr.length-1;i++){
            for(int j=0;j<brr.length-i-1;j++){
                if(brr[j+1]<brr[j]){
                    int temp=brr[j+1];
                    brr[j+1]=brr[j];
                    brr[j]=temp;
                }
            }
        }
    }
    public static void insertionSort(int [] crr){
        for(int i=1;i<crr.length;i++){
            int curr = crr[i];
            int j=i-1;
            while(j>=0 && curr<crr[j]){
                crr[j+1] = crr[j];
                j--;
            }
            crr[j+1]=curr;
        }
    }
    public static void printArray(int [] brr){
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
    public static void main(String [] args){
        int [] brr = {8,3,6,4,2,7};
        bubbleSort(brr);
        System.out.print("bubbleSort: ");
        printArray(brr);
        int [] arr={8,3,6,4,2,7};
        selectionSort(arr);
        System.out.println();
        System.out.print("selectionSort: ");
        printArray(arr);
        int [] crr={8,3,6,4,2,7};
        insertionSort(crr);
        System.out.println();
        System.out.print("insertionSort: ");
        printArray(crr);
    }
}
package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={22,3,4,5,1,24};
        //Insertion Sort
        for(int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

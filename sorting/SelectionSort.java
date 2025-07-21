package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={13,53,2,12,4};
        //Selection Sort
        for(int i=0;i<a.length-1;i++){
            int small=i;
            for(int j=i+1;j<a.length;j++){
                if(a[small]>a[j]){
                    small=j;
                }
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

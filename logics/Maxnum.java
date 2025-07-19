package logics;

public class Maxnum {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum number in array is "+max);
    }
}

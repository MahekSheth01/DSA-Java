package logics;

public class Maxnum {
    public static void main(String args[]){

        int a[]={1,55,4,3,22};
        int max=a[0];
        int secmax=a[0];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i]>max){
                max=a[i];
            }
        }
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=max){
                a[i]=secmax;
                found=true;
                break;
            }
        }
        if(found){
            for(int i=0;i<a.length;i++){
                if(a[i]!=max && a[i]>secmax){
                    secmax=a[i];
                }
            }
        }
        System.out.println("Maximum number is "+secmax);
    }
}
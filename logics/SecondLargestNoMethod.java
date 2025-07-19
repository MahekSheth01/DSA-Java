package logics;
public class SecondLargestNoMethod{
    public static void main(String[] args) {
        int a[]={23,78,5,422,245};
        int max=a[0];
        int smax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=max){
                smax=a[i];
                found=true;
                break;
            }
        }
        if(found){
            for(int i=0;i<a.length;i++){
                if(a[i]!=max && a[i]>smax){
                    smax=a[i];
                }
            }
            System.out.println(smax);
        }
        else{
            System.out.println("No second largest number");
        }
    }
}
package logics;
public class Practice {
    public static void main(String[] args) {
        // int[] arr={2,3,4,5,6};
        // int max=arr[0];
        // int secmax=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         secmax=max;
        //         max=arr[i];
        //     }
        //     if(arr[i]>secmax && arr[i]!=max){
        //         secmax=arr[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(secmax);
        // int num=153;
        // int temp=num;
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     sum+=digit*digit*digit;
        //     num=num/10;
        // }
        // if(temp==sum){
        //     System.out.println("Armstrong");
        // }
        // else{
        //     System.out.println("Not");
        // }
        // int num=10;
        // int temp=num;
        // int sum=0;
        // while(num>0){
        //     int r=num%10;
        //     sum=sum*10+r;
        //     num=num/10;
        // }
        // if(temp==sum){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not");
        // }
        // int num=4;
        // boolean isPrime=true;
        // if(num<=1){
        //     System.out.println("Not Prime");
        // }
        // for(int i=2;i<num/2+1;i++){
        //     if(num%i==0){
        //         isPrime=false;
        //         break;
        //     }
        // }
        // if(isPrime==true){
        //     System.out.println("Prime");
        // }
        // else{
        //     System.out.println("Not Prime");
        // }
        // int n=10;
        // int a=0;
        // int b=1;
        // for(int i=0;i<=n;i++){
        //     System.out.println(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        // }
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);
        // String str="PHP";
        // String temp="";
        // for(int i=str.length()-1;i>=0;i--){
        //     temp+=str.charAt(i);
        //     // System.out.print(str.charAt(i));
        // }
        // if(str.equals(temp)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not");
        // }
        // int n=124;
        // int sum=0;
        // while(n>0){
        //     int r=n%10;
        //     sum=sum+r;
        //     n=n/10;
        // }
        // System.out.println(sum);
        int[] arr={12,3,3,4,5,2,3};

        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]);
        }

        int[] temp=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int k=0;k<j;k++){
                if(arr[i]==temp[k]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[j++]=arr[i];
            }
        }
        System.out.println("-------------");
        for(int i=0;i<j;i++){
            System.out.println(temp[i]);
        }

        


    }
}

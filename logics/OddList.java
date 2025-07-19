package logics;
import java.util.ArrayList;
import java.util.List;

public class OddList {
    public static void main(String args[]){
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(88);
        l1.add(7);
        int oddcount=0;
        int evencount=0;
        System.out.println(l1);
        for(int num:l1){
            if(num%2==0){
                System.out.println("Even number: "+num);
                evencount++;
            }
            else{
                System.out.println("Odd number: "+num);
                oddcount++;
            }
        }
        System.out.println("Even number count : "+evencount);
        System.out.println("Odd number count : "+oddcount);
    }
}

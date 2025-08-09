public class Practice {
// *
// * * 
// * * *
// * * * *
// public static void main(String args[]){
// 	int n=4;
// 	for(int i=1;i<=n;i++){
// 		for(int j=1;j<=i;j++){
// 			System.out.print("*");
// 		}
// 		System.out.println();

// 	}
// }

// 2.
// *****
// *****
// *****
// *****

// public static void main(String args[]){
//     int n=4;
//     int m=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=m;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }

// 3.
// *****
// *   *
// *   *
// *****

// public static void main(String args[]){
//     int n=4;
//     int m=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=5;j++){
//             if(i==1||i==n||j==1||j==m){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
            
//         }
//         System.out.println();
//     }
// }

// 4.
// //    ****
// //    ***
// //    **
// //    *

// public static void main(String args[]){
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=n;j>=i;j--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }

// 5.
// 12345
// 1234
// 123
// 12
// 1

// public static void main(String args[]){
//     int n=5;
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
// }

// 5.
// 1
// 23
// 456
// 7890

public static void main(String args[]){
    int n=5;
    int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+"");
            num++;
        }
        System.out.println();
    }
}


}

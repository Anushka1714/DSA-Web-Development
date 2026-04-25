public class patterns {
    public static void main(String args[]){


// print star pattern
        //  for(int line=1 ; line <= 5 ; line++){
        //     for(int star=1;star <= line ;star++){
        //         System.out.print("*");
        //     }
        //    System.out.println();
        //  }


// inverted star pattern
// int n=4;
//          for (int line = 1 ; line<=n ; line++){
//             for(int star=1 ; star <= (n-line+1) ; star++){
//                 System.out.print("*");
//             }
//             System.out.println(); 
//          }




// print half pyramid pattern
            // for(int i=1 ; i<=5 ; i++){
            //     for(int j=1 ; j<=i ; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }



// Print character pattern 
// char ch ='A';
// for(int i=1 ; i<=6; i++){
//     for(int j = 1;j<=i;j++){
//         System.out.print(ch);
//         ch++;

//     }
//     System.out.println();
// }




// hollow rectangle
// for (int i = 1; i <=4;i++){
//     // inner columns
//     for( int j= 1; j<=5;j++){
//         // cell - (i,j)
//         if(i==1 || i == 4||j==1||j==5){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }

//     }
//     System.err.println();
// }



// inverted and rotated half- pyramid
//    for(int i=1;i<=4;i++){
//     for(int j=1;j<=(4-i);j++){
//         System.out.print(" ");

//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//    }


// inverted half pyramid with numbers
    //   for(int i=1;i<=5;i++){
    //     for(int j=1;j<=(5-i+1);j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //   }


// floyd's triangle
//    int  count=0; 
    // int  count=1;
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(count);
    //         count++;
    //          System.out.print(" ");
    //     }
       
    //     System.out.println();
    // }


// 0-1 triangle
    //  for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j) % 2 == 0){
    //             System.err.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    //  }


// butterfly paatern
//   for(int i=1;i<=4;i++){
//      for(int j=1;j<=i;j++){
//          System.out.print("*");
//      }
//      for(int k=1;k<=2*(4-i);k++){
//         System.out.print(" ");

//      }
//      for(int j=1;j<=i;j++){
//         System.out.print("*");
//      }
//      System.out.println();
//   }

// //   2nd half
//  for(int i=4;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     for(int k =1;k<=2*(4-i);k++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }
 



//  solid rhombus
//    for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=5;j++){
//         System.out.print("*");

//     }
//     System.out.println();
//    } 



// hollow rhombus
//  for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=5;j++){
//         if(i==1||i==5||j==1||j==5){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }

//     }
//     System.out.println();
//  }


// diamond pattern
for(int i=1;i<=4;i++){
    for(int j=1;j<=4-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=(2*i)-1;j++){
        System.out.print("*");
    }
    // for(int j=1;j<=4-i;j++){
    // System.out.println(" ");
    // }
    System.out.println();
}
// 2nd half
for(int i=4;i>=1;i--){
    for(int j=1;j<=4-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=(2*i)-1;j++){
        System.out.print("*");
    }
    // for(int j=1;j<=4-i;j++){
    // System.out.println(" ");
    // }
    System.out.println();
}
}
} 
 



// public static void diamond_pattern(int n){
//     // 1st half
//     for(int i=1;i<=n;i++){
//         // spaces
//         for(int j=1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         // stars
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// // 2nd half
//     for(int i=n;i>=1;i--){
//         // spaces
//           for(int j=1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         // stars
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     diamond_pattern(4);
// }

// }
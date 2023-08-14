package com.binarySearch;
//
//
//import java.util.Arrays;
//
//public class Array2D {
//    public static void main(String[] args) {
//     int [][] matrix= {{1,2,3},
//                       {4,5,6},
//                       {7,8,9}};
//        System.out.println(Arrays.toString(ArraySearch2D(matrix,6)));
//    }
//    static int[] Binarysearch(int[] row , int rowNo1,int rowNo2, int target , int start, int end)
//    {
//        while(start<=end)
//        { int mid = start + (end-start)/-2;
//              if (target==row[mid])
//            {
//                return  new int [] {rowNo1,mid};
//            }
//              if (target<row[mid])
//                end=mid-1;
//              else
//                  start=mid+1;
//
//        }
//        return new int [] {-1,-1};
//
//
//    }
//   static int [] ArraySearch2D(int[][] matrix, int target)
//   {
//       int start=0;
//       int end=matrix.length;
//       int mid;
//       while(start<=end)
//       { mid = start + (end-start)/-2;
//           if (target==matrix[mid][0])
//               return new int [] {0,0};
//           if (target<=matrix[mid][0])
//               end=mid-1;
//           if (target>matrix[mid][0])
//               start=mid;
//
//       }
//
//
//
//
//   }
//
//
//}

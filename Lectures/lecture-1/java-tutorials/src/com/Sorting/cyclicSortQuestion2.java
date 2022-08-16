package com.Sorting;
//Google
public class cyclicSortQuestion2 {
    public static void main(String[] args) {
        int [] arr={ 3, 1,5};

    }
    static void swap(int [] arr,int first ,int second)
    {int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;


    }
    static void  cyclicSort(int [] arr)
    {
        int i=0;
        int correct;
        while(i< arr.length)
        {correct=arr[i]-1;
          if(correct< arr.length && arr[i]!=arr[correct] )
          {swap(arr,i,correct);

          }
          else
              i++;

        }
    }
    static int [] solution(int [] arr)
    { cyclicSort(arr);
      int i=0;
      while (i< arr.length)
      { if ((arr[i]-1)!=i)
          arr.


      }

    }
}

package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/

public class Solution {




    public static long[] getNumbers(long N) {
        long[][] Degrees=new long[10][20];
        int[] digits=new int[20];
        int len=1;

            for (int l = 0; l <10 ; l++) {

                for (int k = 0; k < 20; k++) {
                    Degrees[l][k] = (long) Math.pow(l, k);
                }
            }


        if (N<=0){
            return new long[0];
        }
        digits[0]=1;
        ArrayList<Long> list=new ArrayList<>();

        for (long i = 1; i <N ; i++) {
            long res=0;
            for (int j = 0; j <len ; j++) {
                res+=Degrees[digits[j]][len];
            }
            if (res==i)
                list.add(res);

            for (int z = 0; z <20 ; z++) {
                if (++digits[z]<10)
                {
                    if (z>=len){
                        len=z+1;
                    }
                    break;
                }
                else
                {
                    digits[z]=0;

                }
            }
        }
        long[] result = new long[list.size()];
        for (int i = 0; i <list.size() ; i++) {result[i]=list.get(i);
       }
        Arrays.sort(result);
        return result;
    }


    public static void main(String[] args) {
        long[] temp =getNumbers(7);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);

        }

    }
}

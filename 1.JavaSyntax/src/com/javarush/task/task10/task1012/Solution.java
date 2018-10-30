package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        HashMap<String,Integer> map=new HashMap<>();
        class Alphabet{

            public Alphabet(String s)
            {
                for (int i = 0; i < s.length(); i++) {
                    map.put(s.substring(i,i+1),0);
                }
            }
            public void incC(String s)
            {
                int temp=0;
                if (map.containsKey(s))
                     temp=map.get(s);

                map.put(s,++temp);
            }
            public void getAlphabet(String s){
                for (int i = 0; i < s.length(); i++) {
                    System.out.println(s.substring(i,i+1)+" "+map.get(s.substring(i,i+1)));
            }

        }
        }
        Alphabet alphabet1=new Alphabet(abc);
        for (int i = 0; i <10 ; i++) {
            String tmp=list.get(i);
            for (int j = 0; j <tmp.length() ; j++) {
                alphabet1.incC(tmp.substring(j,j+1));

            }

        }
        alphabet1.getAlphabet(abc);

        // напишите тут ваш код
    }

}

package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int a1;
        private char a2;
        private String a3;
        private Human a4;
        private boolean a5;
        private HashSet<Human> a6;
        public Human(){}
        public Human(int a1) {}
        public Human(char a2) {}
        public Human(String a3){}
        public Human(int a1,char a2){}
        public Human(int a1, char a2, String a3){}
        public Human(boolean a5){}
        public Human(int a1, boolean a5){}
        public Human(char a2, boolean a5){}
        public Human(String a3,boolean a5){}

    }
}

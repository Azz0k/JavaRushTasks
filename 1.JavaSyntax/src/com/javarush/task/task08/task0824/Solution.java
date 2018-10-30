package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human gfather2=new  Human(" se",true,35);
        Human gfather1=new  Human(" se",true,35);
        Human gmother1=new  Human(" se",false,35);
        Human gmother2=new  Human(" se",false,35);
        Human father=new  Human(" se",true,15);
        Human moter=new  Human(" se",false,15);
        Human child1=new Human(" se",true,5);
        Human child2=new Human(" se",true,5);
        Human child3=new Human(" se",true,5);


        moter.children.add(child1);
        moter.children.add(child1);
        moter.children.add(child1);
        father.children=moter.children;


        gmother1.children.add(father);

        gfather1.children=gmother1.children;



        gmother2.children.add(moter);
        gfather2.children=gmother2.children;
        System.out.println(gfather1.toString());
        System.out.println(gfather2.toString());
        System.out.println(gmother1.toString());
        System.out.println(gmother2.toString());
        System.out.println(father.toString());
        System.out.println(moter.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children= new ArrayList<>();
        public Human(String name,boolean sex,int age)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            //this.children=children;
        }
        public Human(String name,boolean sex,int age, ArrayList<Human> children)
        {
            this(name,sex,age);
            this.children=children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

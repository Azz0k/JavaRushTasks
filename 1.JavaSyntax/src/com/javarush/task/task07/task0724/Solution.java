package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
       Human gfather1=new Human("a",true,100);
       Human gfather2=new Human("af",true,101);
        Human gmother1=new Human("aaaf",false,101);
        Human gmother2=new Human("aqaaaf",false,121);
        Human father=new Human("aaafgkgh",true,40,gfather1,gmother1);
        Human mother=new Human("aaafggfdk",false,40,gfather2,gmother2);
        Human child1=new Human("aaafagk",false,4,father,mother);
        Human child2=new Human("aaafagk",false,4,father,mother);
        Human child3=new Human("aaafagk",false,4,father,mother);
        System.out.println(gfather1);
        System.out.println(gfather2);
        System.out.println(gmother1);
        System.out.println(gmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father,mother;
        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;

        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name,sex,age);
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}























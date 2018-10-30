package com.javarush.task.task14.task1408;

 abstract class Hen{
    String country;
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я - курица.";
    }
     public Hen(String country){
        this.country=country;
    }

}
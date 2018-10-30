package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 5;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    public UkrainianHen(String country){
        super(country);
    }
}
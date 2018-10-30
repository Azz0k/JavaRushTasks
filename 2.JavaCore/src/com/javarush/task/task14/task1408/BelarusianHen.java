package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 4;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    public BelarusianHen(String country){
        super(country);
    }
}
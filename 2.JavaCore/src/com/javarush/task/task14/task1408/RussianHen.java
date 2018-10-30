package com.javarush.task.task14.task1408;

class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 1;
    }
    public RussianHen(String country){
        super(country);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 3 ;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    public MoldovanHen(String country){
        super(country);
    }
}

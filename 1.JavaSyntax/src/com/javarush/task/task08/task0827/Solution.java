package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)throws Exception
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception
    {
        int space = date.indexOf(' ');
        String tempdate=date.substring(0,1)+date.substring(1,3).toLowerCase()+date.substring(space);
        SimpleDateFormat sdf=new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);

        Date date2=sdf.parse(tempdate);
        Date date1=sdf.parse("Jan 1 "+tempdate.substring(tempdate.length()-5));
        return  ((date2.getTime()-date1.getTime())/(1000*60*60*24))%2==0?true:false;



    }
}

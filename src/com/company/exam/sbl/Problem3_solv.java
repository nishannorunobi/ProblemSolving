package com.company.exam.sbl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Problem3_solv {
    public static void main(String args[]){
        //Print Current System days
        System.out.println(new Date(System.currentTimeMillis()));
        // add 763 days before current system time
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,-763);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(calendar.getTime()));
    }
}

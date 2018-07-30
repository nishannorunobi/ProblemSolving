package com.company.jvm.tuning;

public class CustomThread extends Thread{
    int array[] = null;

    public CustomThread(int no) {
        super.setName("CustomThread-#-"+no);
        array = new int[no];
        int i = no;
        while(i>0){
            i--;
            array[i] = i;
        }
    }

    @Override
    public void run() {
        while (Util.flag){
            //CustomLogger.log(super.getName()+" >> "+super.getState().name()+", array size : "+array.length);
        }
        CustomLogger.log("Stopped >> "+super.getName());
    }


}

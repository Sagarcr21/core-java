package com.xworkz.emmueration.emuers;

public enum Country {
    India(91,"hindi"),Pakistan(96,"urdu"),America(52,"eng"),Newzealand(95,"thr"),Iran(54,"urdu"),Dubai(52,"dhgf");
     private int code;
     private String lanquage;
     private  Country(int code,String lanquage){
        this.code=code;
        this.lanquage=lanquage;

    }
    public int getCode(){
        return code;

    }
    public String getlanquage(){
         return lanquage;
    }
}


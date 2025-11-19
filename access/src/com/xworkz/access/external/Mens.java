
package com.xworkz.access.internal;

public class PG{
    protected int price;
    protected String name;
    protected boolean isAvailable;
    protected char series;

    protected PG(int price,
                 String name,
                 boolean isAvailable,char series){
        this.price=price;
        this.name=name;
        this.isAvailable=isAvailable;
        this.series=series;
    }
}



package com.xworkz.access.external;


import com.xworkz.access.internal.PG;

   class Mens extends PG  {
    protected Mens(int price,
                   String name,
                   boolean isAvailable,char series){
        super(price,name,isAvailable,series);
    }


   public static void main(String[] args) {


            Mens pg=new Mens(1234,"sjr",true,'A');
            pg.price=64446;
            System.out.println("the price of the pg is "+ pg.price);
            System.out.println("the name of the pg is "+pg.name);
            System.out.println("the pg is Avilable "+pg.isAvailable);
       System.out.println("the pg is series "+pg.series);



       Mens pg1=new Mens(23434,"ganesh",true,'G');
       pg1.isAvailable=false;
       System.out.println("----------");
       System.out.println("the price of the pg is "+ pg1.price);
       System.out.println("the name of the pg is "+pg1.name);
       System.out.println("the pg is Avilable "+pg1.isAvailable);
       System.out.println("the pg is series "+pg1.series);
       Mens pg2=new Mens(10000,"sagar",true,'F');
       System.out.println("----------");

       System.out.println("the price of the pg is "+ pg2.price);
       System.out.println("the name of the pg is "+pg2.name);
       System.out.println("the pg is Avilable "+pg2.isAvailable);
       System.out.println("the pg is series "+pg2.series);

        }


}

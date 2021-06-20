package com.ust.vehicleDemo;


public class CarDetails 
{
    public static void main( String[] args )
    {

    	Suv suv= new Suv();
    	suv.brand="TOYOTA";
    	suv.groundClearence=210;
    	suv.model="FORTUNER";
    	suv.noOfSeats=7;
    	
    	
    	System.out.println("This is the all new " +suv.brand+" "
    			+suv.model+" "+suv.noOfSeats+" seater with "+suv.safety()+
    			" and a ground clearence of "
    			+ suv.groundClearence+"mm ");
    	Sedan sedan = new Sedan();
    	sedan.brand="TOYOTA";
    	sedan.groundClearence=170;
    	sedan.model="Camry";
    	sedan.noOfSeats=5;
    	System.out.println("\nThis is the all new " +sedan.brand+" "
    			+sedan.model+" "+sedan.noOfSeats+" seater with "+sedan.safety()+
    			" and a ground clearence of "
    			+ sedan.groundClearence+"mm ");

    }
}

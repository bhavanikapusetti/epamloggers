package com.epam.logg;


public class Building {
    double area;
    int type;
    Building(double area,int type){
   	 this.area=area;
   	 this.type=type;
    }
    public String getcostofBuilding() {
   	 if(type==1) {
   		 return "Rs"+String.format("%.2f", area*1200);
   	 }
   	 else if(type==2) {
   		 return "Rs"+String.format("%.2f", area*1500);
   	 }
   	 else if(type==3) {
   		 return "Rs"+String.format("%.2f", area*1800);
   	 }
   	 else {
   		 return "Rs"+String.format("%.2f", area*2500);
   	 }
    }
}

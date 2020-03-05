package com.epam.logg;
public class Money {
	double principal;
	double time;
	double rate;
	Money(double p,double r,double t){
		this.principal=p;
		this.rate=r;
		this.time=t;
	}
	String  getSimpleinterest(){
		return "Rs"+String.format("%.2f",(principal*time*rate)/100);
	}
	String getCompoundinterest(){
		return "Rs"+String.format("%.2f",principal*Math.pow(1.0+rate/100.0,time)-principal);
	}

}
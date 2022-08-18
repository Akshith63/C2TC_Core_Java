package com.Generic;

import java.util.ArrayList;
import java.util.List;

class Bike
 {
	 private Integer prize;

	public Bike(int prize) {
		
		this.prize = prize;
	}

	public int getPrize() {
		return prize;
	}

	@Override
	public String toString() {
		return "Bike [prize=" + prize + ", getPrize()=" + getPrize() + "]";
	}
	 	 
 }

 class Hero extends Bike
 {
	
	private String colour;
	 private Float miallege;
	public Hero(int prize, String colour, Float miallege) {
		super(prize);
		this.colour = colour;
		this.miallege = miallege;
	}
	public String getColour() {
		return colour;
	}
	public Float getMiallege() {
		return miallege;
	}
	@Override
	public String toString() {
		return "Hero [colour=" + colour + ", miallege=" + miallege + ", getColour()=" + getColour() + ", getMiallege()="
				+ getMiallege() + "]";
	}
	 
 }
 
public class Wild_Card_In_Generics {

	<N>void display(List<? extends Bike> list)//upper bounded wildcard
	{
		for(Object res:list)
		{
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Bike> list = new ArrayList ();
	
		list.add(new Bike(56000));
		list.add(new Bike(70000));
		list.add(new Hero(86689,"BLUE",80.6f));
		list.add(new Hero(58667, "Red",90.5f));
		
		Wild_Card_In_Generics  obj= new Wild_Card_In_Generics ();
		obj.display(list);
		}

}

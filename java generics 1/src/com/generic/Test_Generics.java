package com.generic;

import java.util.LinkedList;
import java.util.List;


class Data<T>
{
	T myVariable;

	public Data(T myVariable) {
		
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + ", getMyVariable()=" + getMyVariable() + "]";
	}

}


public class Test_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List < Data<Object>> obj = new LinkedList< Data<Object>> ();
		
		//by using generic we can pass multiple variety of parameters
		
		obj.add(new Data<Object>(67));
		obj.add(new Data<Object>("hello world"));
		obj.add(new Data<Object>(6.56f));
		obj.add(new Data<Object>('g'));
		obj.add(new Data<Object>(6769.56));
		obj.add(new Data<Object>(6747868));
		obj.add(new Data<Object>(1));
		
		System.out.println(obj);

	}

}

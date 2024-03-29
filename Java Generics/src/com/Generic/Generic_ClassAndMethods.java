//Bounded type parameter in class and methods
//it does not allow to use other type of Wrapper classes
//program using generic class and generic methods

package com.Generic;

	class Dataa<K extends Integer,V extends String>
	{
		private K key;
		private V value;
		public Dataa(K key, V value) {
			
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		@Override
		public String toString() {
			return "Data [key=" + key + ", value=" + value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
					+ "]";
		}
		
		public <E extends String,N extends Integer> void print(E elements,N numbers)
		{
		
		System.out.println("Elements :" + " "+ elements+ " " +  "Numbers:" + " " + numbers);
	}
	}
public class Generic_ClassAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dataa<Integer,String> obj = new Dataa<Integer,String> (1,"Madhu"); 
		
		System.out.println("key:" + obj.getKey()+ " " + "value:" + obj.getValue());
		System.out.println();
		obj.print( "MS DHONI",7);
		
		
	}

}

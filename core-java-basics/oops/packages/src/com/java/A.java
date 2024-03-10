package com.java;

class A{
	public static void main(String[] args){
		System.out.println("from com.java.A");

	}
}
/*
from src write:
javac -d ../classes com/java/A.java
java -cp ../classes com.java.A
*/
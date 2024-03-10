import java.util.*;

class A{
	public static void main(String[] args){
		System.out.println("byte min: " + Byte.MIN_VALUE);
		System.out.println("byte max: " + Byte.MAX_VALUE);
		System.out.println("short min: " + Short.MIN_VALUE);
		System.out.println("short max: " + Short.MAX_VALUE);
		System.out.println("char min: " + (int)Character.MIN_VALUE);
		System.out.println("char max: " + (int)Character.MAX_VALUE);
		System.out.println("int min: " + Integer.MIN_VALUE);
		System.out.println("int max: " + Integer.MAX_VALUE);
	}
}
/*
byte min: -128
byte max: 127
short min: -32768
short max: 32767
char min: 0
char max: 65535
int min: -2147483648
int max: 2147483647
*/

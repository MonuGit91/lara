import java.util.*;

class Z5{
	public static void main(String[] args){
		boolean b1 = true, b2 = false;
		System.out.println((b1=!b1) || b2);//false
		System.out.println("@1:"+b1+","+ b2);//@1:false,false
		System.out.println((b1=!b2) || b2);//false
		System.out.println("@2:"+b1+","+b2);//@2:false,false
		System.out.println((b1=!b1) && b2);//false
		System.out.println("@3:"+b1+","+b2);//@3:true,false
		System.out.println((b1=!b2) && b2);//false
		System.out.println("@5:"+b1+","+b2);//@5:true,false
		System.out.println((b1=!b2) || (b2=!b1));//true
		System.out.println("@6:"+b1+","+b2);//@6:true,false
		System.out.println((b1=!b2) && (b2=b1));//true
		System.out.println("@7:"+b1+","+b2);//@7:true,true
		System.out.println((b1=!b2) && (b2=!b1));//false
		System.out.println("@8:"+b1+","+b2);//@8:false,true
	}
}

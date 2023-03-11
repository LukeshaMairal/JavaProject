package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int num=1;num<11;num++) {
			
			System.out.println(num);
		}
		
		System.out.println("End of for loop");
		
		for(int num1=10;num1>0;num1-=2) {
			
			System.out.println(num1);
			
		}
		System.out.println("End of second for loop");
		


System.out.println("Table of 2");
		
		int num=2;
		for(int i=1;i<11;i++) {
			System.out.println(num*i);
			//System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");
	}

}

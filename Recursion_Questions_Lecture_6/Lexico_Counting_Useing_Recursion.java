package Recursion_Questions_Lecture_6;
public class Lexico_Counting_Useing_Recursion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=1000;
        printcounting(0,n);
	}
	public static void printcounting(int curr,int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {	
			printcounting(curr*10+i,n);
		}
	}
}

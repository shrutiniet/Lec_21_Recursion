package Lec_21;
import java.util.*;
public class Tower_of_hanoi {
	static ArrayList<Integer> A = new ArrayList<>();
	static ArrayList<Integer> B = new ArrayList<>();
	static ArrayList<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
A=new ArrayList<>();
for(int i=1;i<=n;i++)
{
	A.add(i);
}
B=new ArrayList<>();
C=new ArrayList<>();
Solve(A,C,B,n);
	}
public static void Solve(ArrayList<Integer> src,ArrayList<Integer> dest, ArrayList<Integer> tmp, int n)
{
	if(n==0)
		return;
	Solve(src,tmp,dest,n-1);
	int disk = src.remove(src.size() - 1);
	dest.add(disk);
	print(A, B, C);
	Solve(tmp, dest, src, n - 1);	
}
public static void print(ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> tmp) {
	System.out.println(src + "||" + dest + "||" + tmp);
}
}

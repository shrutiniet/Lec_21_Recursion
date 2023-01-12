package Lec_21;
import java.util.*;
public class Coin_Combination_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[]coin= {1,2,3,4};
int target=4;
Solve(0,"",0,target,coin);
	}
public static void Solve(int curr, String path,int idx,int target,int[] coin)
{
	if(curr==target)
	{
		System.out.println(path);
		return;
	}
	if(curr>target || idx==coin.length)
	{
		return;
	}
	Solve(curr+coin[idx],path+coin[idx],idx,target,coin);
	Solve(curr,path,idx+1,target,coin);
}
}

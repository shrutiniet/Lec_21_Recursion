package Lec_21;
import java.util.*;
public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[]coin= {1,2,3,4};
int target=4;
Solve(0,0,"",target,coin);
	}
public static void Solve(int curr_amt, int prev_idx,String path,int target, int[]coin)
{
	if(curr_amt==target)
	{
		System.out.println(path);
		return;
	}
	if(curr_amt>target)
		return;
	for(int i=prev_idx;i<coin.length;i++)
	{
		Solve(curr_amt+coin[i],i,path+coin[i],target,coin);
	}
}
}

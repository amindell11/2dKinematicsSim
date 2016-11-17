package first_order;
import java.util.ArrayList;

import util.Pair;

public class Launcher {
	public static float dx=.01f;
	public static int steps;
	public static void main(String[] args){
		float _v0;
		float _alpha;
		float BoverM;
		float range;
		float height;
		ArrayList<Pair> vals;
		steps=0;
		step(new Pair(0,0));
		
	}
	public static Pair step(Pair input){
		Pair output= new Pair();
		output.y=(float) (input.y+operateX(input.x)*dx);
		output.x=input.x+dx;
		System.out.println(output.x+","+output.y);
		steps++;
		if(steps>200){
			return output;
		}else{
			return step(output);
		}
	}
	public static float operateX(float x){
		return (float) Math.pow(x, 2);
	}
}

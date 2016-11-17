package second_order;
import java.util.ArrayList;

import util.Pair;

public class Launcher {
	public static float dt=.01f,_v0=15, _alpha, BoverM=.8f, range, height;
	public static int steps;
	public static void main(String[] args){

		ArrayList<Pair> vals;
		steps=0;
		step(new PairPair(new Pair(0,0),new Pair((float)(_v0*Math.cos(_alpha)),0)));
		
	}
	public static PairPair step(PairPair input){
		PairPair output= new PairPair(new Pair(), new Pair());
		output.pos.x=(float) (input.pos.x+input.vel.x*dt);
		output.pos.y=input.pos.y+dt;
		output.vel.x=input.vel.x+operateV(input.vel.x)*dt;
		output.vel.y=input.vel.y+dt;
		System.out.println(output.pos.y+"\t"+output.pos.x);
		steps++;
		if(steps>200){
			return output;
		}else{
			return step(output);
		}
	}
	public static float operateV(float v){
		return -BoverM*v;
	}
}

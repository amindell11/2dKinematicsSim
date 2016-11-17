package two_dimensional_system;
import java.util.ArrayList;

import util.Pair;

public class Launcher {
	public static float dt=.01f,_v0=15, _alpha=45, BoverM=.8f, range, height,g=9.8f;
	public static int steps;
	public static void main(String[] args){

		steps=0;
		step(new State(_v0,_alpha));
		
	}
	public static State step(State input){
		State output= new State();
		output.t=input.t+dt;
		output.x=input.x+input.vx*dt;
		output.vx=input.vx+operateVx(input.vx)*dt;
		output.y=input.y+input.vy*dt;
		output.vy=input.vy+operateVy(input.vy)*dt;
		System.out.println(output.x+"\t"+output.y);
		steps++;
		if(steps>200){
			return output;
		}else{
			return step(output);
		}
	}
	public static float operateVy(float v){
		return operateVx(v)-g;
	}
	public static float operateVx(float v){
		return -BoverM*v;
	}
}

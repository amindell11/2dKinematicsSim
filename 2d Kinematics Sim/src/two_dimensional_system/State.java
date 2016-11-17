package two_dimensional_system;

public class State {
	float x;
	float y;
	float vx;
	float vy;
	float t;
	public State(float x,float y, float vx, float vy, float t){
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		this.t=t;
	}
	public State(float v0, float alpha){
		this.x=0;
		this.y=0;
		this.vx=(float) ((float)v0*Math.cos(alpha));
		this.vy=(float) ((float)v0*Math.sin(alpha));
		this.t=0;
	}
	public State(){
		this(0,0);
	}
}

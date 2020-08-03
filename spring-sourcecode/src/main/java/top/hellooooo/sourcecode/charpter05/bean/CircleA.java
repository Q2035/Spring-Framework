package top.hellooooo.sourcecode.charpter05.bean;

public class CircleA {
	private CircleB circleB;

	public CircleA(CircleB circleB) {
		this.circleB = circleB;
	}

	public void a(){
		this.circleB.b();
	}

	public CircleB getCircleB() {
		return circleB;
	}

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}
}

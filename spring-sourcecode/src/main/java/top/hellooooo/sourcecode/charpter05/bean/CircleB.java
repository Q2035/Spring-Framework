package top.hellooooo.sourcecode.charpter05.bean;

public class CircleB {
	private CircleC circleC;

	public CircleC getCircleC() {
		return circleC;
	}

	public void setCircleC(CircleC circleC) {
		this.circleC = circleC;
	}

	public CircleB(CircleC circleC) {
		this.circleC = circleC;
	}

	public void b() {
		this.circleC.c();
	}
}

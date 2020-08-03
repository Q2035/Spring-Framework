package top.hellooooo.sourcecode.charpter05.bean;

public class CircleC {
	private CircleA circleA;

	public void c() {
		this.circleA.a();
	}

	public CircleA getCircleA() {
		return circleA;
	}

	public CircleC(CircleA circleA) {
		this.circleA = circleA;
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}

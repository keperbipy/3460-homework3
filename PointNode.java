 public class PointNode {

  private double x;
  private double y;
  private PointNode next;

  public PointNode(double _x, double _y, PointNode _next) {
    x = _x;
	y = _y;
    next = _next;
  }

  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public void setX(double _x) {
    x = _x;
  }
	public void setY(double _y) {
    y = _y;
  }
  public PointNode getNext() {
    return next;
  }

  public void setNext(PointNode _next) {
    next = _next;
  }

}

package pkgShape;


public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int x, int y) {
		iWidth=x;
		iLength=y;
	}
	public void setLength(int Length) {
		if(Length<0) {
			throw new IllegalArgumentException("Length has to be positive");
		}
		else {
			this.iLength=Length;
		}
	}
	public void setWidth(int Width) {
		if(Width<0) {
			throw new IllegalArgumentException("Width has to be positive");
		}
		else {
			this.iWidth=Width;
	}
	
	}
	public int getWidth() {
		return iWidth;
	}
	public int getLength() {
		return iLength;
	}
	public double area() {
		return iWidth*iLength;
	}
	public double perimeter() {
		return (double) 2*iWidth+2*iLength;
	}
	
	public int compareTo(Object x) {
		Rectangle rec = (Rectangle) x;
		return (int) this.area() -(int)rec.area();
	}
}

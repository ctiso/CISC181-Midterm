package pkgShape;
import java.util.Comparator; 


public class Cuboid extends Rectangle{
	private int iDepth;
	public Cuboid(int x, int y, int z) {
		super(x,y);
		iDepth=z;
	}
	public void setDepth(int Depth) {
		if(Depth<0) {
			throw new IllegalArgumentException("Depth has to be positive");
		}
		else {
			this.iDepth=Depth;
		}
		}
	public int getDepth() {
		return iDepth;
	}
	
	public double area() {
		int width=getWidth();
		int length=getLength();
		return 2*(length*iDepth)+2*(length*width)+2*(iDepth*width);
	}
	public double volume() {
		return super.area()*iDepth;
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Cant' call perimeter");
	}
public class SortByVolume implements Comparator<Cuboid>{
	public int compare(Cuboid cub1,Cuboid cub2) {
		return (int) cub1.volume() - (int) cub2.volume();
	}
}
public class SortByArea implements Comparator<Cuboid>{
	public int compare(Cuboid cub1,Cuboid cub2) {
		return (int) cub1.area()-(int)cub2.area();
	}
}
}

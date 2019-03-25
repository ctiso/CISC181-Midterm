package pkgShape;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class RectangleTest {
	
	@Test
	public void RectangleGetTest(){
		Rectangle a= new Rectangle(1,2);
		assertTrue(a.getWidth()==1);
		assertTrue(a.getLength()==2);
	}
	
	@Test
	public void RectangleSetTest() {
		Rectangle b= new Rectangle(0,0);
		b.setLength(4);
		b.setWidth(3);
		
		assertTrue(b.getLength()==4);
		assertTrue(b.getWidth()==3);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void RecErrorSetTest() {
		Rectangle c = new Rectangle(1,1);
		c.setWidth(-2);
		
		assertTrue(c.getWidth()<0);
	}
	@Test
	public void RecAreaTest() {
		Rectangle d= new Rectangle(5,5);
		assertTrue(d.area()==25);
	}
	@Test
	public void RecPerimeterTest() {
		Rectangle e= new Rectangle(2,3);
		assertTrue(e.perimeter()==10);
	}
	@Test
	public void CuboidGetTest() {
		Cuboid f=new Cuboid(1,2,3);
		assertTrue(f.getDepth()== 3);
	}
	@Test
	public void CuboidSetTest() {
		Cuboid g=new Cuboid(1,1,1);
		g.setDepth(9);
		
		assertTrue(g.getDepth()==9);
		assertTrue(g.getLength()==1);
		assertTrue(g.getWidth()==1);

	}
	@Test(expected = IllegalArgumentException.class)
	public void CuboidSetErrorTest() {
		Cuboid z=new Cuboid(1,1,1);
		z.setDepth(-1);
		z.setLength(1);
		z.setWidth(3);
		
		assertTrue(z.getDepth()<0);
		assertTrue(z.getLength()==1);
		assertTrue(z.getWidth()==3);
	}
	
	@Test 
	public void CuboidAreaTest() {
		Cuboid h= new Cuboid(1,2,3);
		assertTrue(h.area()==22);
	}
	@Test
	public void CuboidVolumeTest() {
		Cuboid j=new Cuboid(2,5,6);
		assertTrue(j.volume()==60);
	}
	@Test(expected= UnsupportedOperationException.class)
	public void CuboidPerim() {
		Cuboid i=new Cuboid(2,2,3);
		i.perimeter();
	}
	@Test
	public void CompareTest() {
		Rectangle RecA = new Rectangle(1,2);
		Rectangle RecB = new Rectangle(2,3);
		ArrayList<Rectangle> CompareArrList = new ArrayList<Rectangle>();
		CompareArrList.add(RecA);
		CompareArrList.add(RecB);
		Collections.sort(CompareArrList);;
		
		assertTrue(CompareArrList.get(0).area() < CompareArrList.get(1).area()); 
	}
	@Test
	public void SortByVolumeTest() {
		Cuboid cub1=new Cuboid(1,2,3);
		Cuboid cub2=new Cuboid(6,7,8);
		ArrayList<Cuboid>CompareVolList=new ArrayList<Cuboid>();
		CompareVolList.add(cub1);
		CompareVolList.add(cub2);
		Collections.sort(CompareVolList);
		
		assertTrue(CompareVolList.get(0).volume()< CompareVolList.get(1).volume());
	}
	public void SortByAreaTest() {
		Cuboid cub1=new Cuboid(1,2,2);
		Cuboid cub2=new Cuboid(3,4,5);
		ArrayList<Cuboid>CompareAreaList=new ArrayList<Cuboid>();
		CompareAreaList.add(cub1);
		CompareAreaList.add(cub2);
		Collections.sort(CompareAreaList);
		
		assertTrue(CompareAreaList.get(0).area()< CompareAreaList.get(1).area());
	}
}



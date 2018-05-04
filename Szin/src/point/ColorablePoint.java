package point;

import java.awt.Color;

public class ColorablePoint extends Point {

	
	private Color color;
	
	public ColorablePoint(int x,int y,Color color) {
		super();
		this.color=color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ColorablePoint [x=" + x + ", y=" + y + "]";
	}
	

}

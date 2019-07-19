package opdracht7;

public class Rectangle {
	private int height;
	private int width;

	public Rectangle(int width, int height) throws Exception {
		setHeight(height);
		setWidth(width);
	}

	public void setHeight(int height) throws Exception {
		if (height < 0) {
			throw new Exception("negative height");
		}
		this.height = height;
	}

	public void setWidth(int width) throws Exception {
		if (width < 0) {
			throw new Exception("negative width");
		}
		this.width = width;
	}

}



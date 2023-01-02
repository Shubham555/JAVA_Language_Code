package CWH_Java;
    
class Cylinder{
	float Radius;
	float Height;
	
	public Cylinder(float Radius, float Height) {
		this.Radius = Radius;
		this.Height = Height;
	}
	//Problem 1
	public void SetRadius(float r) {
		Radius = r;
	}
	public void SetHeight(float h) {
		Height = h;
	}
	public float GetRadius() {
		return Radius;
	}
    public float GetHeight() {
		return Height;
	}
    //Problem 2
    public double SurfaceArea() {
    	return (2*Math.PI*Radius*Radius + 2*Math.PI*Radius*Height);
    }
    public double Volume() {
    	return Math.PI*Radius*Radius*Height;
    }
}

public class cwh_44_ps09 {
	public static void main(String[] args) {
		Cylinder C1 = new Cylinder(9,12);
	//	C1.SetRadius(5);
	//	C1.SetHeight(15);
		System.out.println(C1.GetRadius());
		System.out.println(C1.GetHeight());
		System.out.println(C1.SurfaceArea());
		System.out.println(C1.Volume());
	}
}

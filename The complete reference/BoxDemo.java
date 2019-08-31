class BoxDemo
{
	public static void main(String[] args) {
		Box obj=new Box();
		obj.width=10;
		obj.height=20;
		obj.length=30;
		double vol=obj.width*obj.height*obj.length;
		System.out.println("Volume"+vol);
	}
}

class Box
{
	double width;
	double height;
	double length;
}
class D
{
	public static void main(String[] args) {
		int value=10;  // primitive data type
		Integer valueobj=new Integer(value);

		System.out.println("Primitive               one :"+value);
		System.out.println("Objec of primitive datatype :"+valueobj);


		System.out.println("Operation of primitive      :"+value*10);
		System.out.println("Object of primitive         :"+valueobj*100);


		int answer=valueobj.intValue();
		System.out.println("Retrieved integer primitive value from object        :"+answer);

		Double pi=new Double(3.14);
		double pie=pi.doubleValue();  
		System.out.println(pie*10);
				// Double pi=3.14;
		// double pie=pi.doubleValue();

			
	}
}


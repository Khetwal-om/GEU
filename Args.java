class Args
{

	public static void main(String[] args) {
	
		B b1=new B("james");
		B b2=new B("levy");
		System.out.println(b1.equals(b2));
	}
}

B 
{
	String s;

	B(String s)
	{
		this.s=s;
	}

	public boolean equals(Object o)
	{
		String r=B(String);
		if(s.equals(r.s))
		{
		return true;
		}
		else
		{
			return false;
		}

	}
}



public enum Season {

	WINTER(10),SPRING(20),SUNMMER,FALL(40);
	
	
	
	private int code;

	public int getCode() {
		return code;
	}
	
	
	Season( )
	{
		
		code=900;
		System.out.println( " Inside 0 arg cons");
	}
	
	//private be fault
	Season( int code)
	{
		this.code=code;
		
		System.out.println(" inside constructor " + code);
	}


	public static Season valueOf(int i) 
	{
		
		Season[] s =Season.values();
		
		for( Season s1 : s)
		{
			System.out.println(s1.getCode());
			System.out.println(s1);

		}
		return null;
	}
}

class Outer{
    static int var=10;
          static class Inner{
            public void display() {
                System.out.println("Hello");
        		System.out.println("hello");
        		
        	}
        }
}
        

    public class Nested{
	public static void main(String[] args) {
		
        //Outer.Inner inner1=new Outer.Inner();
        System.out.println(Outer.var);
 }
}


 

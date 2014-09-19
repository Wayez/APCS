public class demo{
    public static void main(String[]args){
	greeter bob,amy;
	bob = new greeter();
	amy = new greeter("Hola");
	bob.greet();
	
	bob.setCounter(12345);
	amy.greet();
	System.out.println(bob.getCounter());
       
	//System.out.println(amy.greeting);
	
    }
}

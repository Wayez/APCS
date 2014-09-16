public class demo{
    public static void main(String[]args){
	greeter bob,amy;
	bob = new greeter();
	amy = new greeter("Hola");
	bob.greet();
	amy.greet();
	//System.out.println(bob.x);
	bob.greet();
	bob.setCounter(10);
	System.out.println(bob.getCounter());
	
    }
}

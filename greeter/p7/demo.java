public class demo{
    public static void main(String[]args){
	greeter bob,amy;
	bob = new greeter();
	amy = new greeter("Hola");
	bob.greet();
	bob.greet();
	bob.greet();
	bob.greet();
	amy.greet();
	bob.printCounter();
	//System.out.println(bob.counter);
	//System.out.println(amy.greeting);
	
    }
}

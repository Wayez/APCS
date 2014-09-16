public class greeter{
    //instance variables - the information each object can remember
    private String greeting;
    private int counter;

    //constructor - the method that is called to instantiate an object
    public greeter(){
	greeting = "Hello!!!";
	counter = 0;
    }

    public greeter(String s){
	greeting = s;
	counter = 0;
    }
    //
    public void printCounter(){
	System.out.println(counter);
    }


    //other methods
    public void greet(){
	System.out.println(greeting);
	counter = counter + 1;
    }
}

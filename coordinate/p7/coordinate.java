public class coordinate{
    private int x,y;
    //constructor
    
    public coordinate(int x,int y){
	setX(x);
	setY(y);
    }

    public coordinate(){
    }
    
    //set and get methods
    public int getX(){
	return x;
    }
    public void setX(int x){//setX(int newX)
	this.x = x;
	//x = newX;
    }
    public int getY(){
	return y;
    }
    public void setY(int y){
	this.y = y;
    }

    public void setXY(int x,int y){
	setX(x);
	setY(y);
    }

    public String toString(){
	return "("+getX()+","+getY()+")";
    }
}

package maven;
public class Chocolate extends Sweets{
String type;
Chocolate(int n, int ct, int wt, String type){
	super(n,ct,wt);
	this.type = type;
}
public String toString() {
	return "Cost: "+this.ct+" Weight: "+this.wt+" Total Number: "+this.n;
}
}

package project;

public class CalculatorImpl implements Calculator{
	@Override
	public String add(int a,int b) {
		int sum=a+b;
		return "sum of "+a+" & "+b+" is "+sum;
	}
	@Override
	public String sub(int a,int b) {
		int sub=a-b;
		return "substraction of "+a+" & "+b+" is "+sub;
	} 
	@Override
	public String mul(int a,int b) {
		return "product of "+a+" & "+b+" is "+(a*b);
	}
	public String div(int a,int b) {
		if(b!=0) {
			return "division of "+a+" & "+b+" is "+(a/b);
		}
		else {
			return "invalid denominator";
		}
	}
	public String displayErrorMessage() {
		return "invalid choice ,please enter valid choice"; 
	}
	
	
}


public class Calculation {

	private int num1;
	private int num2; 
	
	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public Calculation(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int gcd() {
		int gcd = 1;
		int k = 2;
		
		while(k <= getNum1() && k <= getNum2()) {
			if(getNum1() % k == 0 && getNum2() % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}
	
}

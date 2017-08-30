package JavaAssignment_PartD;

import java.util.Calendar;

public class Adder extends Mathematician {

	Adder(int num_1, int num_2, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;

		 timeRequested = timeRequeste;
	}

	Adder(int num_1, int num_2, int num_3, long timeRequeste) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		 timeRequested = timeRequeste;
	}

	@Override
	public int add(int x, int y) {

		this.result = this.num1 + this.num2; 
		
		 this.responseTime = (int) (timeRequested - Calendar.getInstance().get(Calendar.MILLISECOND));

		return 0;
	}
	
	public int add(int x, int y, int z) {

		this.result = this.num1 + this.num2+this.num3; 
		
		 this.responseTime = (int) (timeRequested - Calendar.getInstance().get(Calendar.MILLISECOND));

		return 0;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}



	

}

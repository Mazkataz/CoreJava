package JavaAssignment_PartD;

import java.util.Calendar;

public class Multiplier extends Mathematician {

	public Multiplier(int num_1, int num_2, long timeRequested) {

	this.num1 = num_1;
	this.num2 = num_2; 
	
	}

	Multiplier(int num_1, int num_2, int num_3, long timeRequested) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
	}

	@Override
	public int multiply(int x, int y) {
	
		
		this.result = this.num1 * this.num2; 
		
		this.responseTime = (int)(Calendar.getInstance().get(Calendar.MILLISECOND) - timeRequested) ;
		
		
		
		
		return 0;
	}

	public int multiply(int x, int y, int z){
		this.result = this.num1*this.num2*this.num3; 
		
		this.responseTime = (int)(Calendar.getInstance().get(Calendar.MILLISECOND) - timeRequested) ;

		return 0;
	}


	@Override
	public int add(int x, int y) {
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

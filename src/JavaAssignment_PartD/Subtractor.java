package JavaAssignment_PartD;

import java.util.Calendar;
import java.util.Date;

public class Subtractor extends Mathematician {

	Subtractor(int num_1, int num_2, long timeRequested) {
		this.num1 = num_1;
		this.num2 = num_2;

	}

	public Subtractor(int num_1, int num_2, int num_3, long timeRequested) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
	}

	@Override
	public void subtract(int num1, int y) {

		this.result = this.num1 - this.num2;
		this.responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);

	}

	public void subtract(int num1, int num2, int num3) {

		this.result = this.num1 - this.num2 - this.num3;
		responseTime = new Date().getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);
	}

	@Override
	public void multiply(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
	}

}

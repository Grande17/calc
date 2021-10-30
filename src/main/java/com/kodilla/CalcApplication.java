package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		Calc calculator = new Calc();
		calculator.addAToB(7,6);
		calculator.multi(7,7);
		calculator.substractAFromB(9,99);
		calculator.divBByA(4,24);
	}

}

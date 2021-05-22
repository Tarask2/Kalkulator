package com.homeWork.Kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		Kalk kalk = new Kalk();
		System.out.println(kalk.min(5,6));
		System.out.println(kalk.max(5,6));
		System.out.println(kalk.isPositive(-1));

	}

}

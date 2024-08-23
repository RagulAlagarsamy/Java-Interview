package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormDataApplication {

	public static void main(String[] args) {


		SpringApplication.run(FormDataApplication.class, args);


		int[] arr1 = {0,2,4,5,1,0};
		int highestElement = arr1[0];

		for(int num : arr1){
			if(num > highestElement){
				highestElement = num;
			}
		}

		int secondLargestNumber = arr1[0];

		for(int num : arr1){
			if(num > secondLargestNumber && num < highestElement){
				secondLargestNumber = num;
			}
		}

		System.out.println(highestElement);

		System.out.println(secondLargestNumber);
	}

}

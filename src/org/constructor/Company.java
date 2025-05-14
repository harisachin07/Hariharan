package org.constructor;

//Child Class
public class Company extends Department{
	private void name() {
		System.out.println("Hariharan");
	}
		
		//Create Constructor
		public Company() {
			this(51);
			System.out.println("default Constructor");	
			
		}

		public Company(int age) {
				this("Hi");
				System.out.println("integer based constructor");	
		}

		public Company(String name) {
			super();
			System.out.println("String Based Constructor");
			
		}
		public static void main(String[] args) {
			Company co= new Company();
			co.name();
		}
		
		
		
	}


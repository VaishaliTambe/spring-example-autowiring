package com.springDemo;

public class AClass {
	BClass bref;

	AClass(){
		System.out.println("a is created");
	}
	
	public BClass getBref() {
		return bref;
	}

	public void setBref(BClass b) {
		this.bref = b;
	}
	void print() {
		System.out.println("Hello a");
	}
	void display() {
		print();
		bref.print();
	}
}
package com.simplilearn.fsdtraining.packagedemo;

public class PackageMain {
	public static void main(String[] args) {
		MyClass1 myClass1 = new MyClass1();
		
		// myClass1.privateVarClass1 = 10; // compilation error
		myClass1.defaultVarClass1 = 20;
		myClass1.protectedVarClass1 = 30;
		myClass1.publicVarClass1 = 40;
		
		// myClass1.privateMethodClass1(); // compilation error
		myClass1.defaultMethodClass1();
		myClass1.protectedMethodClass1();
		myClass1.publicMethodClass1();
		
		MyClass2 myClass2 = new MyClass2();
		// myClass2.privateVarClass2 = 50; // compilation error
		myClass2.defaultVarClass2 = 60;
		myClass2.protectedVarClass2 = 70;
		myClass2.publicVarClass2 = 80;
		
		//myClass2.privateMethodClass2(); // compilation error
		myClass2.defaultMethodClass2();
		myClass2.protectedMethodClass2();
		myClass2.publicMethodClass2();
	}
}

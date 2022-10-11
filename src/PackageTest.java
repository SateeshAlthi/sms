import com.simplilearn.fsdtraining.packagedemo.MyClass1;
import com.simplilearn.fsdtraining.packagedemo.StaticImportDemo;
//import static com.simplilearn.fsdtraining.packagedemo.StaticImportDemo.staticVar;
//import static com.simplilearn.fsdtraining.packagedemo.StaticImportDemo.staticMethod;
import static com.simplilearn.fsdtraining.packagedemo.StaticImportDemo.*;
import static java.lang.System.out;

public class PackageTest {
	public static void main(String[] args) {
		MyClass1 class1 = new MyClass1();
		
		// class1.privateVarClass1 = 10; // compilation error
		// class1.defaultVarClass1 = 20; // compilation error
		// class1.protectedVarClass1 = 30; // compilation error
		class1.publicVarClass1 = 40;
		
		// class1.privateMethodClass1();   // compilation error
		// class1.defaultMethodClass1();   // compilation error
		// class1.protectedMethodClass1(); //compilation error
		class1.publicMethodClass1();	
		
		SubClass subClass = new SubClass();
		subClass.subclassMethod();
		subClass.protectedMethodClass1();
		
		
		// without static import
		StaticImportDemo.staticVar = 100;
		StaticImportDemo.staticMethod();
		
		// with static import
		staticVar = 200;
		staticMethod();
		
		out.println("This is static import");
	}
}

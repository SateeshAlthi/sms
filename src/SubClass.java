import com.simplilearn.fsdtraining.packagedemo.MyClass1;

public class SubClass extends MyClass1{
	
	@Override
		protected void protectedMethodClass1() {
			// TODO Auto-generated method stub
			super.protectedMethodClass1();
		}

	
//	directly in subclass we can't access the protected variable, but we can access protected method as method can be overridden 
//	only in the method of subclass only we can access variable directly
	  	
	public void subclassMethod() {
		System.out.println("subclassMethod");
//   	    protectedVarClass1 = 20;
//		protectedMethodClass1();
		
		
		
		
		
	
	}
}






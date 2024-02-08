package java8;

interface Test{
	void print();  
}
interface add{
	void add(int a , int b);
}
class TestImpl implements Test{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("From Impl class");
	}
	
}
public class LambdaTest {
	
public static void main(String[] args) {
	Test t =  new TestImpl();
	t.print();
	
	
	//anonymus inner class   or class wothout name 
	
	Test t1 = new Test() {

		@Override
		public void print() { 
			// TODO Auto-generated method stub
			System.out.println("Inside anonymus class");
		}
		
		
	};
	t1.print();
	
	//using lambda expression
	
	Test t2 =()-> {
		System.out.println("After using lamba expresison."); 
		//for single line -----  Test t2 =()-> System.out.println("After using lmaba expresison.");      ---------- ('parameter) this represents null or some parameter 
		
	};
	t2.print();
	
	
	    int   add a = (int c,int d)->{
		return c+d;
		
		
	};
	a.add(23,23);
}
}

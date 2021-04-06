
public class Lines_Checking {
	int x1,x2,y1,y2;
	int p1,p2,q1,q2;
	int lengthofline1=0,lengthofline2=0;
	Lines_Checking(int a, int b, int c, int d, int e, int f, int g, int h ){
		x1 = a;
		x2 = b;
		y1 = c;
		y2 = d;
		
		p1 = e;
		p2 = f;
		q1 = g;
		q2 = h;
		
		
		
		
		
		
		lengthofline1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		lengthofline2=(int) Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		
		
		
	}
	public static void Equality(){
		
	}
	
	
	void display(){
		System.out.println("length of line1 :"+lengthofline1);
		
		
	}
	void display1(){
		System.out.println("length of line2 :"+lengthofline2);
	}
	 void display2(){
		if(lengthofline1 == lengthofline2){
			System.out.println(" lines are equals ");
			
		}else if(lengthofline1 > lengthofline2){
			System.out.println("line1 is greater than line2");
		}else{
			System.out.println("line1 is less than line2");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("****WELCOME TO LINE COMPARISION COMPUTATION****");
	
		Lines_Checking s1 = new Lines_Checking (4,6,8,9,8,5,7,9);
		s1.display();
		s1.display1();
		s1.display2();
		
		
	}
	

}

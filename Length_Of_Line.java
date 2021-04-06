
public class Length_Of_Line {
	int x1,x2,y1,y2;
	int lengthofline=0;
	Length_Of_Line(int a,int b,int c,int d){
		x1=a;
		x2=b;
		y1=c;
		y2=d;
		
		
		
		lengthofline=(int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		
		
	}
	void display(){
		System.out.println("length of line :"+lengthofline);
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("****WELCOME TO LINE COMPARISION COMPUTATION****");
	
		Length_Of_Line s1 = new Length_Of_Line(4,6,8,9);
		s1.display();
		
		
	}


}

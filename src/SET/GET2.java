package SET;
import java.util.ArrayList;
import java.util.List;

public class GET2 {
	
	int age;
	
	long phone;
	
	String name;

	public GET2(int age, long phone, String name) {
		super();
		this.age = age;
		this.phone = phone;
		this.name = name;
	}
	
	public static void main(String[] args) {
		GET2 T = new GET2(1, 12345, "SURESH");
		GET2 A = new GET2(2, 34567, "RAMESH");
		GET2 B = new GET2(3, 15029, "DINESH");
		
		List<GET2> LI = new ArrayList<GET2>();
		LI.add(A);
		LI.add(T);
		LI.add(B);
		
		System.out.println(LI.get(2).phone);
		System.out.println(LI.get(0).age);
		
	}
}

package javaCode;

public class AssigmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//there are 11 types of assignment operators (=,+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=)	
	// here we will only code first 6.
			
		int a = 4;
		int b = 8;

		
		//Case 1 (+=)
		int x = a+=b;
		System.out.println(x);
		
		//Case 2 (-=)
		int y = a-=b;
		System.out.println(y);
		
		//Case 3 (*=)
		int m = a*=b;
		System.out.println(m);
		
		//Case 4 (/=)
		int k = a/=b;
		System.out.println(k);
		
		//Case 5 (%=)
		int h = a%=b;
        System.out.println(h);

		
		
	}

}

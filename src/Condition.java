
public class Condition {
public static void main(String[]args) {
	
	for(int a= 1; a<100; a++) {
		
		if(a==10) //when we need the loop to stop running after a certain time
		break;	
		
		System.out.println(a);
	}
	
	
	for(int b=2; b<20; b++) {
		
		if(b==15) //when we need to skip one statement in the middle but continue until the loop ends
			continue;
		System.out.println(b);
		}
	
	for(int c= 3; c<=20; c++) {
		
		if(c==5) // continue and break together in the same code
			continue;
		System.out.println(c);
			
		if (c==10)
			break; 	//even though for loop asking to run until num 20, it stops when it get to 10.
	}
	
}

	}

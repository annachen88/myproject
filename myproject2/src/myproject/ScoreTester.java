package myproject;

public class ScoreTester {

	public static void main(String[] args) {

int score =90;
int grade = score/10 ;
switch(grade){
case 1:
case 2:
case 3:
case 4:
case 5:
	System.out.println("Failed");
	break;
case 6:System.out.println("Passed");break;
case 7:System.out.println("Good");break;
case 8:System.out.println("Great");break;
case 9:
case 10:System.out.println("Excellent");
break;
}
	}

}

import java.util.Scanner;
public class Human_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		
System.out.println("What is your name?");
	String fName=scanner.nextLine();
System.out.println("What is your middle name initial?");
	String mName=scanner.nextLine();
System.out.println("What is your last name?");
	String lName=scanner.nextLine();
System.out.println("What is your career?");
	String Career=scanner.nextLine();
System.out.println("How old are you?");
	int age=scanner.nextInt();

		
Human test= new Human(fName,mName, lName, Career,age);

System.out.println("My name is "+test.fName+" "+test.mName+" "+ test.lName+ ". ");
System.out.println("My career is "+test.Career+" "+"My age is "+test.age);		
	
	
		}
	
		}
	



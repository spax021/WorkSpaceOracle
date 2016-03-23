package l7Classes;

import java.util.List;

public class Person {
	//Lambda expressions

	public enum Sex {
		MALE, FEMALE
	}

	String name;
//	LocalDate birthday;
	Sex gender;
	String email;
	
	public int getAge(){
		return 0;
	}
	
	public static void printPerson(){
		
	}
	
	public static void printPersonOlderThan(List<Person> roster, int age){
		for(Person p : roster){
			if(p.getAge() >= age)
				printPerson();
		}
	}
	
	public static void printPersonWithinAgeRange(List<Person> roster, int low, int high){
		for(Person p : roster){
			if(low <= p.getAge() && p.getAge() >= high)
				printPerson();
		}
	}
	
	interface CheckPerson{
		boolean test(Person p);
	}
	
	public static void printPersons(List<Person> roster, CheckPerson tester){
		for(Person p : roster){
			if(tester.test(p))
				p.printPerson();
		}
	}
	
	class CheckPersonEligibleForSelectiveService implements CheckPerson{
		public boolean test(Person p) {
			return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=25;
		}
		
	}

	interface Predicate<Person>{
		boolean test(Person t);
	}
	
	public static void printPersonWithPredicate(List<Person> roster, Predicate<Person> tester){
		for(Person p : roster){
			if(tester.test(p))
				p.printPerson();
		}
	
		printPersons(roster, new CheckPerson() {
			        public boolean test(Person p) {
			            return p.gender == Person.Sex.MALE
			                && p.getAge() >= 18
			                && p.getAge() <= 25;
			        }
			    }
			);
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
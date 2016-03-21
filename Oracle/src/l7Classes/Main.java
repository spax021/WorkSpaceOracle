package l7Classes;

public class Main {
	
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String name);
	}
	
	public void sayHello(){
		
		class EnglishGreating implements HelloWorld{
			String name = "world";
			public void greet() {
				greetSomeone(name);
			}
			public void greetSomeone(String name) {
				this.name = name;
				System.out.println("Hello " + this.name);
			}
		}
		
		HelloWorld englishGreating = new EnglishGreating();
		
		HelloWorld serbianGreating = new HelloWorld() {
			String name = "Pozdrav";
			public void greet() {
				greetSomeone(name);
			}
			public void greetSomeone(String name) {
				this.name = name;
				System.out.println("Lep pozdravis " + this.name);
			}
		};
		englishGreating.greet();
		englishGreating.greetSomeone("Spasoje");
		serbianGreating.greet();
		serbianGreating.greetSomeone("Aleksandra");
	}
	public static void main(String[] args) {
		
		Main myApp = new Main();
		myApp.sayHello();
		
	}

}

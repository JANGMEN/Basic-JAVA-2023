package Day05;

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
}


class Democlass implements FirstInterface, SecondInterface {
		public void myMethod() {
			System.out.println("1번 메소드");
		}
		public void myOtherMethod() {
			System.out.println("2번 메소드");
		}
}

class Main {
	public static void main(String[] args) {
		Democlass myObj = new Democlass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
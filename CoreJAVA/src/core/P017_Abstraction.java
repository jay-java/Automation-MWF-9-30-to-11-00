package core;

abstract class RBI {
	abstract public void SA();// abstract method

	abstract public void PL();

	public void call() { //definition of method
		System.out.println("call defualt in abstract RBI class");
	}

	public static void repoRate() {
		System.out.println("repoRate +-4%");
	}
}

class SBI extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("SBI SA : 5%");
	}

	@Override
	public void PL() {
		// TODO Auto-generated method stub
		System.out.println("SBI PL : 7%");
	}
}

class JAVA extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("JAVA SA 6%");
	}

	@Override
	public void PL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA PL 8%");
	}

}

public class P017_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.SA();
		s.PL();
		s.call();
		s.repoRate();
		SBI.repoRate();
		SBI.repoRate();
		JAVA j = new JAVA();
		j.SA();
		j.PL();
		JAVA.repoRate();
	}
}

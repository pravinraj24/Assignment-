package day1;

public class Automation extends MultipleLangauge implements Language,TestTool{

	@Override
	public void selenium() {
		System.out.println("Java");
		
	}

	@Override
	public void java() {
		System.out.println("Selenium");
}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}
	
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.java();
		obj.ruby();
		obj.selenium();
		obj.python();
		
	}

}

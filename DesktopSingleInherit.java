package week3.assignments;

public class DesktopSingleInherit extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop Size");
	}

	public static void main(String[] args) {
		
		DesktopSingleInherit desk = new DesktopSingleInherit();
		desk.computerModel();
		desk.desktopSize();

	}

}

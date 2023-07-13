package miniproject;
import java.util.Scanner;
public class Continue {
	Boolean control;
	String input;
	String end;
	
	public Continue() {
		control = true; //초기값
		end = "0";	
		//다시 compare();
	}
	
	
	
	public Boolean getControl() {
		return control;
	}
	public void setControl(Boolean control) {
		this.control = control;
	}

	public void asking() {
		System.out.println("계속하시려면 아무거나 누르시고 \n 종료 하시려면 0번을 눌러주세요.");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		compare();
	}
	
	//비교하여 제어값을 변경해주는 메소드
	public void compare() {
		if(input.equals(end)) {
			control = false;
			System.exit(0);//종료
		}else {
			control = true;
		}
	}
}

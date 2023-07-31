package wearable;

public class WearableRobot implements Wearable, Color{
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	@Override
	public void putOn() {
		System.out.println(toString() + " 장착");
	}
	@Override
	public void putOff() {
		System.out.println(toString() + " 해제");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
		
	}
	
	public String toString() {
		switch(color) {
			case RED: return "빨강 로봇"; // Color.RED
			case BLUE: return "파랑 로봇";
			case GREEN: return "초록 로봇";
			default: return "블랙 로봇";
		}
		/*
		String c;
		switch(color) {
		case RED: c = "빨강 로봇"; break;
		case BLUE: c = "파랑 로봇"; break;
		case GREEN: c = "초록 로봇"; break;
		default: c = "블랙 로봇"; break;
		}
		return c;
		*/
	}
	
}

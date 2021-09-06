package p08interface.p03lecture;

public class Wolf extends KindaDog implements SledDog {
	@Override
	public void bark() {
		System.out.println("월월");
	}
	
	@Override
	public void pull() {
		System.out.println("늑대가 썰매를 끕니다.");
	}
}

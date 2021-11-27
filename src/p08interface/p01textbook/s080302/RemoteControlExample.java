package p08interface.p01textbook.s080302;

import p08interface.p01textbook.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;

//		rc = new RemoteControl(); // x
		rc = new RemoteControl() { // o

			@Override
			public void turnOn() {
				System.out.println("메소드 구현.....");
			}

			@Override
			public void turnOff() {
				System.out.println("메소드 구현.....");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("메소드 구현.....");
			}

		};
	}
}

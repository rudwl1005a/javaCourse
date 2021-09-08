package p07extends.p02quiz.p04final;

public class Car {
	final private String model;

	// 생성자
	Car() {
		this.model = "No model";
	}

	Car(String model) {
		this.model = model;
	}

	// getter
	public String getModel() {
		return model;
	}

}

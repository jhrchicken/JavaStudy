package ex12inheritance;

public class Dog extends Animal {

	private String dogKind;
	private String name;

	public Dog(String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}

	public void bark() {
		System.out.printf("이름이 %s이고 종(포유류)이 %s인 강아지가 짖습니다.%n", name, super.getSpecies());
	}

	public void showDog() {
		super.showAnimal();
		System.out.println("이름 : " + name);
		System.out.println("종류 : " + dogKind);
	}

}

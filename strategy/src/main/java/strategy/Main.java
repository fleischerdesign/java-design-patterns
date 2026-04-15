package strategy;

public class Main {
	public static void main(String[] args) {
		new Navigator()
			.from("Neubrandenburg")
			.to("Rostock")
			.using(new PublicTransportStrategy())
			.build();
	}
}

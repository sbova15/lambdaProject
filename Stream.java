import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		String animals = Animal.getAnimal().stream()
			                 .map((animal) -> animal.getName())
		                     .sorted()
		                     .collect(Collectors.joining(", "));
		       
		       System.out.println(animals);

	}

}

// Esta classe � uma subclasse de CarCreator respons�vel por criar objetos ConcreteProductGol,
// que representam carros da marca Volkswagen.
public class VolksConcreteCreator extends CarCreator {
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}

}

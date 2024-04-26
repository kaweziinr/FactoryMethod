
// Implementa uma classe concreta que cria instâncias de carros da marca Fiat, utilizando o padrão Factory Method.
public class FiatConcreteCreator extends CarCreator{

	protected Car factoryMethod() {
		
		return new ConcreteProductPalio();
	}
}

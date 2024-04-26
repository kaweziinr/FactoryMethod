
// Implementa uma classe concreta que cria inst�ncias de carros da marca Fiat, utilizando o padr�o Factory Method.
public class FiatConcreteCreator extends CarCreator{

	protected Car factoryMethod() {
		
		return new ConcreteProductPalio();
	}
}

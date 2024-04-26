
//Esta classe é a fábrica de carros. Ela é responsável por criar objetos a partir das chamadas do cliente.
//O uso desta classe evita a necessidade de criar novos objetos diretamente.

public abstract class CarCreator {
	
	public void buildCar() 
	{
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();
	
}

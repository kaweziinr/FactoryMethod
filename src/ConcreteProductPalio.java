// Aqui est�o sendo definidos os atributos de um carro do modelo Palio,
// seguindo o padr�o de cria��o estabelecido para os carros.
public class ConcreteProductPalio extends Car{
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}
}

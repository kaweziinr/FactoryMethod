// Aqui est�o sendo definidos os atributos de um carro do modelo Gol,
// seguindo o padr�o de cria��o estabelecido para os carros.
public class ConcreteProductGol extends Car{
 
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		this.showInformation();
	}
}

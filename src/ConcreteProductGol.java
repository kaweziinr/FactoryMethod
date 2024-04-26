// Aqui estão sendo definidos os atributos de um carro do modelo Gol,
// seguindo o padrão de criação estabelecido para os carros.
public class ConcreteProductGol extends Car{
 
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		this.showInformation();
	}
}

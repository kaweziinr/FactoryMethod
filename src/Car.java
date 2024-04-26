
//Esta classe abstrata representa o objeto comum a ser criado dentro do padr�o Factory Method.
// Serve como um ponto de refer�ncia para o padr�o de cria��o deste objeto.

public abstract class Car {
	
	private String model;
	private String factory;
	private String category;
	
	public void showInformation() {
		
		System.out.println("Model: " + this.getModel() + "\nFactory: " + this.getFactory() + "\nCategory: " + this.getCategory());
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

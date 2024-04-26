//Esta classe representa o pedido do cliente para a criação do objeto.
//Ela permite que o cliente receba o produto e interaja com ele sem precisar conhecer os detalhes da sua construção.*/
import javax.swing.JOptionPane;

public class Client {
	public static void main(String[] args) {
		
		
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
}


package exercicio7_1;

public abstract class TranformerTemplate {
	protected String texto;
	
	public void transformar() {
		lerTexto();
		trasnformarTexto();
		imprimirTexto();
	}
	protected abstract void lerTexto();
	
	protected abstract void trasnformarTexto();
	
	protected abstract void imprimirTexto();
	
}

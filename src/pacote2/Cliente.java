package pacote2;
import pacote1.*;
public class Cliente extends Pessoa{
	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String recuperarInformacao() {
		String retorno = super.recuperarInformacao();
		retorno += "codigo: " + codigo + "\n";
		return retorno;
	}
	
}

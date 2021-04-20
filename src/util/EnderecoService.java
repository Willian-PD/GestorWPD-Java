package util;

import java.util.ArrayList;
import java.util.List;

import model.Endereco;

public class EnderecoService {

	private List<Endereco> listaEnderecos;
	
	public EnderecoService(int _qtd_enderecos) {
		
		this.listaEnderecos = new ArrayList<Endereco>();
		
		for (int i = 1; i <= _qtd_enderecos; i++) {
					
			Endereco end = new Endereco();
			
			end.setId(i);
			end.setDescricao("Endere�o Teste" + i);
			end.setBairro("Bairro N�" + i);
			end.setCidade("Cidade N�" + i);
			end.setEstado("Estado N�" + i);
			end.setCep("CEP N�" + i);
			
			listaEnderecos.add(end);
				
		}
	}

	public List<Endereco> getListaEnderecos() {
		return listaEnderecos;
	}	
}

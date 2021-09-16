package br.com.jose.teste.service;

import org.springframework.stereotype.Service;

import br.com.jose.teste.model.Empresa;
import br.com.jose.teste.model.Endereco;

@Service
public class EmpresaServiceMock implements EmpresaService {

	@Override
	public Empresa obterEndereco(String cnpj) {
		
		return getEmpresaPopulada(cnpj);
	}

	private Empresa getEmpresaPopulada(String cnpj) {
		
		Empresa empresa = new Empresa();
		empresa.setCnpj(cnpj);
		
		Endereco endereco = new Endereco();
		
		endereco.setRua("Rua xx");
		endereco.setBairro("Bairro xx");
		endereco.setNumero(10);
		endereco.setCidade("São Paulo");
		endereco.setEstado("São Paulo");
		endereco.setPais("Brasil");
		endereco.setCep(12356789);
		
		empresa.setEndereco(endereco);
		
		return empresa;
	}

}

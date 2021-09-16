package br.com.jose.teste.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.teste.model.Empresa;
import br.com.jose.teste.service.EmpresaService;

@RequestMapping("empresa")
@RestController
public class EmpresaController {

	private EmpresaService empresaService;

	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	@GetMapping("{cnpj}")
	public Empresa obterEndereco(@PathVariable @Valid String cnpj) {
		return empresaService.obterEndereco(cnpj);

	}
	
}

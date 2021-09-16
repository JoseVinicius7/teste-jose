package br.com.jose.teste.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.teste.model.Media;

@RequestMapping("media")
@RestController
public class MediaController {
	
	@PostMapping
	public Media media (@RequestBody @Valid Media media) {
		
		
	    media.calcula();
		
	    
		return media;
		
		
		
	}
}

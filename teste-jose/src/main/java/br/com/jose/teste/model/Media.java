package br.com.jose.teste.model;

import java.math.BigDecimal;

import org.springframework.lang.NonNull;

public class Media {

	@NonNull
	private BigDecimal a;
	@NonNull
	private BigDecimal b;
	private BigDecimal media;

	public BigDecimal getA() {
		return a;
	}

	public void setA(BigDecimal a) {
		this.a = a;
	}

	public BigDecimal getB() {
		return b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void calcula() {
		this.media = a.add(b).divide(BigDecimal.valueOf(2));
	}

}

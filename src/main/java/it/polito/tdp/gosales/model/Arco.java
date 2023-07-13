package it.polito.tdp.gosales.model;

public class Arco {

	private Integer rCode1;
	private Integer rCode2;
	private Integer nInComune;
	
	public Arco(Integer rCode1, Integer rCode2, Integer nInComune) {
		this.rCode1 = rCode1;
		this.rCode2 = rCode2;
		this.nInComune = nInComune;
	}

	public Integer getrCode1() {
		return rCode1;
	}

	public void setrCode1(Integer rCode1) {
		this.rCode1 = rCode1;
	}

	public Integer getrCode2() {
		return rCode2;
	}

	public void setrCode2(Integer rCode2) {
		this.rCode2 = rCode2;
	}

	public Integer getnInComune() {
		return nInComune;
	}

	public void setnInComune(Integer nInComune) {
		this.nInComune = nInComune;
	}
	
	
}

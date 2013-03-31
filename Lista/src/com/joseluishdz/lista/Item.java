package com.joseluishdz.lista;

public class Item {
	// Just a JavaBean with getters and setters
	private String texto1;
	private String texto2;
	
	public Item(String texto1, String texto2 ){
		this.texto1=texto1;
		this.texto2=texto2;
	}
	
	public String getTexto1() {
        return texto1;
    }
    public void setTexto1(String texto) {
        this.texto1 = texto;
    }
    public String getTexto2() {
        return texto2;
    }
    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }
}

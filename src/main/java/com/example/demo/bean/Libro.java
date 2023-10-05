package com.example.demo.bean;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String editorial;
	private String fecha;
	private String tematica;
	
	public Libro(int id, String titulo, String autor, String editorial, String fecha, String tematica) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.fecha = fecha;
		this.tematica = tematica;
	}
	
	public int getId() { return id; }
	public String getTitulo() { return titulo; }
	public String getAutor() { return autor; }
	public String getEditorial() { return editorial; }
	public String getFecha() { return fecha; }
	public String getTematica() { return tematica; }
	
	public void setId(int id) { this.id = id; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setAutor(String autor) { this.autor = autor; }
	public void setEditorial(String editorial) { this.editorial = editorial; }
	public void setFecha(String fecha) { this.fecha = fecha; }
	public void setTematica(String tematica) { this.tematica = tematica; }
}

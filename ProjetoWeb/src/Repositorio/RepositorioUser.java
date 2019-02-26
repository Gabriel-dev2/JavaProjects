package Repositorio;

import java.util.ArrayList;

import Negocio.Contato;

public class RepositorioUser {

	ArrayList<Contato> contatos;
	
	public RepositorioUser(){
		contatos = new ArrayList<Contato>();
		
	}
	
	public void inserir(Contato c){
		contatos.add(c);
	}
	
	public Contato procurar(String nome){
		Contato procurado = null;
		for(Contato contato : contatos){
			if(contato.getNome().equals(nome)){
				procurado = contato;
			}
		}
		
		return procurado;
		
	}
	
	public ArrayList<Contato> listarContatos(){
		return this.contatos;
	}
}

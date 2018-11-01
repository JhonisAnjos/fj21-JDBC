package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaBuscaID {
	public static void main(String[] args) {
		Contato contato;
		long id =1;
		
		contato = new ContatoDAO().buscaPorId(id);
		
		 System.out.println("Nome: " + contato.getNome());
         System.out.println("Email: " + contato.getEmail());
         System.out.println("Endereço: " + contato.getEndereco());
         System.out.println("Data de Nascimento: " + 
                new SimpleDateFormat().format(contato.getDataNascimento().getTime()) + "\n");
	}

}

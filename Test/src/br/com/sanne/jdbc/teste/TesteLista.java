package br.com.sanne.jdbc.teste;

import java.util.List;

import br.com.sanne.jdbc.modelo.Contato;
import br.com.sanne.jdbc.DAO.ContatoDao;

public class TesteLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
	List<Contato> contatos = dao.getLista();
	for (Contato contato : contatos) {
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Endereço: " + contato.getEndereco());
        System.out.println("Data de Nascimento: " + 
                contato.getDataNascimento().getTime() + "\n");
     }
	}
}
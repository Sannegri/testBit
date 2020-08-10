package br.com.sanne.jdbc.teste;

import java.util.Calendar;

import br.com.sanne.jdbc.modelo.Contato;
import br.com.sanne.jdbc.DAO.ContatoDao;

public class TesteInsere {
       public static void main(String[] args) {

     
            Contato contato = new Contato();
            contato.setNome("Sanne");
            contato.setEmail("contato@sanne.com.br");
            contato.setEndereco("R. Dos Alfeineiros 4 cj87");
            contato.setDataNascimento(Calendar.getInstance());

  
            ContatoDao dao = new ContatoDao();


            dao.adiciona(contato);

            System.out.println("Gravado!");
        }
      }
package br.com.sanne.jdbc.teste;

import java.util.Calendar;

import br.com.sanne.jdbc.modelo.Contato;
import br.com.sanne.jdbc.DAO.ContatoDao;

public class TesteInsere {
       public static void main(String[] args) {

     
            Contato contato = new Contato();
            contato.setNome("Caelum");
            contato.setEmail("contato@caelum.com.br");
            contato.setEndereco("R. Vergueiro 3185 cj87");
            contato.setDataNascimento(Calendar.getInstance());

  
            ContatoDao dao = new ContatoDao();


            dao.adiciona(contato);

            System.out.println("Gravado!");
        }
      }
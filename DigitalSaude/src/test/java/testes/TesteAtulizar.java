package testes;

//Classe responsável por testar o método que atualiza entidades do banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Medicos;

public class TesteAtulizar {

	@Test
	public void testeAtulizar() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(52L, Medicos.class);
		medicos.setSenha("123456789");
		medicos = daoGeneric.atualizar(medicos);
		System.out.println(medicos);

	}

}

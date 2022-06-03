package testes;

//Classe responsável por testar o método que "deleta" entidades do banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Medicos;

public class TesteDeletar {

	@Test
	public void testarListar() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(52L, Medicos.class);
		daoGeneric.deletar(medicos);
	}

}

package testes;

//Classe responsável por testar o método que lista entidades do banco

import org.junit.Test;
import model.Medicos;
import dao.DaoGeneric;

public class TesteListar {

	@Test
	public void testarListar() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(52L, Medicos.class);
		System.out.println(medicos);

	}

}

package testes;

//Classe responsável por testar o método que salva entidades no banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Medicos;
import model.Pacientes;
import java.time.LocalDate;
import java.time.Month;

public class TesteSalvar {

	@Test
	public void salvarPrimeiraEntidadeMedico() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = new Medicos();

		medicos.setNomeCompleto("Yasmin Martins");
		medicos.setCpf("367.495.410-97");
		medicos.setGenero("Feminimo");
		medicos.setDataNascimento(LocalDate.of(1965, Month.JANUARY, 19));
		medicos.setCRM("CRM/SP 123456");
		medicos.setEspecializacao("Cardiologia");
		medicos.setEmail("yasminalmeidamartins@dayrep.com");
		medicos.setSenha("8989895");
		medicos.setTelefone("(61) 5096-9555");

		daoGeneric.salvar(medicos);

	}
	
	@Test
	public void salvarSegundaaEntidadeMedico() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = new Medicos();

		medicos.setNomeCompleto("Patricia Maricia Castro");
		medicos.setCpf("725.966.866-00");
		medicos.setGenero("Feminimo");
		medicos.setDataNascimento(LocalDate.of(1987, Month.MARCH, 03));
		medicos.setCRM("CRM/MG 716823");
		medicos.setEspecializacao("Cardiologia");
		medicos.setEmail("patricia_castro@cartovale.com.br");
		medicos.setSenha("mRHqLG98Ue");
		medicos.setTelefone("(34) 99953-8590");

		daoGeneric.salvar(medicos);

	}
	
	
	
	

	@Test
	public void salvarEntidadePacientes() {
		DaoGeneric<Pacientes> daoGeneric = new DaoGeneric<Pacientes>();
		Pacientes pacientes = new Pacientes();

		pacientes.setNomeCompleto("Lucas da Silva dos Reis");
		pacientes.setCpf("888.097.921-30");
		pacientes.setDataNascimento(LocalDate.of(2000, Month.OCTOBER, 12));
		pacientes.setGenero("Masculino");
		pacientes.setTelefone("61-33752362");
		pacientes.setEmail("luke.silvareis@gamil.com");
		pacientes.setSenha("12out2000");

		daoGeneric.salvar(pacientes);

	}

}

package model;

//Classe responsavel por ser a representar de uma entidade no banco de dados através da JPA juntamente com o Hibernate

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medicos extends CadastroGenerico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String CRM;

	// Métodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	// Método toString
	
	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf() + ", genero=" + super.getGenero()
				+ ", dataNascimento=" + super.getDataNascimento() + ", +  email=" + super.getEmail() + ", COREN=" + getCRM() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}

	

}

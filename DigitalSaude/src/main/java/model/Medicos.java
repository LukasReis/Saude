package model;



//Classe responsavel por ser a representar de uma entidade no banco de dados através da JPA juntamente com o Hibernate

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Medicos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeCompleto;
	private String cpf;
	private String genero;
	private LocalDate dataNascimento;
	private String CRM;
	private String especializacao;
	private String email;
	private String senha;
	private String telefone;

	// Metodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Medicos [id=" + id + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", genero=" + genero
				+ ", dataNascimento=" + dataNascimento + ", CRM=" + CRM + ", especializacao=" + especializacao
				+ ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + "]";
	}

}

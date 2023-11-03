package entidades;
import java.util.List;

import javax.annotation.processing.Generated;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@javax.persistence.Entity
public class User {
	@Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.TABLE)
	private int id;
	private String email;
	private String senha;
	private String nome;
	private double produtividade;
	@OneToMany(cascade= {javax.persistence.CascadeType.ALL},fetch=javax.persistence.FetchType.LAZY)
	private List<Tarefa>tarefasNao;
	private List<Tarefa>tarefasFeitas;
	
	public User() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
    	this.email=email;
    }
    public void setSenha(String senha) {
    	this.senha=senha;
    }
    public String getSenha(){
    	return senha;
    }
    public String getEmail() {
    	return email;
    }
    public void setNome(String nome) {
    	this.nome=nome;
    }
    public String getNome() {
    	return nome;
    }
    public double getProdutividade() {
    	return produtividade;
    }

	public List<Tarefa> getTarefasNao() {
		return tarefasNao;
	}

	public void setTarefas(List<Tarefa> tarefasNao) {
		this.tarefasNao = tarefasNao;
	}
	public List<Tarefa>getTarefasFeitas(){
		return tarefasFeitas;
	}
	public void setTarefa(List<Tarefa>tarefasNao) {
		this.tarefasFeitas=tarefasFeitas;
	}
	@Override
	public String toString() {
		String x = "User [nome=" + nome + ", email=" + email + "senha= "+senha+"]";
		for (Tarefa t : tarefasNao) {
			x += "  " + t + "\n";
		}
		return x;
	}
    
}

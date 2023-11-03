package entidades;

import javax.persistence.Entity;

@Entity
public class Lazer extends Tarefa {
	public Lazer(String descricao,String tipo, String horaInicio,String horaTermino,boolean check,int id) {
		super(descricao,"Lazer",horaInicio,horaTermino, false,id);
	}
}


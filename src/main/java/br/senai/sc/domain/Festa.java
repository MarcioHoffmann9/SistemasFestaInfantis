package br.senai.sc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Festa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bairro;
	private String rua;
	private Integer numero;
	private String data_inicio;
	private String hora_inicio;
	private String hota_termino;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "tema_id")
	private Tema tema;
	
	public Festa() {
		
	}

	public Festa(Integer id, String bairro, String rua, Integer numero, String data_inicio, String hora_inicio,
			String hota_termino) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.data_inicio = data_inicio;
		this.hora_inicio = hora_inicio;
		this.hota_termino = hota_termino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHota_termino() {
		return hota_termino;
	}

	public void setHota_termino(String hota_termino) {
		this.hota_termino = hota_termino;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hota_termino == null) ? 0 : hota_termino.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festa other = (Festa) obj;
		if (hota_termino == null) {
			if (other.hota_termino != null)
				return false;
		} else if (!hota_termino.equals(other.hota_termino))
			return false;
		return true;
	}
	
	
	
}

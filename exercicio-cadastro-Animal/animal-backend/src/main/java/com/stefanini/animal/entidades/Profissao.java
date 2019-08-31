package com.stefanini.pessoa.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Profissao database table.
 * 
 */
@Entity
@NamedQuery(name="Profissao.findAll", query="SELECT p FROM Profissao p")
public class Profissao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Profissao() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROFISSAO", nullable = false, unique = true)
	private Integer idProfissao;
	
	@Column(name="ID_ANIMAL")
	private Long idAnimal;
	
	@Column(name="ID_CARGO")
	private Integer idCargo;
	
	@Column(name="ID_LINGUAGEM")
	private Integer idLinguage;

	public Integer getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(Integer idProfissao) {
		this.idProfissao = idProfissao;
	}

	public Long getIdAnimal() {
		return idAnimal;
	}

	void setIdAnimal(Long idPessoa) {
		this.idAnimal = idAnimal;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Integer getIdLinguage() {
		return idLinguage;
	}

	public void setIdLinguage(Integer idLinguage) {
		this.idLinguage = idLinguage;
	}
	
}
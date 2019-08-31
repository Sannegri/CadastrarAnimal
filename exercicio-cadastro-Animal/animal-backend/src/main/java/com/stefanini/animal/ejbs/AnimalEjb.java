package com.stefanini.pessoa.ejbs;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stefanini.pessoa.ejbs.interfaces.AnimalEjbLocal;

@Stateless
public class AnimalEjb implements AnimalEjbLocal {

	@PersistenceContext(unitName = "cadastroDS")
    protected EntityManager entityManager;
	
}
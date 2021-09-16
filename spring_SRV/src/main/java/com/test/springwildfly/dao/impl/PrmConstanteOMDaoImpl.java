/**
	===========================================================================
	 NOM                : <nom Objet>                                       
	 ===========================================================================
	 Cr�ateur           : <trigramme>                                           
	 Date de cr�ation   : jj/mm/aaaa                                            
	 Version associ�e   : v.r                                                   
	 Objet              : <but de l�objet>                                      
	            exemple : proc�dure stock�e d'initialisation des champs xxxKNP  
	                      Les tables concern�es sont les suivantes :             
	                      T1, T2                                             
	 Appel�e par        : <utilisation de l�objet>                              
	            exemple : L'utilisateur (Analyseur de requ�tes SQL)             
	 ===========================================================================
	 Param�tres : <liste des param�tres pour proc�dures et fonctions uniquement>
	            exemple : @DOS [varchar(3)] : Code dossier                       
	 ===========================================================================
	 Modif�e par        :    XXX Le jj/mm/aaaa  Version: v.r                    
	 Objet              :                                                      
	 ===========================================================================
*/

package com.test.springwildfly.dao.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.test.springwildfly.dao.PrmConstanteOMDao;
import com.test.springwildfly.jpa.prmConstante;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class PrmConstanteOMDaoImpl implements PrmConstanteOMDao {
	
	
	@PersistenceContext
	private EntityManager entityManager;

	public PrmConstanteOMDaoImpl() {
		// TODO Auto-generated constructor stub

	}
	@Override
	public List<prmConstante> getList() {

		String hql="select p from prmConstante p";
		Query q=  entityManager.createQuery(hql);
		List<prmConstante> p= q.getResultList();
		return p;
	}
}

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

package com.test.springwildfly.srv.impl;


import com.test.springwildfly.jpa.prmConstante;
import com.test.springwildfly.srv.PrmConstanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.test.springwildfly.dao.PrmConstanteOMDao;

import java.util.List;


@Service
@Transactional
public class PrmConstanteServiceImpl  implements PrmConstanteService {


	@Autowired
	PrmConstanteOMDao prmConstanteDao;

	public PrmConstanteServiceImpl	() 	{
		
	}
	@Override
	public List<prmConstante> getList() {

		return prmConstanteDao.getList();
	}

	 
}



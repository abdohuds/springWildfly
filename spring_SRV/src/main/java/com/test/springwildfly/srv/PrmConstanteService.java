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

package com.test.springwildfly.srv;


import com.test.springwildfly.jpa.prmConstante;

import java.util.List;

public interface PrmConstanteService{


	List<prmConstante> getList();
}









package com.test.springwildfly.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: prmConstante
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name="PRM_CONSTANTE",schema = "baseteamberv20prm")
public class prmConstante implements Serializable {

	
	private static final long serialVersionUID = 1L;


	/**
	 * Bloc Attributs (Mapping)  	
	 * @return
	 */
	
	   @Id
	   @Column(name="pcs_spkconstante")  
	   private	 int	pcsSpkConstante			;	
	   
	   @Column(name="pcs_cuuid")  
	   private	String	pcsCuuid				;
	   
	   @Column(name="pcs_cvaleur")  
	   private	String	pcsCValeur				;
	   
	   @Column(name="pcs_sfktypeconstante") 
	   private	int		pcsSFkTypeConstante		;
	   
	   @Column(name="pcs_cqui_crea") 
	   private	String		pcsCQuiCrea  		;
	      
	   @Column(name="pcs_xquand_crea")				 	
	   @Temporal(TemporalType.TIMESTAMP)
		private	Date  pcsXQuandCrea 			;
	   	   
	   @Column(name="pcs_cqui_modif") 				
	   private	String	pcsCQuiModif  			;
	   
	   @Column(name="pcs_xquand_modif")		
	   @Temporal(TemporalType.TIMESTAMP)
	   private Date	pcsXQuandModif  			;
	   
	   
	   @Column(name="pcs_sidesactive")			
	   private	int		pcsSIDesactive  	     ;


		
	   
		/**
		 * Bloc Getteurs et setteurs 	
		 * @return
		 */
	   
	   
	   
	   
	   public prmConstante() {
			
		}
	   
	public int getPcsSpkConstante() {
		return pcsSpkConstante;
	}


	


	public void setPcsSpkConstante(int pcsSpkConstante) {
		this.pcsSpkConstante = pcsSpkConstante;
	}


	public String getPcsCValeur() {
		return pcsCValeur;
	}


	public String getPcsCuuid() {
		return pcsCuuid;
	}

	public void setPcsCuuid(String pcsCuuid) {
		this.pcsCuuid = pcsCuuid;
	}

	public void setPcsCValeur(String pcsCValeur) {
		this.pcsCValeur = pcsCValeur;
	}


	public int getPcsSFkTypeConstante() {
		return pcsSFkTypeConstante;
	}


	public void setPcsSFkTypeConstante(int pcsSFkTypeConstante) {
		this.pcsSFkTypeConstante = pcsSFkTypeConstante;
	}


	public String getPcsCQuiCrea() {
		return pcsCQuiCrea;
	}


	public void setPcsCQuiCrea(String pcsCQuiCrea) {
		this.pcsCQuiCrea = pcsCQuiCrea;
	}


	public Date getPcsXQuandCrea() {
		return pcsXQuandCrea;
	}


	public void setPcsXQuandCrea(Date pcsXQuandCrea) {
		this.pcsXQuandCrea = pcsXQuandCrea;
	}


	public String getPcsCQuiModif() {
		return pcsCQuiModif;
	}


	public void setPcsCQuiModif(String pcsCQuiModif) {
		this.pcsCQuiModif = pcsCQuiModif;
	}


	public Date getPcsXQuandModif() {
		return pcsXQuandModif;
	}


	public void setPcsXQuandModif(Date pcsXQuandModif) {
		this.pcsXQuandModif = pcsXQuandModif;
	}


	public int getPcsSIDesactive() {
		return pcsSIDesactive;
	}


	public void setPcsSIDesactive(int pcsSIDesactive) {
		this.pcsSIDesactive = pcsSIDesactive;
	}
   
}

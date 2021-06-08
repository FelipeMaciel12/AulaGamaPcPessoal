package br.itau.dashboard.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itmnEvento")
public class ItmnEvento {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSeq")
    private int numSeq;

    @Column(name = "dataEvt", nullable = false)
    private Date dataEvt= new Date();
    
    @Column(name = "idAlarme", nullable = false, unique = true)
    private int idAlarme;

    @Column(name = "idEquip", nullable = false, unique = true)
    private String idEquip;

    public int getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(int numSeq) {
        this.numSeq = numSeq;
    }

    public Date getDataEvt() {
        return dataEvt;
    }

    public void setDataEvt(Date dataEvt) {
        this.dataEvt = dataEvt;
    }

    public int getIdAlarme() {
        return idAlarme;
    }

    public void setIdAlarme(int idAlarme) {
        this.idAlarme = idAlarme;
    }

    public String getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(String idEquip) {
        this.idEquip = idEquip;
    }

    

}

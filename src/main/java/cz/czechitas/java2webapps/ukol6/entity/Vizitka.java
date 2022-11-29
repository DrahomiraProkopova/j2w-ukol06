package cz.czechitas.java2webapps.ukol6.entity;


import javax.persistence.*;

@Entity
public class Vizitka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String celeJmeno;

    private String firma;

    private String ulice;

    private String obec;

    private String psc;

    private String email;

    private String telefon;

    private String web;

    @Transient
    private String celaAdresa;

    public Integer getId() {
        return id;
    }

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObec() {
        return obec;
    }

    public String getPsc() {
        return psc;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }

    public String getCelaAdresa() {
        return ulice + " " + obec + " " + psc;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setCelaAdresa(String celaAdresa) {
        this.celaAdresa = celaAdresa;
    }
}

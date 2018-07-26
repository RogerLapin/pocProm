package com.lapin.psqlprom.model;


import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="FILMS")
public class Film {
    
	public Film() {
		super();
	}
	
	public Film(String code, String title, Integer did) {
		super();
		this.code = code;
		this.title = title;
		this.did = did;
	}
	
	public Film(String code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	@Id
    @Column(name="code")
    private String code;

    @Column(name = "title")
    private String title;

    @Column(name = "kind")
    private String kind;
     
    @Column(name = "did")
    private Integer did;

	@Column(name = "date_prod")
    private Date dateProd;
    

     public void setCode(String code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public void setDateProd(Date dateProd) {
		this.dateProd = dateProd;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public String getKind() {
		return kind;
	}

	public Integer getDid() {
		return did;
	}

	public Date getDateProd() {
		return dateProd;
	}
	
	@Override
	public String toString() {
		return String.format("Film [code=%s, title=%s, date_prod=%tF]", code, title, dateProd);
	}


}
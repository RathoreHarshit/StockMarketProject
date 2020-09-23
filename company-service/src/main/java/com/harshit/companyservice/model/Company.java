package com.harshit.companyservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer companyId;
	private String companyName;
	private String ceo;
	private String boardOfDirectors;
	
	@ElementCollection
	private List<String> stockExchanges = new ArrayList<String>();
    private Integer sector;
    private String description;
    @ElementCollection
    private List<String> codeInStockExchange = new ArrayList<String>();	
    
    public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
    



	



	public Company(Integer id, Integer companyId, String companyName, String ceo, String boardOfDirectors,
			List<String> stockExchanges, Integer sector, String description, List<String> codeInStockExchange) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.companyName = companyName;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.description = description;
		this.codeInStockExchange = codeInStockExchange;
	}








	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public List<String> getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(List<String> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public Integer getSector() {
		return sector;
	}

	public void setSector(Integer sector) {
		this.sector = sector;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getCodeInStockExchange() {
		return codeInStockExchange;
	}

	public void setCodeInStockExchange(List<String> codeInStockExchange) {
		this.codeInStockExchange = codeInStockExchange;
	}



	
	
}

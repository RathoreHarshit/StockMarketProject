package com.harshit.sectorservice.dto;

public class SectorDto {
	private Integer sectorId;
	private String sectorName;
	private String desc;
	public SectorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SectorDto(Integer sectorId, String sectorName, String desc) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.desc = desc;
	}
	public Integer getSectorId() {
		return sectorId;
	}
	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}

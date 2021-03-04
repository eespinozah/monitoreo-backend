package com.mrisk.monitoreo.domain;

import java.util.Calendar;

public class Point {
	
	private Integer poin_id;
    private Integer tenaId;
    private Boolean alive = Boolean.TRUE;
    private Calendar creationTime = Calendar.getInstance();
    private Calendar modificationTime;
    private Calendar destructionTime;
    private Integer accoId;
    private Integer sectId;
    private String name;
    
    private String nameInternal;

    private String description;
    
//	private String datum;
//	private Double x;
//	private Double y;
	
	public String getName() {
		return name;
	}
	public Integer getPoin_id() {
		return poin_id;
	}
	public void setPoin_id(Integer poin_id) {
		this.poin_id = poin_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getTenaId() {
		return tenaId;
	}
	public void setTenaId(Integer tenaId) {
		this.tenaId = tenaId;
	}
	public Boolean getAlive() {
		return alive;
	}
	public void setAlive(Boolean alive) {
		this.alive = alive;
	}
	public Calendar getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Calendar creationTime) {
		this.creationTime = creationTime;
	}
	public Calendar getModificationTime() {
		return modificationTime;
	}
	public void setModificationTime(Calendar modificationTime) {
		this.modificationTime = modificationTime;
	}
	public Calendar getDestructionTime() {
		return destructionTime;
	}
	public void setDestructionTime(Calendar destructionTime) {
		this.destructionTime = destructionTime;
	}
	public Integer getAccoId() {
		return accoId;
	}
	public void setAccoId(Integer accoId) {
		this.accoId = accoId;
	}
	public Integer getSectId() {
		return sectId;
	}
	public void setSectId(Integer sectId) {
		this.sectId = sectId;
	}
	public String getNameInternal() {
		return nameInternal;
	}
	public void setNameInternal(String nameInternal) {
		this.nameInternal = nameInternal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
package com.hb.utils.modle.diagnos.place;


import java.io.Serializable;
import java.util.List;

/**
 * 一级部位
 * @author txl
 *
 */
public class SuperPlace implements Serializable{
	private static final long serialVersionUID = 1L;
	private String description;
	private String id;
	private String keywords;
	private String name;
	private String place;
	private List<Places>   places;
	public synchronized String getDescription() {
		return description;
	}
	public synchronized void setDescription(String description) {
		this.description = description;
	}
	public synchronized String getId() {
		return id;
	}
	public synchronized void setId(String id) {
		this.id = id;
	}
	public synchronized String getKeywords() {
		return keywords;
	}
	public synchronized void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getPlace() {
		return place;
	}
	public synchronized void setPlace(String place) {
		this.place = place;
	}
	public synchronized List<Places> getPlaces() {
		return places;
	}
	public synchronized void setPlaces(List<Places> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "SuperPlace [description=" + description + ", id=" + id + ", keywords=" + keywords + ", name=" + name + ", place=" + place + ", places=" + places + "]";
	}
}

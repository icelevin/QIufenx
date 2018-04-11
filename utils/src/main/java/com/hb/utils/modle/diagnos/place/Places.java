package com.hb.utils.modle.diagnos.place;


import java.io.Serializable;

/**
 * 二级部位
 * @author txl
 */
public class Places implements Serializable{
	private static final long serialVersionUID = 1L;
	private String description;
	private String id;
	private String keywords;
	private String name;
	private String place;
	private String seq;
	private String title;
	public Places(String description, String id, String keywords, String name, String place, String seq, String title) {
		this.description = description;
		this.id = id;
		this.keywords = keywords;
		this.name = name;
		this.place = place;
		this.seq = seq;
		this.title = title;
	}
	public Places() {
	}
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
	public synchronized String getSeq() {
		return seq;
	}
	public synchronized void setSeq(String seq) {
		this.seq = seq;
	}
	public synchronized String getTitle() {
		return title;
	}
	public synchronized void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Places [description=" + description + ", id=" + id + ", keywords=" + keywords + ", name=" + name + ", place=" + place + ", seq=" + seq + ", title=" + title + "]";
	}
}

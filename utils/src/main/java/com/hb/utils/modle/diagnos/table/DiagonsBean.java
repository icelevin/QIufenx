package com.hb.utils.modle.diagnos.table;


import java.io.Serializable;


public class DiagonsBean implements Serializable{
	private static final long serialVersionUID = 1585219910277680624L;
	public static final String valueName = "DiagonsBean";
	
	private String name;// 疾病名称
	private String img;// 图片
	private String department;// 疾病科室
	private String place;// 疾病部位
	private String message;// 简介，摘要
	private String keywords;
	private String description;
	private String symptomtext;// 病状描述
	private String symptom;// 相关症状
	private String drug;// 相关药品
	private String drugtext;// 用药说明
	private String food;// 相关食品
	private String foodtext;// 健康保健
	private String causetext;// 病因
	private String checks;// 检测项目
	private String checktext;// 检测说明
	private String disease;// 并发疾病
	private String diseasetext;// 并发症状说明
	private String caretext;// 预防护理
	private int count;
	private int rcount;// 回复
	private int fcount;// 收藏
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getImg() {
		return img;
	}
	public synchronized void setImg(String img) {
		this.img = img;
	}
	public synchronized String getDepartment() {
		return department;
	}
	public synchronized void setDepartment(String department) {
		this.department = department;
	}
	public synchronized String getPlace() {
		return place;
	}
	public synchronized void setPlace(String place) {
		this.place = place;
	}
	public synchronized String getMessage() {
		return message;
	}
	public synchronized void setMessage(String message) {
		this.message = message;
	}
	public synchronized String getKeywords() {
		return keywords;
	}
	public synchronized void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public synchronized String getDescription() {
		return description;
	}
	public synchronized void setDescription(String description) {
		this.description = description;
	}
	public synchronized String getSymptomtext() {
		return symptomtext;
	}
	public synchronized void setSymptomtext(String symptomtext) {
		this.symptomtext = symptomtext;
	}
	public synchronized String getSymptom() {
		return symptom;
	}
	public synchronized void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public synchronized String getDrug() {
		return drug;
	}
	public synchronized void setDrug(String drug) {
		this.drug = drug;
	}
	public synchronized String getDrugtext() {
		return drugtext;
	}
	public synchronized void setDrugtext(String drugtext) {
		this.drugtext = drugtext;
	}
	public synchronized String getFood() {
		return food;
	}
	public synchronized void setFood(String food) {
		this.food = food;
	}
	public synchronized String getFoodtext() {
		return foodtext;
	}
	public synchronized void setFoodtext(String foodtext) {
		this.foodtext = foodtext;
	}
	public synchronized String getCausetext() {
		return causetext;
	}
	public synchronized void setCausetext(String causetext) {
		this.causetext = causetext;
	}
	public synchronized String getChecks() {
		return checks;
	}
	public synchronized void setChecks(String checks) {
		this.checks = checks;
	}
	public synchronized String getChecktext() {
		return checktext;
	}
	public synchronized void setChecktext(String checktext) {
		this.checktext = checktext;
	}
	public synchronized String getDisease() {
		return disease;
	}
	public synchronized void setDisease(String disease) {
		this.disease = disease;
	}
	public synchronized String getDiseasetext() {
		return diseasetext;
	}
	public synchronized void setDiseasetext(String diseasetext) {
		this.diseasetext = diseasetext;
	}
	public synchronized String getCaretext() {
		return caretext;
	}
	public synchronized void setCaretext(String caretext) {
		this.caretext = caretext;
	}
	public synchronized int getCount() {
		return count;
	}
	public synchronized void setCount(int count) {
		this.count = count;
	}
	public synchronized int getRcount() {
		return rcount;
	}
	public synchronized void setRcount(int rcount) {
		this.rcount = rcount;
	}
	public synchronized int getFcount() {
		return fcount;
	}
	public synchronized void setFcount(int fcount) {
		this.fcount = fcount;
	}
	@Override
	public String toString() {
		return "DiagonsBean [name=" + name + ", img=" + img + ", department=" + department + ", place=" + place + ", message=" + message + ", keywords=" + keywords + ", description=" + description
				+ ", symptomtext=" + symptomtext + ", symptom=" + symptom + ", drug=" + drug + ", drugtext=" + drugtext + ", food=" + food + ", foodtext=" + foodtext + ", causetext=" + causetext
				+ ", checks=" + checks + ", checktext=" + checktext + ", disease=" + disease + ", diseasetext=" + diseasetext + ", caretext=" + caretext + ", count=" + count + ", rcount=" + rcount
				+ ", fcount=" + fcount + "]";
	}
}

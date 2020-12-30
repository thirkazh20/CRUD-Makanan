package com.thirafikaz.crudmakanan.Model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseMakanan{

	@SerializedName("pesan")
	private String pesan;

	@SerializedName("data")
	private List<DataMakanan> data;

	@SerializedName("sukses")
	private boolean sukses;

	public void setPesan(String pesan){
		this.pesan = pesan;
	}

	public String getPesan(){
		return pesan;
	}

	public void setData(List<DataMakanan> data){
		this.data = data;
	}

	public List<DataMakanan> getData(){
		return data;
	}

	public void setSukses(boolean sukses){
		this.sukses = sukses;
	}

	public boolean isSukses(){
		return sukses;
	}

	@Override
 	public String toString(){
		return 
			"ResponseMakanan{" + 
			"pesan = '" + pesan + '\'' + 
			",data = '" + data + '\'' + 
			",sukses = '" + sukses + '\'' + 
			"}";
		}
}
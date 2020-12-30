package com.thirafikaz.crudmakanan.Model;


import com.google.gson.annotations.SerializedName;

public class DataMakanan {

	@SerializedName("menu_harga")
	private String menuHarga;

	@SerializedName("menu_gambar")
	private String menuGambar;

	@SerializedName("menu_nama")
	private String menuNama;

	@SerializedName("menu_id")
	private String menuId;

	public void setMenuHarga(String menuHarga){
		this.menuHarga = menuHarga;
	}

	public String getMenuHarga(){
		return menuHarga;
	}

	public void setMenuGambar(String menuGambar){
		this.menuGambar = menuGambar;
	}

	public String getMenuGambar(){
		return menuGambar;
	}

	public void setMenuNama(String menuNama){
		this.menuNama = menuNama;
	}

	public String getMenuNama(){
		return menuNama;
	}

	public void setMenuId(String menuId){
		this.menuId = menuId;
	}

	public String getMenuId(){
		return menuId;
	}

	@Override
 	public String toString(){
		return 
			"DataMakanan{" +
			"menu_harga = '" + menuHarga + '\'' + 
			",menu_gambar = '" + menuGambar + '\'' + 
			",menu_nama = '" + menuNama + '\'' + 
			",menu_id = '" + menuId + '\'' + 
			"}";
		}
}
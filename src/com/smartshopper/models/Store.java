package com.smartshopper.models;

import com.smartshopper.models.dbo.StoreDBO;

public class Store {

	private String id;
	private String title;
	private String barcode;
	

	private Address address;
	private String displayAddress;
	private String phone;
	private String email;
	private Location location;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	public Store(StoreDBO storeDBO){
		this.id = storeDBO.getId();
		this.title = storeDBO.getTitle();
		this.barcode = storeDBO.getBarcode();
		this.address = storeDBO.getAddress();
		this.displayAddress = generateDisplayAddress(storeDBO.getAddress(), storeDBO.getTitle());
		this.phone = storeDBO.getPhone();
		this.email = storeDBO.getEmail();
		this.location = storeDBO.getlocation();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDisplayAddress() {
		return displayAddress;
	}

	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String generateDisplayAddress(Address address, String storeTitle){
		StringBuffer displayAddrBuffer = new StringBuffer();
		displayAddrBuffer.append(storeTitle);
		displayAddrBuffer.append(", ");
		displayAddrBuffer.append(address.getAddressLine1());
		displayAddrBuffer.append(", ");
		displayAddrBuffer.append(address.getCity());
		
		return displayAddrBuffer.toString();
	}

}

package com.example.load.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Loads {
	@Id
	private long loadId;
   private String loadingPoint,unLoadingPoint,productType,truckType,weight,date;
   private long noOfTrucks,shipperId;
   
   public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loads(long loadId, String loadingPoint, String unLoadingPoint, String productType, String truckType,
			long noOfTrucks, String weight, long shipperId, String date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unLoadingPoint = unLoadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.date = date;
	}
   
public long getLoadId() {
	return loadId;
}
public void setLoadId(long loadId) {
	this.loadId = loadId;
}
public String getTruckType() {
	return truckType;
}
public void setTruckType(String truckType) {
	this.truckType = truckType;
}
public long getNoOfTrucks() {
	return noOfTrucks;
}
public void setNoOfTrucks(long noOfTrucks) {
	this.noOfTrucks = noOfTrucks;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public long getShipperId() {
	return shipperId;
}
public void setShipperId(long shipperId) {
	this.shipperId = shipperId;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getLoadingPoint() {
	return loadingPoint;
}
public void setLoadingPoint(String loadingPoint) {
	this.loadingPoint = loadingPoint;
}
public String getUnLoadingPoint() {
	return unLoadingPoint;
}
public void setUnLoadingPoint(String unLoadingPoint) {
	this.unLoadingPoint = unLoadingPoint;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
@Override
public String toString() {
	return "Loads [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unLoadingPoint=" + unLoadingPoint
			+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight="
			+ weight + ", shipperId=" + shipperId + ", date=" + date + "]";
}


}

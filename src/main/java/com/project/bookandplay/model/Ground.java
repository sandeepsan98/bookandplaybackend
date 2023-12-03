package com.project.bookandplay.model;

import java.time.LocalTime;
import java.util.List;



/**
 * Ground Detail module Created Ground Class and its Associated
 * attributes,constructors and getters and setters
 *
 */

public class Ground {

	private int groundId;
	private String groundName;
	private String groundMainArea;
	private String groundAddress;
	private String groundLocationLink;
	private String district;
	private List<String> groundImages;
	private List<String> sportsAvailable;
	private LocalTime startTime;
	private LocalTime endTime;
	private String groundRules;
	private double price;
	private double increasingPriceForExtraHours;
	private int courtsAvailable;
	private int groundOwnerId;
	private double ratings;
	private GroundOwner groundOwner;
	
	

	
	

	
	/**
	 * Constructor 1
	 */

	
	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Ground [groundId=" + groundId + ", groundName=" + groundName + ", groundMainArea=" + groundMainArea
				+ ", groundAddress=" + groundAddress + ", groundLocationLink=" + groundLocationLink + ", district="
				+ district + ", groundImages=" + groundImages + ", sportsAvailable=" + sportsAvailable + ", startTime="
				+ startTime + ", endTime=" + endTime + ", groundRules=" + groundRules + ", price=" + price
				+ ", increasingPriceForExtraHours=" + increasingPriceForExtraHours + ", courtsAvailable="
				+ courtsAvailable + ", groundOwnerId=" + groundOwnerId + ", ratings=" + ratings + ", groundOwner="
				+ groundOwner + "]";
	}

	/**
	public Ground(int groundId, String groundName, String groundMainArea, String groundAddress,
			String groundLocationLink, String district, List<String> groundImages, List<String> sportsAvailable,
			LocalTime startTime, LocalTime endTime, String groundRules, double price,
			double increasingPriceForExtraHours, int courtsAvailable) {
		
	
		super();
		this.groundId = groundId;
		this.groundName = groundName;
		this.groundMainArea = groundMainArea;
		this.groundAddress = groundAddress;
		this.groundLocationLink = groundLocationLink;
		this.district = district;
		this.groundImages = groundImages;
		this.sportsAvailable = sportsAvailable;
		this.startTime = startTime;
		this.endTime = endTime;
		this.groundRules = groundRules;
		this.price = price;
		this.increasingPriceForExtraHours = increasingPriceForExtraHours;
		this.courtsAvailable = courtsAvailable;
	}
	*/
	/**
	 *  Default Constructor 
	 */

	public Ground() {
		
		/**
		 *  Default Constructor 
		 */
	}

	/**
	 * Setters and Getters Method
	 */

	public GroundOwner getGroundOwner() {
		return groundOwner;
	}

	public void setGroundOwner(GroundOwner groundOwner) {
		this.groundOwner = groundOwner;
	}
	
	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}

	public int getGroundId() {
		return groundId;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getGroundMainArea() {
		return groundMainArea;
	}

	public void setGroundMainArea(String groundMainArea) {
		this.groundMainArea = groundMainArea;
	}

	public String getGroundAddress() {
		return groundAddress;
	}

	public void setGroundAddress(String groundAddress) {
		this.groundAddress = groundAddress;
	}

	public String getGroundLocationLink() {
		return groundLocationLink;
	}

	public void setGroundLocationLink(String groundLocationLink) {
		this.groundLocationLink = groundLocationLink;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public List<String> getGroundImages() {
		return groundImages;
	}

	public void setGroundImages(List<String> groundImages) {
		this.groundImages = groundImages;
	}

	public List<String> getSportsAvailable() {
		return sportsAvailable;
	}

	public void setSportsAvailable(List<String> sportsAvailable) {
		this.sportsAvailable = sportsAvailable;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getGroundRules() {
		return groundRules;
	}

	public void setGroundRules(String groundRules) {
		this.groundRules = groundRules;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIncreasingPriceForExtraHours() {
		return increasingPriceForExtraHours;
	}

	public void setIncreasingPriceForExtraHours(double increasingPriceForExtraHours) {
		this.increasingPriceForExtraHours = increasingPriceForExtraHours;
	}

	public int getCourtsAvailable() {
		return courtsAvailable;
	}

	public void setCourtsAvailable(int courtsAvailable) {
		this.courtsAvailable = courtsAvailable;
	}
	
	
	public int getGroundOwnerId() {
		return groundOwnerId;
	}

	public void setGroundOwnerId(int groundOwnerId) {
		this.groundOwnerId = groundOwnerId;
	}

}

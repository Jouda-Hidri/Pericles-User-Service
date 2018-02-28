package pericles.userservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSubscription {

	long idCardNumber;
	String name;
	long zone;

	public UserSubscription() {

	}

	public UserSubscription(long idCardNumer, String name, long zone) {
		idCardNumber = idCardNumer;
		this.name = name;
		this.zone = zone;
	}

	public long getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(long idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getZone() {
		return zone;
	}

	public void setZone(long zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "[" + idCardNumber + "] " + name + " : " + zone;
	}

}

package com.wu.ecommerce.dto;
 
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
//@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class User {
	public User(String userId, String userName, String address) throws InvalidIdException, InvalidPriceException {
		super();
		this.setUserId(userId);
		this.userName = userName;
		this.address = address;
	}

 
	private String userId;
	@Setter
	private String userName;
	private String address;
	public void setUserId(String userId) throws InvalidIdException {
		if(userId==null || userId.equals("")|| userId.length()<3)
		{
			throw new InvalidIdException("Id is Invalid");
		}
		this.userId = userId;
	}

	
 
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName 
				+ ", Address=" + Address + ", getUserId()=" + getUserId() + ", getUserName()="
				+ getUserName() + ", getAddress()=" + getAddress()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
 
 
	private String Address;
}
package com.wu.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;
//@Setter
@Getter
@ToString
@EqualsAndHashCode
//@AllArgsConstructor
@NoArgsConstructor

public class Order {
	public Order(String fName, String lName, int cntNum, String orderId, String orderDate, String userId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.cntNum = cntNum;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userId = userId;
	}
	private String fName;
	private String lName;
	private int cntNum;
	private String orderId;
	private String orderDate;
	private String userId;
}

package com.wu.ecommerce.dto;

import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;

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

public class Product
//implements Comparable<Product> 
{

public Product(String productId, String productName, String categoryName, float price)
			throws InvalidIdException, InvalidPriceException {
		super();
		// this.productId = productId;
		this.setProductId(productId);
		this.productName = productName;
		this.setPrice(price);
		this.categoryName = categoryName;

	}

	public void setProductId(String productId) throws InvalidIdException {
		if (productId == null || productId.equals("") || productId.length() < 3) {
			// raise the exception
			throw new InvalidIdException("id is invalid");
		}
		this.productId = productId;
	}

	public void setPrice(float price) throws InvalidPriceException {
		if (price == 0 || price < 0) {
			throw new InvalidPriceException("price is invalid");
		}
		this.price = price;
	}

	@Setter
	private String productId;
	@Setter
	private String productName;
	@Exclude
	private float price;
	@Setter
	private String categoryName;
	// @Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return this.productId.compareTo(o.productId);
//	}

}

package ecommerce_jee_projects.entity;

import java.awt.Image;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int productId;
	private String productName;
	private String productColor;
	private double productPrice;
	private int productQuantity;
	private String productBrand;
	private Image brandImage;

	private int ownerId;
	
}

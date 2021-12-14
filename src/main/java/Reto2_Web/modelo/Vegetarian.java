/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.modelo;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USUARIO
 */
@Document(collection = "vegetarian")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Vegetarian {
    @Id
    private String reference;
    private String brand;
    private String category;
   // private String objetivo;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPhotography() {
		return photography;
	}
	public void setPhotography(String photography) {
		this.photography = photography;
	}
	public Vegetarian() {
		super();
	}

	
    
	
}

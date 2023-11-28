package pl.strefakursow.eLunchApp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	@NotNull
	private UUID uuid;

	@NotBlank
	private String name;

	@NotNull
	@OneToMany
	private List<Ingredient> ingredients;

	@Nullable
	@OneToOne
	private Dish dish;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Nullable
	public Dish getDish() {
		return dish;
	}

	public void setDish(@Nullable Dish dish) {
		this.dish = dish;
	}
}

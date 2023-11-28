package pl.strefakursow.eLunchApp.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import jakarta.annotation.Nullable;
import java.util.List;

@Entity
@DiscriminatorValue("deliverer")
public class Deliverer extends pl.strefakursow.eLunchApp.model.Employee {

	@Nullable
	@OneToMany(mappedBy = "deliverer")
	private List<Order> orderDTOS;


	@Nullable
	public List<Order> getOrders() {
		return orderDTOS;
	}

	public void setOrders(@Nullable List<Order> orderDTOS) {
		this.orderDTOS = orderDTOS;
	}
}

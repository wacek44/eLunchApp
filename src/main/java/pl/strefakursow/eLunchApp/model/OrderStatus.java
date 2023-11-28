package pl.strefakursow.eLunchApp.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

@Embeddable
public class OrderStatus {

	@NotNull
	private Instant orderTime;

	@NotNull
	private Boolean isPaid;

	@NotNull
	private Instant giveOutTime;

	@NotNull
	private Instant deliveryTime;


	public Instant getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Instant orderTime) {
		this.orderTime = orderTime;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setPaid(Boolean paid) {
		isPaid = paid;
	}

	public Instant getGiveOutTime() {
		return giveOutTime;
	}

	public void setGiveOutTime(Instant giveOutTime) {
		this.giveOutTime = giveOutTime;
	}

	public Instant getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Instant deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}

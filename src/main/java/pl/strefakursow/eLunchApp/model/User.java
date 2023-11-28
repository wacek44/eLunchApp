package pl.strefakursow.eLunchApp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import pl.strefakursow.eLunchApp.model.enums.Archive;

import java.util.List;
import java.util.UUID;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	@NotNull
	private UUID uuid;

	@NotNull
	@Embedded
	private PersonalData personalData;

	@Nullable
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DeliveryAddress> deliveryAddress;

	@NotNull
	@Embedded
	private LogginData logginData;

	@Nullable
	@OneToMany(mappedBy = "user")
	private List<Order> orderDTOS;

	@NotNull
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OperationEvidence> operationEvidence;

	@Nullable
	@ManyToMany(mappedBy = "users")
	private List<DiscountCode> discountCodes;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Archive archive;


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

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	@Nullable
	public List<DeliveryAddress> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(@Nullable List<DeliveryAddress> addresses) {
		this.deliveryAddress = addresses;
	}

	public LogginData getLogginData() {
		return logginData;
	}

	public void setLogginData(LogginData logginData) {
		this.logginData = logginData;
	}

	@Nullable
	public List<Order> getOrders() {
		return orderDTOS;
	}

	public void setOrders(@Nullable List<Order> orderDTOS) {
		this.orderDTOS = orderDTOS;
	}

	public List<OperationEvidence> getOperationEvidence() {
		return operationEvidence;
	}

	public void setOperationEvidence(List<OperationEvidence> operationEvidences) {
		this.operationEvidence = operationEvidences;
	}

	@Nullable
	public List<DiscountCode> getDiscountCodes() {
		return discountCodes;
	}

	public void setDiscountCodes(@Nullable List<DiscountCode> discountCodes) {
		this.discountCodes = discountCodes;
	}

	public Archive getArchive() {
		return archive;
	}

	public void setArchive(Archive archive) {
		this.archive = archive;
	}
}

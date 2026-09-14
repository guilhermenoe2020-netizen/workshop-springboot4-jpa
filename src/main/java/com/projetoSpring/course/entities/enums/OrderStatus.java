package com.projetoSpring.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), 
	PAID(2), 
	SHIPPED(3),
	DELIVERED(4), 
	CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	// deixando acessivel
	public int getCode() {
		return code;
	}

	// convertendo valor numerico para tipo enumerado,
	// esse metodo por ser static nao precisa estanciar para funcionar

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		// se nao achar o code, lanco uma execao
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}

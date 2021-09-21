package com.springboot.curso.entities.enums;

public enum OrderStatus {
	WAITTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	/**
	 * Busca e retorna um status do pedido baseado
	 * no código informado no parâmetro
	 * 
	 * @param code código referente a um status
	 * @return o status do pedido referente ao código informado
	 */
	public static OrderStatus valueOf(int code) {
		// percorrendo todos os valores possíveis do OrderStatus
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code)
				return value;
		}
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
}

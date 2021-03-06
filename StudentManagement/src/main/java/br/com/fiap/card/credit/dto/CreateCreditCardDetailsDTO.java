package br.com.fiap.card.credit.dto;

import java.math.BigDecimal;

public class CreateCreditCardDetailsDTO {

	private int operationId;
	private String studentId;
	private String descriptionOperation;
	private String dateOperation;
	private char typeOperation;
	private BigDecimal valueOperation;

	public int getOperationId() {
		return operationId;
	}

	public void setOperationId(int operationId) {
		this.operationId = operationId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getDescriptionOperation() {
		return descriptionOperation;
	}

	public void setDescriptionOperation(String descriptionOperation) {
		this.descriptionOperation = descriptionOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public char getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(char typeOperation) {
		this.typeOperation = typeOperation;
	}

	public BigDecimal getValueOperation() {
		return valueOperation;
	}

	public void setValueOperation(BigDecimal valueOperation) {
		this.valueOperation = valueOperation;
	}
}
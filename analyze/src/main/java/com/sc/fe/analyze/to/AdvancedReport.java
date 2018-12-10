package com.sc.fe.analyze.to;

import java.io.Serializable;
import java.util.List;

/**
 * @author hemant
 *
 */
public class AdvancedReport implements Serializable {
	
	private static final long serialVersionUID = -3742223075854910617L;
	
	/**
	 * Customer inputs
	 */
	private CustomerInputs customerInputs;
	/**
	 * Details about the files we found while processing
	 */
	private List<FileDetails> fileDetails;
	
	public CustomerInputs getCustomerInputs() {
		return customerInputs;
	}

	public void setCustomerInputs(CustomerInputs customerInputs) {
		this.customerInputs = customerInputs;
	}

	public List<FileDetails> getFileDetails() {
		return fileDetails;
	}

	public void setFileDetails(List<FileDetails> fileDetails) {
		this.fileDetails = fileDetails;
	}

	
}

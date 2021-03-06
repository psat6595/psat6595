/*
 * ArNel: Copyright (c) 2015 ArNel Corporation. All rights reserved. THIS
 * SOFTWARE CONTAINS CONFIDENTIAL INFORMATION AND TRADE SECRETS OF ArNel
 * Tech. USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE PRIOR
 * EXPRESS WRITTEN PERMISSION OF ArNel Tech. The Licensed Software and
 * Documentation are deemed to be commercial computer software as defined in FAR
 * 12.212 and subject to restricted rights as defined in FAR Section 52.227-19
 * "Commercial Computer Software - Restricted Rights" and DFARS 227.7202,
 * "Rights in Commercial Computer Software or Commercial Computer Software
 * Documentation", as applicable, and any successor regulations. Any use,
 * modification, reproduction release, performance, display or disclosure of the
 * Licensed Software and Documentation by the Government shall be solely in
 * accordance with the terms of this Agreement.
 */
package com.smsys.accounts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="account")
public class AccountInfo {

	@Id
    private String id;
	@Field
	private String accountId;
	@Field
	private String name;
	@Field
	private Address address;
	@Field
	private PhoneNumber primaryPhoneNumber;
	@Field
	private PhoneNumber secondaryPhoneNumber;
	@Field
	private String accountType;

	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public void setId(final String id) {
		this.id = id;
	}
	
	/**
	 * Gets the value of the accountId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * Sets the value of the accountId property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setAccountId(final String value) {
		this.accountId = value;
	}

	/**
	 * Gets the value of the name property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setName(final String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the address property.
	 *
	 * @return possible object is {@link Address }
	 *
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 *
	 * @param value
	 *            allowed object is {@link Address }
	 *
	 */
	public void setAddress(final Address value) {
		this.address = value;
	}

	/**
	 * Gets the value of the primaryPhoneNumber property.
	 *
	 * @return possible object is {@link PhoneNumber }
	 *
	 */
	public PhoneNumber getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	/**
	 * Sets the value of the primaryPhoneNumber property.
	 *
	 * @param value
	 *            allowed object is {@link PhoneNumber }
	 *
	 */
	public void setPrimaryPhoneNumber(final PhoneNumber value) {
		this.primaryPhoneNumber = value;
	}

	/**
	 * Gets the value of the secondaryPhoneNumber property.
	 *
	 * @return possible object is {@link PhoneNumber }
	 *
	 */
	public PhoneNumber getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	/**
	 * Sets the value of the secondaryPhoneNumber property.
	 *
	 * @param value
	 *            allowed object is {@link PhoneNumber }
	 *
	 */
	public void setSecondaryPhoneNumber(final PhoneNumber value) {
		this.secondaryPhoneNumber = value;
	}	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(accountId)
				.append(name).append(address).append(primaryPhoneNumber)
				.append(secondaryPhoneNumber).hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		final AccountInfo rhs = (AccountInfo) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
				.append(accountId, rhs.accountId)				
				.append(name, rhs.name).append(address, rhs.address)
				.append(primaryPhoneNumber, rhs.primaryPhoneNumber)
				.append(secondaryPhoneNumber, rhs.secondaryPhoneNumber)
				.isEquals();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("accountId", accountId)
				.append("name", name).append("address", address)
				.append("primaryPhoneNumber", primaryPhoneNumber)
				.append("secondaryPhoneNumber", secondaryPhoneNumber)
				.toString();
	}

}

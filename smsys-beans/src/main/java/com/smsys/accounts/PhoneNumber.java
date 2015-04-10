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

public class PhoneNumber {


    protected String number;
    protected String type;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }


}

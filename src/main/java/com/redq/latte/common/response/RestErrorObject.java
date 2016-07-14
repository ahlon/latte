/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.common.response;

/**
 * 
 * @author tonghu
 * @version $Id: RestErrorObject.java, v 0.1 2015年10月15日 下午3:46:19 tonghu Exp $
 */
public class RestErrorObject {
    
    private String code;
    
    private String msg;
    
    private String cause;
    
    /**
     * Getter method for property <tt>cause</tt>.
     * 
     * @return property value of cause
     */
    public String getCause() {
        return cause;
    }

    /**
     * Setter method for property <tt>cause</tt>.
     * 
     * @param cause value to be assigned to property cause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * 
     */
    public RestErrorObject() {
        super();
    }
    
    public RestErrorObject(String code, String msg) {
        super();
    }
    

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     * 
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for property <tt>msg</tt>.
     * 
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}

/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.common.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author tonghu
 * @version $Id: ResponseErrorObject.java, v 0.1 2015年10月15日 下午3:43:15 tonghu Exp $
 */
public class RestErrorResponse extends RestResponse {
    
    private List<RestErrorObject> errors;
    
    /**
     * 
     */
    public RestErrorResponse() {
        super();
    }
    
    /**
     * @param errors
     */
    public RestErrorResponse(RestErrorObject error) {
        super();
        this.errors = new ArrayList<RestErrorObject>();
        this.errors.add(error);
    }
    
    /**
     * @param errors
     */
    public RestErrorResponse(List<RestErrorObject> errors) {
        super();
        this.errors = errors;
    }

    /**
     * Getter method for property <tt>errors</tt>.
     * 
     * @return property value of errors
     */
    public List<RestErrorObject> getErrors() {
        return errors;
    }

    /**
     * Setter method for property <tt>errors</tt>.
     * 
     * @param errors value to be assigned to property errors
     */
    public void setErrors(List<RestErrorObject> errors) {
        this.errors = errors;
    }
    
}

package com.pro.wings.SpringBootCrudOperation.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String resourceName;  //we are going to return resource name that not existing in database to the client
	
	private String fieldName;
	
	private Object fieldValue;
    
    public ResourceNotFoundException(String resourceName,String fieldName,Object fieldValue) {
		
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
		
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
    
    public String getResourceName() {
		return resourceName;
	}
    
    public String getFieldName() {
    	return fieldName;
    }
	
    public Object getFieldValue() {
    	return fieldValue;
    }
	
	
	

}

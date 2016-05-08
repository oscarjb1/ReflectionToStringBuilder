package com.oscarblancarte.tostring;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ToStringCommonsLang {
	
	public static void main(String[] args) {
		Customer customer = createCustomer();
		
		System.out.println("DEFAULT_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.DEFAULT_STYLE));
		
		System.out.println("\nJSON_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.JSON_STYLE));
		
		System.out.println("\nMULTI_LINE_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.MULTI_LINE_STYLE));
		
		System.out.println("\nNO_CLASS_NAME_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.NO_CLASS_NAME_STYLE));
		
		System.out.println("\nNO_FIELD_NAMES_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.NO_FIELD_NAMES_STYLE));
		
		System.out.println("\nSHORT_PREFIX_STYLE .....");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.SHORT_PREFIX_STYLE));
		
		System.out.println("\nMULTI_LINE_STYLE .....\n");
		System.out.println(ReflectionToStringBuilder.toString(customer, ToStringStyle.MULTI_LINE_STYLE));
		
		System.out.println("\nRecursiveToStringStyle .....\n");
		System.out.println(ReflectionToStringBuilder.toString(customer, new RecursiveToStringStyle() ));
	}
	
	private static Customer createCustomer(){
		Customer customer = new Customer();
		customer.setName("Oscar Blancarte");
		customer.setTel("+51 4343343434");
		customer.setAddress(new Address());
		
		Address addres = customer.getAddress();
		addres.setAddress1("Dirección primaria del cliente");
		addres.setAddress2("Dirección sucundaria del cliente");
		return customer;
		
	}
}

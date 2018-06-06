package com.example.jpetstore.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.jpetstore.controller.P2PForm;
import com.example.jpetstore.domain.P2P;

@Component
public class P2PFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return P2PForm.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		
		P2PForm p2pForm = (P2PForm)obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemName", "ITEM_NAME_REQUIRED", "Item name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "LAST_NAME_REQUIRED", "Last name is required.");
		


		//		if (p2pForm.getPrice() == 0) {
		//			errors.rejectValue("price", "0원 이상이여야 합니다.");
		//		}
		//		if (p2pForm.getQuantity() == 0) {
		//			errors.rejectValue("quantity", "재고가 0개 이상이여야 합니다.");
		//		}




	}

}

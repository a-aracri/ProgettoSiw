package it.uniroma3.siw.progetto.services;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.siw.progetto.model.Admin;

@Component
public class AdminValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Admin.class.equals(aClass);
	}

	@Override
	public void validate(Object target, Errors error) {
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "username", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "password", "required");
	}

}

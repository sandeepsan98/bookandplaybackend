package com.project.bookandplay.validator;

import com.project.bookandplay.errors.ChatMessageErrors;
import com.project.bookandplay.errors.GroundOwnerDetailValidationErrors;
import com.project.bookandplay.exceptions.InvalidMessageException;

public class ChatMessageValidator {

	public ChatMessageValidator() {
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean textValidator(String text) throws InvalidMessageException {
		/**
		 * firstName null and empty string check
		 */
		if (text == null || "".equals(text)) {
			throw new InvalidMessageException(ChatMessageErrors.INVALID_TEXT_NULL);
		}
	

		return true;

	}
}

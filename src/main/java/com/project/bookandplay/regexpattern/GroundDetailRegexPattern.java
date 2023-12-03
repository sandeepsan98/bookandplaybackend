package com.project.bookandplay.regexpattern;

public class GroundDetailRegexPattern {
	
	
	 private GroundDetailRegexPattern() {
	//  private constructor
	}
	public static final String GROUND_CHARACTER_REGEX = "^[a-zA-Z ]{2,35}$";
	 public static final String GROUND_IMAGES_REGEX = "(?i)\\b((https?|ftp)://)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?\\.(jpg|jpeg|gif|png|bmp)\\b";
	 public static final String GROUND_RULES_REGEX = "^[A-Za-z0-9\\s\\p{P}]{7,300}$";
	 public static final String GROUND_LOCATION_REGEX ="\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
	 public static final String GROUND_ADDRESS_REGEX ="^[A-Za-z0-9\\s\\p{P}]{7,170}$";
	 
	 //"^[a-zA-Z0-9\\\\p{Punct}\\\\s]{10,250}$"
}

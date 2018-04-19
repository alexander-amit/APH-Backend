package alka.publishing.house.model;

public enum CustomEnum {
	
	FIRST_YEAR("FIRST_YEAR"),
	SECOND_YEAR("SECOND_YEAR"),
	THRID_YEAR("THRID_YEAR"),
	COMMERCE_STREAM("COMMERCE_STREAM"),
	ART_STREAM("ART_STREAM"),
	SCIENCE_STREAM("SCIENCE_STREAM"),
	ACCOUNTANCE_SUBJECT("ACCOUNTANCE_SUBJECT"),
	SCIENCE_SUBJECT("SCIENCE_SUBJECT"),
	BUSSINESS_STUDY_SUBJECT("BUSSINESS_STUDY_SUBJECT");

	
	private String value; 
    
    CustomEnum(String status) {
    	this.value=status;
    }
    
    public String getValue()
    {
    	return value;
    }
    public static CustomEnum fromValue(String text) {
        for (CustomEnum b : CustomEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
            return b;
          }
        }
        return null;
      }


}

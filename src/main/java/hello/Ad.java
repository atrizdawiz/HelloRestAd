public class Ad {
    // variable declarations
    int id=0;
	enum Category{
		GUITAR, BRASS, SYNTHESIZER, EFFECT_PEDAL
		}

    String title; 
	String body;
	String userName;
	String userEmail;
	String userPhoneNumber;
	String imageUrl;
	
	// Constructors
	Ad(String titleSelection, String bodySelection, String userNameSelection,
		String userEmailSelection, String userPhoneNumberSelection, String imageUrlSelection) {
		this.id = id;
		title = titleSelection;
		body = bodySelection;
		userName = userNameSelection;
		userEmail = userEmailSelection;
		userPhoneNumber = userPhoneNumberSelection;
		imageUrl = imageUrlSelection;	
		id++;
	}

}
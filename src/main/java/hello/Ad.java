public class Ad {
    // variable declarations
    int id=1;
	
	enum Category{
		GUITAR(1), BRASS(2), SYNTHESIZER(3), EFFECT_PEDAL(4);
		Category(int categoryNumber) {
			this.categorySelection = categorySelection;
		}
		private final int categorySelection;
		
		public int getCategorySelection(){
				return categorySelection;
		}	
	}
	String category;
    String title; 
	String body;
	String userName;
	String userEmail;
	String userPhoneNumber;
	String imageUrl;
	
	// Constructors
	Ad(int categorySelection, String titleSelection, String bodySelection, String userNameSelection, 
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
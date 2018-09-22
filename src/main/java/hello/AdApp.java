class AdApp {
    
	public static void main(String[] args) {
	    // Creating first ad object and setting its state
	    Ad ad1 = new Ad(1, "Gibson SG med förstärkare", "En fin gitarr som har allt man kan önska, förstärkare följer med också.", "Försäljar-Valle", "valle@gmail.com", "4343 5545 3",  "https://upload.wikimedia.org/wikipedia/commons/c/c4/Gibson_SG_Standard_2006.jpg");

		// Print ad1
		System.out.println("Id: "+ ad1.id+ ", Title: "+ad1.title+", Body: " + ad1.body +
                "User Name: "+ad1.userName+", + ", User Email: " + ad1.userEmail +
                "User Phone number: " + ad1.userPhoneNumber + ", Image URL: " + ad1.adImageUrl);

		/*
		// Update ad1.
		ad1.updateAd("Gibson SG trasig med förstärkare", "Guitars", "https://upload.wikimedia.org/wikipedia/commons/c/c4/Gibson_SG_Standard_2006.jpg");
		System.out.println("Updated ad1 to " + "Id: "+ ad1.adId+ ", Name: "+ad1.adName+", Category: "+ad1.adCategory+", Image URL: "+ad1.adImageUrl);*/
	}
}
class AdApp {
    
	public static void main(String[] args) {
	    // Creating first ad object and setting its state
	    Ad ad1 = new Ad("Gibson SG med förstärkare", "En fin gitarr som har allt man kan önska, förstärkare följer med också.", "Försäljar-Valle", "valle@gmail.com", "4343 5545 3",  "https://upload.wikimedia.org/wikipedia/commons/c/c4/Gibson_SG_Standard_2006.jpg");

		// Print ad1
		System.out.println("Id: "+ ad1.id+ ",\n Title: "+ad1.title+", \n Body: " + ad1.body +
                ", \n User Name: " + ad1.userName +  ", \n User Email: " + ad1.userEmail +
                ", \n User Phone number: " + ad1.userPhoneNumber + ", \n Image URL: " + ad1.imageUrl);

		/*
		// Update ad1.
		ad1.updateAd("Gibson SG trasig med förstärkare", "Guitars", "https://upload.wikimedia.org/wikipedia/commons/c/c4/Gibson_SG_Standard_2006.jpg");
		System.out.println("Updated ad1 to " + "Id: "+ ad1.adId+ ", Name: "+ad1.adName+", Category: "+ad1.adCategory+", Image URL: "+ad1.adImageUrl);*/
	}
}
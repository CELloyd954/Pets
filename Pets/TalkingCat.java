public class TalkingCat extends Cat{
    
    public String catTalking(){
        if(isHappy() = true){
            return response;
        }else{
            return str;
        }
    }

    private String getRandomHappy() {
		final int happyResponse = 4;
		double r = Math.random();
		int whichResponse = (int) (r * happyResponse);
		String response = "";

		if (whichResponse == 0) {
			response = "Thanks Human master";
		} else if (whichResponse == 1) {
			response = "Mmmm, Thank you";
		} else if (whichResponse == 2) {
			response = "Im glad you take care of me";
		} else if (whichResponse == 3) {
			response = "I love you human!";
		}

	}

    private String getRandomAngry() {
		final int angryResponse = 4;
		double q = Math.random();
		int pickResponse = (int) (q * angryResponse);
		String str = "";

		if (pickResponse == 0) {
			str = "ARRG";
		} else if (pickResponse == 1) {
			str = "You make me sick";
		} else if (pickResponse == 2) {
			str = "I hate you!";
		} else if (pickResponse == 3) {
			str = "Go away!";
		}

		return str;
	}
}
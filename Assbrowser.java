package instalselenium;

public class Assbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Firefox Br = new Firefox();
	        System.out.println("Browser Version: " + Br.browserVersion);
	        System.out.println("Browser Name: " + Br.browserName);
	        System.out.println("Page Loaded: " + Br.pageLoaded);
	        System.out.println("Number of Browsers: " + Br.noOfBrowser);
	        System.out.println("Browser Logo: " + Br.browserLogo);
	    }
	}

	class Firefox {

	    float browserVersion = 87.0F;
	    String browserName = "Firefox";
	    boolean pageLoaded = true;
	    int noOfBrowser = 1;
	    char browserLogo = 'F';
		

	

}

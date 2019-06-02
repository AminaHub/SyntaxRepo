package com.class28;

/*
 *Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), 
 *maximizeWindow(), 
 *findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver. 
 * 
 * 
 */

public interface WebDriver {
	//compiler will add public abstract automatically if it is not added
	 void openBrowser();
	 void closeBrowser();
	 void maximizeWindow();
	 void findElement();
	

}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome Driver open browser");
		
	}

	@Override
	public void closeBrowser(){
		System.out.println("Chrome Driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome Driver max window");
		
	}
	
	@Override
	public void findElement() {
		System.out.println("Chrome Driver find element");
		
	}
	
}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox Driver open browser");
		
	}

	@Override
	public void closeBrowser(){
		System.out.println("Firefox Driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox Driver max browser");
		
	}
	
	@Override
	public void findElement() {
		System.out.println("Firefox Driver find element");
		
	}
	
}



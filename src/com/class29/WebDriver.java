package com.class29;

/*
 *Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), 
 *maximizeWindow(), 
 *findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver. 
 * 
 * 
 */

public interface WebDriver extends TakesScreenShots{    
	void openBrowser();    
	void closeBrowser();    
	void maximizeWindow();    
	void findElement();
}
class ChromeDriver extends Browser implements WebDriver, Report{    
	@Override    
	public void openBrowser() {        
		System.out.println("Chrome opens the browser");            
	}    
	@Override    
	public void closeBrowser() {        
		System.out.println("Chrome closes the browser");            
	}    
	@Override    
	public void maximizeWindow() {        
		System.out.println("Chrome can maximize the window");            
	}    
	@Override    
	public void findElement() {        
		System.out.println("Chrome can find an element");            
	}    
	@Override    
	public void getReport() {        
		System.out.println("Report from Chrome driver");            
	}    
	@Override    
	public void refreshBrowser() {       
		System.out.println("Chrome refreshes the browser");    
	}    
	@Override    
	public void takesScreenShot() {        
		System.out.println("Taking screen shot in Chrome browser");            
	}
	}
class FirefoxDriver extends Browser implements WebDriver, Report {    
	@Override    
	public void openBrowser() {        
		System.out.println("Firefox can open a browser");        
	}    
	@Override    
	public void closeBrowser() {        
		System.out.println("Firefox can close a browser");            
	}    
	@Override    
	public void maximizeWindow() {        
		System.out.println("Firefox can maximize the window");    
	}    
	@Override    
	public void findElement() {        
		System.out.println("Firefox can find an element");    
	}    
	@Override    
	public void refreshBrowser() {        
		System.out.println("Firefox can refresh the browser");           
	}    
	@Override    
	public void getReport() {        
		System.out.println("Report from Firefox driver");    
	}    
	@Override    
	public void takesScreenShot() {        
		System.out.println("Taking screen shot in Firefox browser");
	}        
}
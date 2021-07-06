package JavaSessions.Assignments;

import java.util.ArrayList;
import java.util.List;

/*2. Design a browser class template with the following features:
	 variables:
	browserName
	vendorName
	currentVersion
	List of plugins supported by Browser in Array List<String>
	--Design the constructor of this class with different parameters
	//  and all parameters.
	--Write the get method of each variable with return keyword. */
public class Browser {

	private String browserName;
	private String vendorName;
	private String currentVersion;
	private List<String> plugList;

	// Design the constructor of this class with different parameters 
	// and all parameters.
	public Browser(String browserName) {
		this.browserName = browserName;
	}

	public Browser(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public Browser(String browserName, String vendorName, String currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, String currentVersion, 
			List<String> plugList) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugList = plugList;

	}

	// Write the get method of each variable with return keyword
	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public List<String> getPlugList() {
		return plugList;
	}

	public static void main(String[] args) {

		List<String> plugLst = new ArrayList<String>();
		plugLst.add("Last Pass");
		plugLst.add("AdBlock plus");
		plugLst.add("HTTPS EveryWhere");
		plugLst.add("Zotero");

		Browser br = new Browser("Chrome");
		System.out.println(br.browserName);

		Browser br2 = new Browser("Chrome", "Google");
		System.out.println(br2.browserName + " : " + br2.vendorName);

		Browser br3 = new Browser("firefox", "Mozilla ", "87.0");
		System.out.println(br3.browserName + " : " + br3.vendorName + " : " + br3.currentVersion);

		Browser br4 = new Browser("Chrome", "Google ", "89.0.4389.114", plugLst);

		System.out.println(br4.browserName + " :" + br4.vendorName + " :" + br4.currentVersion 
				+ " : " + br4.plugList);
		
		br4.plugList.stream().forEach(e -> System.out.println(e));
		
		System.out.println("============ from get method ===========");
		System.out.println(br4.getBrowserName());
		System.out.println(br4.getVendorName());
		System.out.println(br4.getCurrentVersion());
		System.out.println(br4.getPlugList());
	}
}

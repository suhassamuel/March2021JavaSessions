package JavaSessions.Assignments;

import java.util.ArrayList;
import java.util.List;

public class BrowserAccess {

	public static void main(String[] args) {
		
		List<String> plugLst = new ArrayList<String>();
		
		plugLst.add("Adblock Plus");
		plugLst.add("Pocket");
		plugLst.add("HoverSee");
		plugLst.add("PiPer");
		
		Browser br = new Browser("Safari", "Apple", "14.0.3", plugLst);
		System.out.println(br.getBrowserName());
		System.out.println(br.getVendorName());
		System.out.println(br.getCurrentVersion());
		System.out.println(br.getPlugList());
	}

}

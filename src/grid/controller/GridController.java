package grid.controller;

import grid.model.RestarauntMenu;
import grid.view.GridView;

public class GridController
{
	private int[][] myFamilyAges;
	private String[][] friendNames;
	private GridView consoleView;
	private RestarauntMenu [][] myMenu;

	public GridController()
	{
		myFamilyAges = new int[3][3];
		friendNames = new String[4][4];
		myMenu = new RestarauntMenu[5][3];
		consoleView = new GridView();
	}

	public int[][] getMyFamilyAges()
	{
		return myFamilyAges;
	}

	public String[][] getFriendNames()
	{
		return friendNames;
	}

	public GridView getConsoleView()
	{
		return consoleView;
	}

	public void setMyFamilyAges(int[][] myFamilyAges)
	{
		this.myFamilyAges = myFamilyAges;
	}

	public void setFriendNames(String[][] friendNames)
	{
		this.friendNames = friendNames;
	}

	public void setConsoleView(GridView consoleView)
	{
		this.consoleView = consoleView;
	}

	private void fillMenu()
	{
		myMenu[0][0] = new RestarauntMenu();
		myMenu[0][1] = new RestarauntMenu();
		myMenu[0][2] = new RestarauntMenu();
		
		myMenu[1][0] = new RestarauntMenu();
		myMenu[1][1] = new RestarauntMenu();
		myMenu[1][2] = new RestarauntMenu();
		
		myMenu[2][0] = new RestarauntMenu();
		myMenu[2][1] = new RestarauntMenu();
		myMenu[2][2] = new RestarauntMenu();
		
		myMenu[3][0] = new RestarauntMenu();
		myMenu[3][1] = new RestarauntMenu();
		myMenu[3][2] = new RestarauntMenu();
	
		myMenu[4][0] = new RestarauntMenu();
		myMenu[4][1] = new RestarauntMenu();
		myMenu[4][2] = new RestarauntMenu();

	}
	
	private void fillAges()
	{
		myFamilyAges[0][0]= 17;
		myFamilyAges[0][1]= 20;
		myFamilyAges[0][2]= 23;
		
		myFamilyAges[1][0]= 49;
		myFamilyAges[1][1]= 45;
		myFamilyAges[1][2]= 00;
		
		myFamilyAges[2][0]= 00;
		myFamilyAges[2][1]= 00;
		myFamilyAges[2][2]= 00;
		
	}
	
	public void start()
	{
		fillMenu();
		fillAges();
		consoleView.printIntInformation(myFamilyAges);
		consoleView.printRestaurantMenuInformation(myMenu);
	}
}

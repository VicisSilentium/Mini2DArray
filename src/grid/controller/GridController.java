package grid.controller;

import grid.view.GridView;

public class GridController
{
	private int[][] myFamilyAges;
	private String[][] friendNames;
	private GridView consoleView;

	public GridController()
	{
		myFamilyAges = new int[3][3];
		friendNames = new String[4][4];
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
		fillAges();
		consoleView.printIntInformation(myFamilyAges);
	}
}

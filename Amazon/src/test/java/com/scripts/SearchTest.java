package com.scripts;

import org.testng.annotations.Test;

import com.common.AutomationConstants;
import com.generic.Excel;
import com.pages.SearchPage;

public class SearchTest extends AmazonLoginTest implements AutomationConstants
{
@Test
public void search() 
{
	String searchcontent=Excel.getCellValue(INPUT_PATH, "Sheet2", 1, 0);
	SearchPage search=new SearchPage(driver);
	search.searchItem(searchcontent);
	search.clickSearch();
	search.get128StorageMobile();
}
}

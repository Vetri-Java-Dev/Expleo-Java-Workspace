package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	By dashBoard=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	List<WebElement> widgets=driver.findElements(By.xpath("//div[contains(@class,'orangehrm-dashboard-widget-header')]"));
	
	public List<WebElement> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<WebElement> widgets) {
		this.widgets = widgets;
	}

	public By getDashBoard() {
		return dashBoard;
	}

	public void setDashBoard(By dashBoard) {
		this.dashBoard = dashBoard;
	}

}

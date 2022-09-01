package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import BasePackage.BaseClassForFacebookLogin;

public class UtilityClass extends  BaseClassForFacebookLogin
{
	
	public static void captureScreeshot(String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\Desktop\\AKSHARA\\AshviniG\\Screeshots\\"+name+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String data(int row,int cell) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\admin\\Desktop\\AKSHARA\\AshviniG\\excel1.xlsx";
		FileInputStream file=new FileInputStream(path);
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		String str = sh.getRow(row).getCell(cell).getStringCellValue();
		return str;
		
		
	}


}

package FetchDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\admin\\Desktop\\AKSHARA\\AshviniG\\Register and login.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			int cellcount=sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<=cellcount-1;j++)
			{
				CellType ct=sh.getRow(i).getCell(j).getCellType();
				
				if(ct.equals(CellType.STRING))
				{
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				}
				else if(ct.equals(CellType.BOOLEAN))
				{
					System.out.println(sh.getRow(i).getCell(j).getBooleanCellValue());
				}
				else if(ct.equals(CellType.NUMERIC))
				{
					System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
				}
			}
		}
	}

}

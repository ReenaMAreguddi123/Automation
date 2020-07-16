package Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getcellvalue(String path, String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		String cellvalue = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
	}


}

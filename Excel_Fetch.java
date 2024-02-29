package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Excel_Fetch 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("/Users/anandudapudi/eclipse-workspace/selinium/Excelsheet/richard(1).xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		org.apache.poi.ss.usermodel.Sheet s1=wb.getSheet("login");
		Row r1=s1.getRow(1);
		org.apache.poi.ss.usermodel.Cell c1=r1.getCell(1);
		String str=c1.getStringCellValue();
		System.out.println(str);
		
		
		

	}

}


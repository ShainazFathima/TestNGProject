package apr16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetCellData {

	public static void main(String[] args) throws Throwable {
		// Read the path of excel file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from workbook
		XSSFSheet ws =wb.getSheet("Emp");
		//get 6th row from emp sheet
		XSSFRow row = ws.getRow(6);
		//count no.of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("No.of rows in sheet are::"+rc);
		//get each cell data from 6th cell
		XSSFCell c1 =row.getCell(0); 
		XSSFCell c2 =row.getCell(1); 
		XSSFCell c3 =row.getCell(2); 
		XSSFCell c4 =row.getCell(3); 
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3.getStringCellValue();
		int eid = (int) c4.getNumericCellValue();
		System.out.println(fname+" "+mname+" "+lname+" "+eid);
		fi.close();
		wb.close();
	}

}

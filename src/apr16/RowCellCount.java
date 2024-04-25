package apr16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowCellCount {

	public static void main(String[] args) throws Throwable {
		// Read the path of excel file
FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
//get workbook from file
XSSFWorkbook wb = new XSSFWorkbook(fi);
//get sheet from workbook
XSSFSheet ws =wb.getSheet("Emp");
//get rows from sheet
XSSFRow row = ws.getRow(0);
//Count no.of rows
int rc =ws.getLastRowNum();
//count no.of cells in 1st row
int cc = row.getLastCellNum();
System.out.println("No.of rows are::"+rc+" "+"No.of cells are::"+cc);
fi.close();
wb.close();
	}

}

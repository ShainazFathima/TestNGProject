package apr16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlternateMethod {

	public static void main(String[] args) throws Throwable {
		// Read path of file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet ws = wb.getSheet("Emp");
        int rc = ws.getLastRowNum();
        System.out.println("No.of rows are::"+rc);
        //print specific row in each cell
        String fname = ws.getRow(2).getCell(0).getStringCellValue();
        String mname = ws.getRow(1).getCell(1).getStringCellValue();
        String lname = ws.getRow(5).getCell(2).getStringCellValue();
        int eid = (int) ws.getRow(6).getCell(3).getNumericCellValue();
        System.out.println(fname+" "+mname+" "+lname+" "+eid);
        fi.close();
        wb.close();
	}

}

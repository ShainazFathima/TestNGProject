package apr17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CovertIntToString {

	public static void main(String[] args) throws Throwable {
		// read the path of file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		//count no.of rows in a sheet
		int rc = ws.getLastRowNum();
		System.out.println("No.of rows in sheet are::"+rc);
		for(int i=1;i<=rc;i++)
		{
	     if(wb.getSheet("Emp").getRow(i).getCell(3).getCellType()==CellType.NUMERIC);
	     { 
	    	int celldata = (int) wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
	    	//convert integer type into string type
	    	String eid = String.valueOf(celldata);
	    	System.out.println(eid);
	    	ws.getRow(i).createCell(4).setCellValue("Fail");
	    	
	     }
	     
		}
		fi.close();
	     FileOutputStream fo = new FileOutputStream("D:/Resultss.xlsx");
	     wb.write(fo);
	     fo.close();
	     wb.close();
	}

}

package apr17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable {
		// Read the path of the file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
         XSSFWorkbook wb = new XSSFWorkbook(fi);
         XSSFSheet ws = wb.getSheet("Emp");
         //count no.of rows in a sheet
         int rc = ws.getLastRowNum();
         System.out.println("No.of rowsin sheet are::"+rc);
         for(int i=1;i<=rc;i++)
         {
        	//read all rows 1st cell data
        	 String fname = ws.getRow(i).getCell(0).getStringCellValue();
        	 String mname = ws.getRow(i).getCell(1).getStringCellValue();
        	 String lname = ws.getRow(i).getCell(2).getStringCellValue();
        	 int eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
        	 System.out.println(fname+" "+mname+" "+lname+" "+eid);
        	 //create a cell and write text
        	 ws.getRow(i).createCell(4).setCellValue("Pass");
        	 }
         fi.close();
         FileOutputStream fo = new FileOutputStream("D:/Result.xlsx");
         wb.write(fo);
         fo.close();
         wb.close();
	}

}

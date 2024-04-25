package apr17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.examples.xssf.usermodel.CreateCell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatCells {

	public static void main(String[] args) throws Throwable {
		// read the path of the file
		FileInputStream  fi = new FileInputStream("D:/Book1.xlsx");
         XSSFWorkbook wb = new XSSFWorkbook(fi);
         XSSFSheet ws = wb.getSheet("Emp");
        //count no.of rows in a sheet
         int rc = ws.getLastRowNum();
         for(int i=1;i<=rc;i++)
         {
        	 //create a cell
        	// ws.getRow(i).createCell(4).setCellValue("Pass");
        	// ws.getRow(i).createCell(4).setCellValue("Fail");
        	 ws.getRow(i).createCell(4).setCellValue("Blocked");
        	 XSSFCellStyle style = wb.createCellStyle();
        	 XSSFFont font = wb.createFont();
        	// font.setColor(IndexedColors.GREEN.getIndex());
        	// font.setColor(IndexedColors.RED.getIndex());
        	 font.setColor(IndexedColors.LIGHT_BLUE.getIndex());
        	 font.setBold(true);
        	 style.setFont(font);
        	 ws.getRow(i).getCell(4).setCellStyle(style);
         }
         fi.close();
         FileOutputStream fo = new FileOutputStream("D:/Resultsss.xlsx");
         wb.write(fo);
         fo.close();
         wb.close();
	}

	
}

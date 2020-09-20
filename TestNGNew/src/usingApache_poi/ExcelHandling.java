
package usingApache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @author abc
 * Testing  Shastra 41 no video
 *Handling of xls file
 */
public class ExcelHandling {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:\\Assignments\\Demoxls.xls");
		Workbook book=new HSSFWorkbook(file);
		HSSFSheet sheet=(HSSFSheet) book.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for (int i = 0; i <= rows; i++) {
			
			Row row=sheet.getRow(i);
			int cells=row.getLastCellNum();
			for (int j = 0; j < cells; j++) {
				Cell  cell=row.getCell(j);
				
			
		switch (cell.getCellType()) {
		case STRING:
			System.out.print(cell.getStringCellValue()+"\t");
			break;
			
		case NUMERIC:
			System.out.print(cell.getNumericCellValue()+"\t");
			break;

		default:
			break;
		}
				
			}
			
			System.out.println();
		}
		
	}

}

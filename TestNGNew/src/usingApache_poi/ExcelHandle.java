package usingApache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author abc
 * Testing Shastra 41
 * Handling xlxs
 *
 */
public class ExcelHandle {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Assignments\\Demoxlsx.xlsx");
		Workbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=(XSSFSheet) book.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		for (int i = 0; i <=rows; i++) {
			Row row=sheet.getRow(i);
			int cells=row.getLastCellNum();
			for (int j = 0; j < cells; j++) {
				Cell cell=row.getCell(j);
				
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
		
	
	}}

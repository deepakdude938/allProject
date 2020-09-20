package TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataFeeder1 {
@DataProvider(name="CredentialsData")
	public static Object [][] credentialsProvider() throws IOException {
		FileInputStream file=new FileInputStream("D:\\Assignments\\POIDemo.xlsx");
        XSSFWorkbook book=new XSSFWorkbook(file);
        XSSFSheet sheet=book.getSheet("Credentials");
        int lastRow=sheet.getLastRowNum();
        int lastcoloumn=sheet.getRow(0).getLastCellNum();
        System.out.println("Row No-"+lastRow+" Coloumn No-"+lastcoloumn);
        
        Object [][]obj=new Object[lastRow][lastcoloumn-1];
        for(int i=1;i<=lastRow;i++) {
        	Row row=sheet.getRow(i)	;
        	for (int j = 1; j < lastcoloumn; j++) {
        		
        	
        		Cell cell=row.getCell(j);
        		
        		switch(cell.getCellType()) {
        		
        		case STRING :
        			obj[i-1][j-1]=cell.getStringCellValue();
        			
        			break;
        		
        		case NUMERIC :
        			obj[i-1][j-1]=cell.getNumericCellValue();
        			break;	
        			
        		case BLANK :
        			obj[i-1][j-1]="";
        			break;
        		case FORMULA :
        			obj[i-1][j-1]=cell.getCellFormula();
        			break;
        			
        		case BOOLEAN :
        			obj[i-1][j-1]=cell.getBooleanCellValue();
        			break;
        			
        			default:
        				break;
        			
        		}
        		
				
			}
        	
        }
		
		
		return obj;
	

	}

}

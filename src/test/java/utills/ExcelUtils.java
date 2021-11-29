/**
 * 
 */
package utills;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author pratikpadwekar
 *
 */
public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ; 
	
	
	public ExcelUtils(String excelPath , String SheetName) { 
		
		try {
		
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(SheetName);
		
	}
		catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}

	
	 public static void getCellData(int rowNum , int ColNum) {
		
			
				DataFormatter formatter = new  DataFormatter();
				Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(ColNum));	
				System.out.println(value);
				
					
				} 
				 
	
	public static void getRowCount() {

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows :" + rowCount);			
			
		}
}

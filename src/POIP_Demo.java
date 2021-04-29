import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POIP_Demo {

	public static void main(String[] args) throws IOException {
		
		File xfile = new File("src//ExcelXLS.xls");
		
		FileInputStream fis = new FileInputStream(xfile);
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		HSSFRow row = sheet.getRow(2);
		
		HSSFCell cell = row.getCell(1);
		
		String cv = cell.getStringCellValue();
		
		System.out.println(cv);
		

	}

}

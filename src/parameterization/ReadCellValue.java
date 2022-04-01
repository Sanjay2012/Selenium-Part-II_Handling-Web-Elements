package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\MindMAPS\\Automation\\data.xlsx");
		
		Workbook method = WorkbookFactory.create(file);
		Sheet openSpecificSheet = method.getSheet("Sheet1");
		
		Row rowNo = openSpecificSheet.getRow(1);
		Cell colNo = rowNo.getCell(0);
		String value =colNo.getStringCellValue();
		
		// alternate way
		
		//String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

}

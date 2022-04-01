package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream file=new FileInputStream("D:\\MindMAPS\\Automation\\data.xlsx");
		
		Workbook method = WorkbookFactory.create(file);
		Sheet openSpecificSheet = method.getSheet("Sheet1");
		
		int lastRowNo = openSpecificSheet.getLastRowNum();
		
		System.out.println(lastRowNo);

	}

}

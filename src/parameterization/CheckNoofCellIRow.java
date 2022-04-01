package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CheckNoofCellIRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream file=new FileInputStream("D:\\MindMAPS\\Automation\\data.xlsx");
		
	 short lastCellNo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	 System.out.println(lastCellNo);
		

	}

}

package HandlingExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteTheDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		// write the data in the excel file
		FileInputStream fis= new FileInputStream("./data/TestData1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("City");
		 Row row= sh.getRow(0);
		Cell cell = row.createCell(1);
		 cell.setCellValue("xyz");
		 
		FileOutputStream fos= new FileOutputStream("./data/TestData1.xlsx");
		wb.write(fos);
		wb.close();

		 
		 
		 
	}

}

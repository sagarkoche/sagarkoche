package HandlingExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataInTheExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("./data/TestData1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("City");
		 Row row= sh.getRow(3);
			Cell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			System.out.println(value);


	}

}

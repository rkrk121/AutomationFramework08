package login;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;

import genericutility.ExcelUtility;

public class Demo {
	
	
	public void test() throws EncryptedDocumentException, IOException {
		
		
		ExcelUtility elib=new ExcelUtility();
		LocalDateTime date=elib.getDateFromExcel("Register", 2, 0);
		System.out.println(date);
	}
}

package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
/*
 * this class contains reusable methods to perform operation on the excel file
 * 
 */
public class ExcelFileUtility {
	
	private Workbook  workbook;
	/**
	 * this method used to initialize the excel file
	 * 
	 * @param excelpath
	 */
	
	public void excelInitialization( String excelpath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
         }
		
		try {
			workbook =WorkbookFactory.create(fis);
		}
		catch(EncryptedDocumentException | IOException e){
			 e.printStackTrace();
			}
	}
	/*
	 * 
	 * this method is used to fectch single data from excel file
	 */
	public String fectchDataFromExcel(  String sheetName,int rowNum, int cellNum)
	{
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/*
	 * this method used to fcecth multiple data from excel
	 * 
	 */
	public List<String>  fetchDataFromExcel(String sheetName) {
		List<String> list = new ArrayList<>();
		Sheet sheet = workbook.getSheet(sheetName);
		for(int i=0; i<4; i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			list.add(data);
		}
		return list;
	}

	/*
	 * this is used to close the workbook
	 * 
	 */
	public void closeWorkbook()
	{
		try {
			workbook.close();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	
}
}

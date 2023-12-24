package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		// find excel work book-->sheet-->row-->col-->data

		// createLeaddata-->sheet1-->row(2)-->col(1)->cname

		// Step:1 -->set the file path -->./folderName/filename.xlsx
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLeadData.xlsx");

		// step:2 Identify the sheet- book.getSheet("Sheet1"); using sheet name
		XSSFSheet sheetAt = book.getSheetAt(0);// using index

		// step:3 get into the row

		XSSFRow row = sheetAt.getRow(1);

		// Step:4 Using row 1 (excelrow 2) get into the col/cell
		XSSFCell cell = row.getCell(0);

		// step:5 Using cell (1,0)(Excel-2A) -->get the value
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

		// Get the row count
		int rowCount = sheetAt.getLastRowNum();// treats the first row of excel sheet as header

		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		// get the col count -->using row
		int colCount = row.getLastCellNum(); // returns short

		System.out.println(rowCount + "--> " + colCount);

		for (int i = 1; i <= rowCount; i++) {// iterate into all rows
			for (int j = 0; j < colCount; j++) {// iterate into allcolumns
				String allData = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(allData);

			}

		}

		// mandatory
		book.close();

	}

}

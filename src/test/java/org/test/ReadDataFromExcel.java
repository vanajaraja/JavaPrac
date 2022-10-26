package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadDataFromExcel {

	
	public static String stringCellValue;
	public static String readExcelFile(String sheetName, String columnName) throws IOException {
		File file = new File("C:\\Users\\vanaj\\Desktop\\Vanaja\\Testing Tools\\DataSheet.xlsx");
		FileInputStream ft = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(ft);

		Sheet sheet = wb.getSheet(sheetName);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		// for (int i = 1; i < physicalNumberOfRows; i++) {
		Row columnNames = sheet.getRow(0);
		Row row = sheet.getRow(1);

		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < physicalNumberOfCells; j++) {
			if (columnNames.getCell(j).getStringCellValue().equals(columnName)) {

				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();

				if (cellType == 1) {
					 stringCellValue = cell.getStringCellValue();

				}

				else if (cellType == 0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
						stringCellValue = sd.format(dateCellValue);
					}

					else {
						double numericCellValue = cell.getNumericCellValue();

						long value = (long) numericCellValue;
						stringCellValue = String.valueOf(value);

					}
				}
			}

		}
		return stringCellValue;

		// }

	}

	public static void main(String[] args) throws IOException {
		String readExcelFile = readExcelFile("LoginPage", "Email");
		System.out.println(readExcelFile);
	}


}

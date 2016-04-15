package com.BaseLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.BaseLib.BaseTestPage;


public class Genric {
	public ArrayList<String> ReadingData (String TestcaseName ) 
	{
		try
		{
		ArrayList<String> Data= new ArrayList<String>();;
		String path=BaseTestPage.Directorypath+"\\Excel\\DataSheet.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook Excel=WorkbookFactory.create(file);
		Sheet sheet = Excel.getSheet("Testdata");
		int Lastrow=sheet.getLastRowNum();
	
		for(int i=0;i<=Lastrow;i++)
		{
			
			if (sheet.getRow(i).getCell(0).toString().equals(TestcaseName))
			{
				int Lastcellnum=sheet.getRow(i).getLastCellNum();
				
				for(int j=1;j<Lastcellnum;j++)
				{
					String cellvaluew= sheet.getRow(i).getCell(j).toString();
					Data.add(cellvaluew);
				}
				break;
			}
			else
			{
				continue;
			}
		}
		return Data;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	public void WriteData(String Data,String testcase,String exception) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String path=BaseTestPage.Directorypath+"\\Excel\\DataSheet.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook Excel=WorkbookFactory.create(file);
		Sheet sheet = Excel.getSheet("Testdata");
		int lastrow=sheet.getLastRowNum();
		for(int i=0;i<=lastrow;i++)
		{
			if (sheet.getRow(i).getCell(0).toString().equals(testcase))
			{
				Row row=sheet.getRow(i);
				Cell celldata=row.createCell(4);
				celldata.setCellType(celldata.CELL_TYPE_STRING);
				celldata.setCellValue(Data);
				Cell cellExpt=row.createCell(5);
				cellExpt.setCellType(celldata.CELL_TYPE_STRING);
				cellExpt.setCellValue(exception);
				FileOutputStream out=new FileOutputStream(path);
				Excel.write(out);
				out.close();
				System.out.println("HI         hi");
			}
		}
	
	}

}


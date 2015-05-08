package XML_task;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class EXCEL {

    public static void main(String[] args) throws IOException {
        System.out.println(parse("excel.xls"));
    }

    public static String parse(String name) {

        String result = "";
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new HSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result += cell.getStringCellValue() + " ";
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        result += " " + cell.getNumericCellValue() + " ";
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        result += " " + cell.getNumericCellValue() + " ";
                        break;
                    default:
                        result += " ";
                        break;
                }
            }
            result += "\n";
        }
        return result;
    }
}


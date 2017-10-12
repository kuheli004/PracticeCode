import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile {

  public static void main(String[] args) {
    int rownum=0;
    HSSFWorkbook workbook = new HSSFWorkbook();
      HSSFSheet sheet=workbook.createSheet("employee");
    Map<String,Object[]> data=new TreeMap<String,Object[]>();
    data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
    data.put("2", new Object[] {1, "Amit", "Shukla"});
    data.put("3", new Object[] {2, "Lokesh", "Gupta"});
    data.put("4", new Object[] {3, "John", "Adwards"});
    data.put("5", new Object[] {4, "Brian", "Schultz"});
    
  Set<String> key =data.keySet();
  for(String k:key){

    Row row=sheet.createRow(rownum++);
    Object objArr[]=data.get(k);
    int cellNum=0;
    for(Object obj:objArr){
      Cell cell=row.createCell(cellNum++);
      if(obj instanceof String)
        cell.setCellValue((String)obj);
      else if(obj instanceof Integer)
        cell.setCellValue((Integer)obj);
    }
    try{
      FileOutputStream out=new FileOutputStream(new File("EmployeeData.xls"));
      workbook.write(out);
      out.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    
    
  }
    
    
    
  }

}

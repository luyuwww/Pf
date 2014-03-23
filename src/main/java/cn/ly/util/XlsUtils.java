package cn.ly.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import cn.ly.pojo.ViewGrade;

public class XlsUtils {
	
	//使用POI创建excel工作簿 
    public void createWorkBook(List<ViewGrade> vgList) throws IOException { 
        //创建excel工作簿 
    	HSSFWorkbook wb = new HSSFWorkbook(); 
        //创建第一个sheet（页）
        Sheet sheet = wb.createSheet("所有员工成绩"); 
        
        int rowNum = 0;
        int cellNum = 0;
        
        Row row = sheet.createRow(rowNum++); 
        row.createCell(cellNum++).setCellValue("部门");
        row.createCell(cellNum++).setCellValue("姓名");
        row.createCell(cellNum++).setCellValue("正职人数");
        row.createCell(cellNum++).setCellValue("正职平均分");
        row.createCell(cellNum++).setCellValue("正职总分");
        row.createCell(cellNum++).setCellValue("副职人数");
        row.createCell(cellNum++).setCellValue("副职平均分");
        row.createCell(cellNum++).setCellValue("副职总分");
        row.createCell(cellNum++).setCellValue("内设部门管理人员人数");
        row.createCell(cellNum++).setCellValue("内设部门管理人员平均分");
        row.createCell(cellNum++).setCellValue("内设部门管理人员总分");
        row.createCell(cellNum++).setCellValue("普通人员人数");
        row.createCell(cellNum++).setCellValue("普通人员平均分");
        row.createCell(cellNum++).setCellValue("普通人员总分");
        row.createCell(cellNum++).setCellValue("所有人人数");
        row.createCell(cellNum++).setCellValue("所有人平均分");
        row.createCell(cellNum++).setCellValue("所有人总分");        
        for (ViewGrade vg : vgList) {
        	cellNum = 0;
        	row = sheet.createRow(rowNum++); 
			row.createCell(cellNum++).setCellValue(vg.getBeOperUserDepName());
			row.createCell(cellNum++).setCellValue(vg.getBoperusername());
			row.createCell(cellNum++).setCellValue(vg.getZzPersons());
			row.createCell(cellNum++).setCellValue(vg.getZzAverage());
			row.createCell(cellNum++).setCellValue(vg.getZzCount());
			   
			row.createCell(cellNum++).setCellValue(vg.getFzPersons());
			row.createCell(cellNum++).setCellValue(vg.getFzAverage());
			row.createCell(cellNum++).setCellValue(vg.getFzCount());
			
			row.createCell(cellNum++).setCellValue(vg.getZsbmMgrPersons());
			row.createCell(cellNum++).setCellValue(vg.getZsbmMgrAverage());
			row.createCell(cellNum++).setCellValue(vg.getZsbmMgrCount());
			   
			row.createCell(cellNum++).setCellValue(vg.getPtryPersons());
			row.createCell(cellNum++).setCellValue(vg.getPtryAverage());
			row.createCell(cellNum++).setCellValue(vg.getPtryCount());
			   
			row.createCell(cellNum++).setCellValue(vg.getTotalPersons());
			row.createCell(cellNum++).setCellValue(vg.getTotalAverage());
			row.createCell(cellNum++).setCellValue(vg.getTotalCount());       
		}
        //创建一个文件 命名为workbook.xls 
        FileOutputStream fileOut = new FileOutputStream("c://workbook.xls"); 
        // 把上面创建的工作簿输出到文件中 
        wb.write(fileOut); 
        //关闭输出流 
        fileOut.close(); 
    } 
    private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}

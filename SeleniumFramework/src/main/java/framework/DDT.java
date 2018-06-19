package framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
    @Test(dataProvider="testdata")
    public void testcct(String a,String b) {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    //使用@DataProvider注解定义当前方法中的返回对象作为测试脚本的测试数据集
    @DataProvider(name="testdata")
    public Object[][] TestDataFeed() throws Exception{

        File src = new File(".\\TestData\\data.xlsx");
        FileInputStream fis = new FileInputStream(src);
        System.out.println(fis);

        @SuppressWarnings("resource")
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh1= wb.getSheetAt(0);
        int numberrow = sh1.getPhysicalNumberOfRows();
        System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
        Object [][] tdata=new Object[numberrow][2];

        for(int i=0;i<numberrow;i++){
            tdata[i][0] = sh1.getRow(i).getCell(0).getStringCellValue();
            tdata[i][1] = sh1.getRow(i).getCell(1).getStringCellValue();
        }
        return tdata;

    }
}

package com.print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import com.pojo.Ribaodata;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Print {
	public static void Print(List<Ribaodata> ribaodata){
	WritableWorkbook wwb = null;
    try {    
        //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象    
    	File fileWrite = new File("d:/gongzuo.xls");
    	OutputStream os = new FileOutputStream(fileWrite);
        wwb = Workbook.createWorkbook(os);
    } catch (IOException e) {    
        e.printStackTrace();    
    }    
    if(wwb!=null){    
        //创建一个可写入的工作表    
        //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置    
        WritableSheet ws = wwb.createSheet("sheet1", 0);    

        //下面开始添加单元格    
        for(int i=0;i<ribaodata.size();i++){    
                //这里需要注意的是，在Excel中，第一个参数表示列，第二个表示行    
        		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");   
        		String time=sdf.format(ribaodata.get(i).getUptime());  
        		Label labelC0 = new Label(0, i, time);   
                Label labelC1 = new Label(1, i, ribaodata.get(i).getContext());    
                try {    
                    //将生成的单元格添加到工作表中    
                    ws.addCell(labelC0);    
                    ws.addCell(labelC1);  
                } catch (RowsExceededException e) {    
                    e.printStackTrace();    
                } catch (WriteException e) {    
                    e.printStackTrace();    
                }    
            }    
        }    
        try {    
            //从内存中写入文件中    
            wwb.write();    
            //关闭资源，释放内存    
            wwb.close();    
        } catch (IOException e) {    
            e.printStackTrace();    
        } catch (WriteException e) {    
            e.printStackTrace();    
        }    
    }    
	
}

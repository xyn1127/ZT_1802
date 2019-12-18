package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接对象
		lianjie = DriverManager.getConnection("jdbc:mysql://127.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		File file=new File("E:/大二/java/tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2: wenjian_jihe) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				//调用dwj方法,将数据录入到数据库
				dwj_xlsx(file2);
			}else if(file2.getName().endsWith("xls")){
				//调用dwj方法,将数据录入到数据库
				dwj_xls(file2);
			}
		
		}
	}
	public static void dwj_xlsx(File shili) throws Exception{
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		for (int i =1; i < rows; i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到第4个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格
			String xuehao=cell.getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			//System.out.println(xuehao);
			XSSFCell cell16=row.getCell(19);
			//读取这个单元格的值
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			//找到第16个单元格
			XSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you_shili=cell17.getStringCellValue();
			//System.out.println(you_shili);
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获得连接
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//定义更新sql语句
			if(zuo_shili != null && you_shili != null) {
				//创建PreparedStatement语句
				PreparedStatement ydy_yuju=lianjie.prepareStatement("UPDATE sheet1 SET `左眼裸眼视力` =?,`右眼裸眼视力`=? WHERE `学号`= ?");
				//绑定预定义语句的问号的值
				ydy_yuju.setString(1,zuo_shili);
				ydy_yuju.setString(2,you_shili);
				ydy_yuju.setString(3,xuehao);
				//通过语句对象执行sql  
				ydy_yuju.executeUpdate();
			}
		}	
			
	} 
		public static void dwj_xls(File shili) throws Exception{
			FileInputStream fin=new FileInputStream("shili.xlsx");
			HSSFWorkbook workbook=new HSSFWorkbook(fin);
			HSSFSheet sheet=workbook.getSheet("sheet1");
			int rows=sheet.getLastRowNum();
			for (int i =1; i < rows; i++) {
				//读取每一行
				HSSFRow row=sheet.getRow(i);
				//找到第4个单元格
				HSSFCell cell=row.getCell(3);
				//读取这个单元格
				String xuehao=cell.getStringCellValue();
				if(xuehao.equals("学号")) {
					continue;
				}
				//System.out.println(xuehao);
				HSSFCell cell16=row.getCell(19);
				
				//读取这个单元格的值
				String zuo_shili=cell16.getStringCellValue();
				System.out.println(zuo_shili);
				//找到第16个单元格
				HSSFCell cell17=row.getCell(16);
				//读取这个单元格的值
				String you_shili=cell17.getStringCellValue();
				//System.out.println(you_shili);
				//注册驱动
				Class.forName("com.mysql.jdbc.Driver");
				//获得连接
				Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
				//通过连接对象获得语句对象
				//Statement yuju=lianjie.createStatement();
				//定义更新sql语句
				if(zuo_shili != null && you_shili != null) {
					//创建PreparedStatement语句
					PreparedStatement ydy_yuju=lianjie.prepareStatement("UPDATE sheet1 SET `左眼裸眼视力` =?,`右眼裸眼视力`=? WHERE `学号`= ?");
					//绑定预定义语句的问号的值
					ydy_yuju.setString(1,zuo_shili);
					ydy_yuju.setString(2,you_shili);
					ydy_yuju.setString(3,xuehao);
					//通过语句对象执行sql  
					ydy_yuju.executeUpdate();
				}
				
				
		} 
	}
}


package Stu;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {
	public String AdminLogin(String Login1,String Password1) throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String result=null;
		String Login=Login1.trim();
		String Password=Password1.trim();
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String strSQL ="SELECT * FROM Admin_Info WHERE AdminId='" + Login +"'";
			rs =stmt.executeQuery(strSQL);
			if(!rs.next()) result ="无此账号";
			else if(!rs.getString("PWD").equals(Password)) result="密码错误";
			else result ="成功登入";
		}catch(Exception ex){throw ex;
		}finally{
			rs.close();
			stmt.close();
			con.close();
		}
		return result;
	}
	public String PtLogin(String Login1,String Password1) throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String result=null;
		String Login=Login1.trim();
		String Password=Password1.trim();
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String strSQL ="SELECT * FROM Stu_info WHERE StuId='" + Login +"'";
			rs =stmt.executeQuery(strSQL);
			if(!rs.next()) result ="无此账号";
			else if(!rs.getString("PWD").equals(Password)) result="密码错误";
			else result ="成功登入";
		}catch(Exception ex){throw ex;
		}finally{
			rs.close();
			stmt.close();
			con.close();
		}
		return result;
	}
	
	public ResultSet query(String number){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			String condition ="SELECT Stu_Info.StuId,Stu_Info.S_Name,Stu_Info.S_Class,Score_Info.math,Score_Info.SQLserver,Score_Info.english,Score_Info.java,Score_Info.SoftTest,Score_Info.term FROM Score_Info,Stu_Info where Score_Info.Sid=Stu_Info.StuId and Stu_Info.StuId like" +"'"+number+"'"+"";
			System.out.println(condition);
			rs =sql.executeQuery(condition);
			return rs;
		}catch(Exception e){return rs;}
	}
	public ResultSet classes(String classes){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			String condition ="SELECT Stu_Info.StuId,Stu_Info.S_Name,Stu_Info.S_Class,Score_Info.math,Score_Info.SQLserver,Score_Info.english,Score_Info.java,Score_Info.SoftTest,Score_Info.term FROM Score_Info,Stu_Info where Score_Info.Sid=Stu_Info.StuId and Stu_Info.S_Class like" +"'"+classes+"'"+"";
			System.out.println(condition);
			rs =sql.executeQuery(condition);
			return rs;
		}catch(Exception e){return rs;}
	}
	public ResultSet StuAll(){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			String condition ="SELECT Stu_Info.StuId,Stu_Info.S_Name,Stu_Info.S_Class,Score_Info.math,Score_Info.SQLserver,Score_Info.english,Score_Info.java,Score_Info.SoftTest,Score_Info.term FROM Score_Info,Stu_Info where Score_Info.Sid=Stu_Info.StuId ";
			System.out.println(condition);
			rs =sql.executeQuery(condition);
			return rs;
		}catch(Exception e){return rs;}
	}
	public boolean insert(String number,String math,String sqlserver,String english,String java,String SoftTest,String term){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		int num=0;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			String condition ="insert into Score_Info values("+"'"+number+"','"+math+"','"+sqlserver+"','"+english+"','"+java+"','"+SoftTest+"','"+term+"')";
			System.out.println(condition);
			num =sql.executeUpdate(condition);
			con.close();
		}catch(Exception e){}
		if(num>0) return true;
		else return false;
	}

	public boolean query1(String number){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		int num=0;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			String condition ="select * from Score_Info where Sid ="+"'"+number+"'";
			rs=sql.executeQuery(condition);
			while(rs.next()) num++;
			con.close();
			if(num>0) return true;
			else return false;
		}catch(Exception e){return false;}
		
	
		
	}
	public String update(String number,float newMath,float newSQL,float newEnglish,float newJava,float newSoft,String newTest) throws Exception{
		if(query1(number)){
			Connection con=null;
			Statement  sql=null;
			ResultSet  rs=null;
			try{
				String dbpath="E:/BYSJ/Student/db.mdb";
				String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con =DriverManager.getConnection(url);
				sql=con.createStatement();
				String condition1 ="update Score_Info set math="+newMath+" where Sid="+"'"+number+"'";
				String condition2 ="update Score_Info set SQLserver="+newSQL+" where Sid="+"'"+number+"'";
				String condition3 ="update Score_Info set english="+newEnglish+" where Sid="+"'"+number+"'";
				String condition4 ="update Score_Info set java="+newJava+" where Sid="+"'"+number+"'";
				String condition5 ="update Score_Info set SoftTest="+newSoft+" where Sid="+"'"+number+"'";
				String condition6 ="update Score_Info set term="+newTest+" where Sid="+"'"+number+"'";
				sql.execute(condition1);
				sql.execute(condition2);
				sql.execute(condition3);
				sql.execute(condition4);
				sql.execute(condition5);
				sql.execute(condition6);
				System.out.println(condition1);
				System.out.println(condition2);
				System.out.println(condition3);
				System.out.println(condition4);
				System.out.println(condition5);
				System.out.println(condition6);
				con.close();
				return "修改成功";
			}catch(Exception e){return "修改成功";}
		}
		else{return "没有这个学号";}
	}
	public String del(String number) {
		if(query1(number)){
			Connection con=null;
			Statement  sql=null;
			ResultSet  rs=null;
			try{
				String dbpath="E:/BYSJ/Student/db.mdb";
				String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con =DriverManager.getConnection(url);
				sql=con.createStatement();
				String condition ="delete from Score_Info where Sid="+"'"+number+"'";
				sql.executeUpdate(condition);
				System.out.println(condition);
				con.close();
				return "删除成功";
			}catch(Exception event){return "删除失败";}
		}
		else{return "没有这个学号";}
	}
	public boolean insert2(String id,String pwd){
		Connection con=null;
		Statement sql=null;
		ResultSet rs=null;
		Statement stmt=null;
		int rowCount=0;
		try{
			String dbpath="E:/BYSJ/Student/db.mdb";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con =DriverManager.getConnection(url);
			sql=con.createStatement();
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("select * from Stu_Info where StuId ="+"'"+id+"' and PWD='"+pwd+"'"); 
			rs.last(); 
			rowCount = rs.getRow();
			con.close();
		}catch(Exception e){}
		
		if(rowCount>0) return true;
		else return false;
	}
	public String StuUpdate(String id,String pwd,String name,String age,String classes) throws Exception{
		if(insert2(id,pwd))
		{	
		Connection con=null;
			Statement  sql=null;
			ResultSet  rs=null;
			try{
				String dbpath="E:/BYSJ/Student/db.mdb";
				String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+dbpath;
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con =DriverManager.getConnection(url);
				sql=con.createStatement();
				String condition1 ="update Stu_Info set S_Name="+name+" where StuId="+"'"+id+"'and PWD='"+pwd+"'";
				String condition2 ="update Stu_Info set Age="+age+" where StuId="+"'"+id+"'and PWD='"+pwd+"'";
				String condition3 ="update Stu_Info set S_Class="+classes+" where StuId="+"'"+id+"'and PWD='"+pwd+"'";
				sql.execute(condition1);
				sql.execute(condition2);
				sql.execute(condition3);
				System.out.println(condition1);
				System.out.println(condition2);
				System.out.println(condition3);
				con.close();
				return "修改成功";
			}catch(Exception e){return "修改失败";}
		}
		else {return "请确认学号和密码";}
	}
	
	public Test() throws Exception{
		System.out.println(AdminLogin("admin", "123"));
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		new Test();
		// TODO Auto-generated method stub

	}

}

import java.sql.*;
import java.util.*;
public class DBinsert {

	public static void main(String[] args) throws SQLException{
		Connection con=null;
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/athul","root","Pass@123");
//			Statement stmt =con.createStatement();
//			stmt.execute("insert into emp values(12,'darshan',30000,25,'dev','sfafk61')");
//			PreparedStatement ps =con.prepareStatement("update emp set name=? where id=?");
			
			PreparedStatement pse= con.prepareStatement("select * from emp where desig= ?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Designation: ");
			String desig=sc.next();
			pse.setString(1, desig);
			ResultSet re = pse.executeQuery();
			
			
			while(re.next()) {
				System.out.println(re.getInt(1)+":"+re.getString(2));
			}
			
//			System.out.println("Enter ID: ");
//			int id=sc.nextInt();
//			
//			System.out.println("Enter Name: ");
//			String name=sc.next();
//			
//			System.out.println("Enter Salary: ");
//			int salary=sc.nextInt();
//			
//			System.out.println("Enter Age: ");
//			int age=sc.nextInt();
//			
//			System.out.println("Enter Designation: ");
//			String desig=sc.next();
//			
//			System.out.println("Enter Pan: ");
//			String pan=sc.next();
			
			
//			ps.setString(1, name);
//			ps.setInt(2, id);
////			ps.setInt(3, salary);
////			ps.setInt(4, age);
////			ps.setString(5, desig);
////			ps.setString(6, pan);
			
			
		
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
				}

	}

}
//Class.forname("driver");
//Connection con =DriverManager.getConnection("location","username","password");
//Statement st=con.createStatement();
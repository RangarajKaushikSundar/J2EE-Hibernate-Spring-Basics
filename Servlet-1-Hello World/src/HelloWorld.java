
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd=null;
		ServletConfig config= getServletConfig();
		response.setContentType("text/html");
		List<String> usernames=new ArrayList<String>();
		List<String> passwords=new ArrayList<String>();
		int checkpass=0;
		int checkname=0;
		int i=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KAUSHIK","PASS1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from login_credentials");
			while(rs.next()){
				usernames.add(rs.getString("username"));
				passwords.add(rs.getString("password"));
			}
			rs.close();
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<title>HelloWorld</title>");
		out.print("<body>");
		
		for(String verify:passwords){
			if(verify.equalsIgnoreCase(password))
				break;
			checkpass++;
		}		
		for(String uname:usernames){	
			if(uname.equalsIgnoreCase(username))
				break;
			checkname++;
		}
				
		while(i<passwords.size()){		
			if(checkname==checkpass){
				rd=request.getRequestDispatcher("/welcomeservlet");
				request.setAttribute("username", username);
				rd.forward(request, response);
				break;
			}
			i++;
		}
		
		rd=request.getRequestDispatcher("/index.html");
		rd.include(request, response);
		out.print("<font color=\"red\"><b><p>Login Failed</p></b></font>");
		out.print("</body></html>");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}

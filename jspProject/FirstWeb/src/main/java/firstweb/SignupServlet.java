package firstweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form/signup")
public class SignupServlet extends HttpServlet {
    

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		
	}

	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String password = request.getParameter("password");
		System.out.println("사용자 입력 PW : " + password);

		String name = request.getParameter("name");
		System.out.println("사용자 입력 PW : " + name);


		
		
	}
	
	

}

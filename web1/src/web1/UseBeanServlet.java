package web1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//インスタンス化
		EmpBean bean = new EmpBean();
		//EmpBeanクラスのsetNameメッソドに値をセットしている
		bean.setName("KnowledgeTaro");
		//EmpBeanクラスのsetAgeメッソドに値をセットしている
		bean.setAge(20);
		//リクエストオブジェクトにぶち込んでいる(keyがempでvalueがbeanの中身 )
		req.setAttribute("emp", bean);
		//RequestDispatherを用いて,転移先を指定している
		RequestDispatcher rd = req.getRequestDispatcher ("/page/useBean.jsp");
		//RequestDispatcher を用いてぶっ飛ばしている
		rd.forward(req, resp);


	}

}

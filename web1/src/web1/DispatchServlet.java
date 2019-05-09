package web1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//セッションを開始する
		HttpSession session = req.getSession(true);
		//格納できるデータはクラス型のインスタンスのみ
		//基本データ型は直接格納できない
		session.setAttribute("name","多佳男");

		req.setAttribute("age",78);
		// requestとresponseをsessionに渡している
		RequestDispatcher rd = req.getRequestDispatcher("/page/test.jsp");
		rd.forward(req, resp);
	}

}

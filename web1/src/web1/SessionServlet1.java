package web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {



	@Override //doGetメッソドをオーバーライドし処理を記述
	//セッションオブジェクトを取得するためのメッソド
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//セッションを開始する場合は引数をtrueにする
		HttpSession session = req.getSession(true);
		//格納できるデータはクラス型のインスタンスのみ
		//基本データ型は直接格納できない
		session.setAttribute ("loginUser","knowledgeTaro");
		resp.setContentType("text/html;charset=windows-31J");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Servlet 1</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 1</h1>");
		out.println("<p>セッションを開始しました</p>");
		out.println("</body>");
		out.println("</html>");
		}

}

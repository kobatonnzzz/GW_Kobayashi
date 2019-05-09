package web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//送信されてくるパラメータ―の値をエンコーディングの指定
				req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得 (文字列)
				String param=req.getParameter("param");
				String param2=req.getParameter("param2");
				String param3=req.getParameter("param3");
				String param4=req.getParameter("param4");
				String param5=req.getParameter("param5");
		//以下、HTML形式で出力されるためのコード
				resp.setContentType("text/html; charset = UTF-8");
				PrintWriter out = resp.getWriter ();
				out.println("<html>");
				out.println("<head>");
				out.println("<body>");
				out.println("<h1>お名前</h1>");
				out.println(param);
				out.println("<h1>年齢</h1>");
				out.println(param2);
				out.println("<h1>性別</h1>");
				out.println(param3);
				out.println("<h1>興味のある言語</h1>");
				out.println(param4);
				out.println("<h1>なにか一言</h1>");
				out.println(param5);
				out.println("</body>");
				out.println("</head>");
				out.println("</html>");
				out.close();

	}

}

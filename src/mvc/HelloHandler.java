package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
@Controller
public class HelloHandler implements CommandHandler {
	@RequestMapping( "/hello" )
	@Override
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setAttribute( "result", "안녕하세요" );
		return new ModelAndView( "/mvc/hello" );
	}
}

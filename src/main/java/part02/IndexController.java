package part02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// http://localhost:8090/myapp/index.do
@Controller
public class IndexController {

	
	public IndexController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping("/index.do")
	public String process() {
		return "part02/index";
	}
}

package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
//	http://localhost:8090/myapp/list.do
	@RequestMapping(value = "/list.do")
	public String listProcess() {
		System.out.println("list Controller");
		return "part01/list";
	}
	
	
//	http://localhost:8090/myapp/view.do
	@RequestMapping(value = "/view.do")
	public String viewProcess() {
		System.out.println("view controller");
		return "part01/view";
	}
	
//	http://localhost:8090/myapp/write.do	
	@RequestMapping(value = "/write.do")
	public String writeProcess() {
		System.out.println("write cintroller");
		return "part01/write";
	}
}

package part02;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// http://localhost:8090/myapp/login.do

@Controller
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value = "login.do")
	public String loginProcess() {
		return "part02/loginform";
	}
	
	@RequestMapping("/loginpro.do")
	public String loginExecute(String returnUrl, PersonDTO dto, HttpSession session) {
		if(dto.getId().equals("hyohyo") && dto.getPass().equals("a1234")) {
			session.setAttribute("chk", dto.getId());
			System.out.println(session.getAttribute("chk"));
			if(returnUrl !="") {
				return "redirect:/"+returnUrl;
			}
		}
		
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/logout.do")
	public String logoutProcess(HttpSession session) {
		session.removeAttribute("chk");
		return "redirect:/index.do";
		
	}
}

package carpma.sum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

}

package in.sp.main;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import in.sp.bean.userController;


@Controller
public class MyController {
//	@RequestMapping(value="/hellopage", method = RequestMethod.GET)
	@GetMapping("/hellopage")
	public ModelAndView openHellopage()
	{
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
		
	}
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutpage() {
		ModelAndView m = new ModelAndView();
		
		m.setViewName("about");
		
		return m;
	}
	
	@GetMapping("/contact")
    public String getAboutPage(Model model) {
        model.addAttribute("year", "2024");
        return "contact"; // View name
    }
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView m = new ModelAndView();
		
		m.setViewName("register");
		
		return m;
	}

	
//	@PostMapping("/submitform")
	
	
//	public String hForm(HttpServletRequest req) {
		
//		String name = req.getParameter("name");
//		String mail = req.getParameter("name");
//		String phone = req.getParameter("name");
//		
//		
//	public String hForm(
//	@RequestParam("name")String name,
//	@RequestParam("mail")String mail,
//	@RequestParam("phone")String phone,
//	Model model 
//	
//	) {
//		
//		System.out.println(name + mail + phone);
//		model.addAttribute("name",name);
//		model.addAttribute("mail",mail);
//		model.addAttribute("phone",phone);
//		
//		return "profile";
//		
//	}
	
	
	 @PostMapping("/submitform")
//	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
    public String hForm(@ModelAttribute userController user, Model model) {
        System.out.println(user.getName());
        System.out.println(user.getMail());
        System.out.println(user.getPhone());
        
        model.addAttribute("user",user);
        return "profile";
    }
}

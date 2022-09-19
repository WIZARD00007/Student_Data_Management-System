package com.akshay.webApp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.akshay.webApp.Alien;

	@Controller
	public class AlienController {
		
	@Autowired
	AlienRepo repo;
	
	@Autowired
	regiRepo regi;
	@RequestMapping("/register")
	public String register(Students student,@RequestParam("psw") String psw,@RequestParam("psw_repeat") String psw_repeat)
	{
		if(psw.equals(psw_repeat)) {
		regi.save(student);
		return "regiSuccess.jsp";}
		else
		{
		return "regiFail.jsp";
	}}

	@RequestMapping("/")
	public String loginOrRegist()
	{

	return "default.jsp";
	}
	@RequestMapping("/Student")
	public String stud()
	{
		return "register.jsp";
	}
		
	@RequestMapping("/home")
	public String home()
	{

	return "home.jsp";
	}
	@RequestMapping("/admin")
	public String login()
	{
		return "Login.jsp";
		}
@RequestMapping("/addAlien")
public String addAlien(Alien alien)
{
	repo.save(alien);
	return "home.jsp";
}
@RequestMapping("/veriAppli")
public String verify()
{
return "veri.jsp";
}



@RequestMapping("/veriUser")
public String veri(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
{

if(username.equals("admin") && password.equals("admin@123"))
{
	return "home.jsp";
}
else
	return "error.jsp";
}
@GetMapping(path="/veriApp")
@ResponseBody
public List<Students> getAliens()
{
return regi.findAll();
}

@RequestMapping("/veriStudent")
@ResponseBody
public Optional<Students> getStudents(@RequestParam("id") String id)
{
return regi.findById(id);	
}
@RequestMapping("/admin/delete")
@ResponseBody
public String deleteStud(@RequestParam("id") String id)
{
	 regi.deleteById(id);
	return "Successfully deleted application "+id;


}

@RequestMapping("/admin/update")
@ResponseBody
public void updateCust(@RequestParam("id") String id) {
Students stud = regi.findById(id).orElse(null);
stud.setStatus("Approved");
regi.save(stud);
System.out.println("Successfully Approved Application "+id);

	}
@RequestMapping("/admin/reject")
@ResponseBody
public void RejectCust(@RequestParam("id") String id) {
Students stud = regi.findById(id).orElse(null);
stud.setStatus("Rejected");
regi.save(stud);
System.out.println("Successfully Rejected Application "+id);
  

	}
	}
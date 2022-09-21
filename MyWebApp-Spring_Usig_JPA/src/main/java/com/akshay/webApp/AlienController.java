package com.akshay.webApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
	public String register(Students student,@RequestParam("psw") String psw,@RequestParam("psw_repeat") String psw_repeat,ModelMap model)
	{
		if(psw.equals(psw_repeat)) {
		Students st=regi.save(student);
		System.out.println(st.getId());
	model.addAttribute("student",st.getId());
		
		return "regiSuccess.jsp";}
		else
		{
		return "regiFail.jsp";
	}}
@RequestMapping("/getDetails")
public String getDet()
{
	return "StudDetails.jsp";
	
}
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
@RequestMapping("/getStatus")
public String getStat(@RequestParam("id") String id,ModelMap model)
{
	Students st= regi.findById(id).orElse(null);
	model.addAttribute("uid", st.getId());
	model.addAttribute("status", st.getStatus());
	model.addAttribute("fname", st.getFirstName());
	return "StudStatus.jsp";
}
@RequestMapping("/veriStudent")
//@ResponseBody
public String getStudents(@RequestParam("id") String id,ModelMap model)
{
	
Students st= regi.findById(id).orElse(null);
model.addAttribute("uid", st.getId());
model.addAttribute("fname", st.getFirstName());
model.addAttribute("mname", st.getMiddleName());
model.addAttribute("lname", st.getLastName());
model.addAttribute("gender", st.getGender());
model.addAttribute("phone", st.getPhone());
model.addAttribute("address", st.getAddress());
model.addAttribute("email", st.getEmail());
model.addAttribute("status", st.getStatus());
model.addAttribute("course", st.getCourse());
return "StudDetails.jsp";
}
@RequestMapping("/veriStudentData")
//@ResponseBody
public String getStudentsData(@RequestParam("id") String aid,@RequestParam("password") String passw,ModelMap model)
{
	
Students st= regi.findById(aid).orElse(null);
model.addAttribute("uid", st.getId());
model.addAttribute("fname", st.getFirstName());
model.addAttribute("mname", st.getMiddleName());
model.addAttribute("lname", st.getLastName());
model.addAttribute("gender", st.getGender());
model.addAttribute("phone", st.getPhone());
model.addAttribute("address", st.getAddress());
model.addAttribute("email", st.getEmail());
model.addAttribute("status", st.getStatus());
model.addAttribute("course", st.getCourse());
if(aid.equals(st.getId()) && passw.equals(st.getPsw()))
{
return "StudDetails.jsp";
}
else
{
return "errorLog.jsp";	
}
}
@RequestMapping("/delete")
//@ResponseBody
public String deleteStud(@RequestParam("id") String id)
{
	 regi.deleteById(id);
	 return "adminAft.jsp";


}

@RequestMapping("/update")
//@ResponseBody
public String updateCust(@RequestParam("id") String id) {
Students stud = regi.findById(id).orElse(null);
stud.setStatus("Approved");
regi.save(stud);
return "adminAft.jsp";
//System.out.println("Successfully Approved Application "+id);

	}
@RequestMapping("/reject")
//@ResponseBody
public String RejectCust(@RequestParam("id") String id) {
Students stud = regi.findById(id).orElse(null);
stud.setStatus("Rejected");
regi.save(stud);
return "adminAft.jsp";
//System.out.println("Successfully Rejected Application "+id);
  

	}
	}
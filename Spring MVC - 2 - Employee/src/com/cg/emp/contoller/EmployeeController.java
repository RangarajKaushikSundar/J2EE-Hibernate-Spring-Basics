package com.cg.emp.contoller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cg.emp.service.EmployeeService;
import com.cg.emp.vo.Employee;
@Controller
public class EmployeeController {
		@Autowired
		private EmployeeService employeeService;
		@RequestMapping("/index.html")
		public String index(){
			return "index";
		}
		@RequestMapping("/addEmployee")
		public String addEmployee(){
			return "addEmployee";
		}
		@RequestMapping(value="/storeEmployee",method = RequestMethod.POST)
		public String storeEmployee(Employee emp,Model model){
			model.addAttribute("emp",emp);
			model.addAttribute("message", "Please confirm employee details");
			return "confirmEmployee";
		}
		@RequestMapping(value="/viewEmployees")
		public String viewEmployees(Model model){
			List<Employee> list=employeeService.getEmpList();
			model.addAttribute("list", list);
			return "viewEmpList";
		}
		
}

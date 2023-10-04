package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Nutthawat Aonprasert 6410450940
//Controller จัดการหน้า home
@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";

    }
}

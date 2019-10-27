package cn.edu.uestc.iaa.ActionController;

import cn.edu.uestc.iaa.Data.getData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActionController{

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String userRegister() {

        return "index"; // 提示信息后 跳转到用户登录界面
    }

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(Model model,String arg1, String arg2){
        getData getd=new getData();
        System.out.println(arg1+arg2);
        String s=getd.get(arg1,arg2);
        model.addAttribute("message",s);
        return "search";
    }
}


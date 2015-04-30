package web;

import domian.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MessageService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2015/4/30.
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/{table_name}/{id}")
    public String getMessgae(@PathVariable(value = "table_name") String table_name,@PathVariable Integer id,HttpServletRequest request){
        Message message=messageService.findMessageById(table_name,id);
        request.setAttribute("img_url",message.getImg_url());
        request.setAttribute("breif",message.getBrief());
        request.setAttribute("address_url",message.getAddress_url());
        request.setAttribute("comes_form",message.getComes_from());
        request.setAttribute("pub_time",message.getPub_time());
        request.setAttribute("title",message.getTitle());
        request.setAttribute("comes_url",message.getComes_url());
        return "showmessage";
    }

}

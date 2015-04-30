package service;

import domian.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2015/4/30.
 */
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TestMessageService extends AbstractTestNGSpringContextTests{
    @Autowired
    private MessageService messageService;

    @Test
    public void showMessage(){
        Message message=messageService.findAllMessage("web_table").get(1);
        System.out.println(message.getBrief());
    }

}

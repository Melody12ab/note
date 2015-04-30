package service;

import dao.MessageDao;
import domian.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/4/30.
 */
@Service
public class MessageService {
    @Autowired
    private MessageDao messageDao;

    public Message findMessageById(String table_name,Integer id){
        return messageDao.findMessageById(table_name,id);
    }

    public List<Message> findAllMessage(String table_name){
        return messageDao.findAllMessagefromTable(table_name);
    }

}

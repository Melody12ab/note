package dao;

import domian.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/4/30.
 */
@Repository
public class MessageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Message findMessageById(String table_name,Integer id){
        String sql="select address_url,title,img_url,pub_time,brief,comes_from,comes_url from "+table_name+" where ID=?";
        final Message message=jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Message>() {
            @Override
            public Message mapRow(ResultSet resultSet, int i) throws SQLException {
                Message message1=new Message();
                message1.setTitle(resultSet.getString("title"));
                message1.setAddress_url(resultSet.getString("address_url"));
                message1.setBrief(resultSet.getString("brief"));
                message1.setComes_from(resultSet.getString("comes_from"));
                message1.setComes_url(resultSet.getString("comes_url"));
                message1.setImg_url(resultSet.getString("img_url"));
                message1.setPub_time(resultSet.getString("pub_time"));
                return message1;
            }
    });
    return message;
    }

    public List<Message> findAllMessagefromTable(String table_name){
        final List<Message> list=new ArrayList<Message>();
        jdbcTemplate.query("select * from " + table_name, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Message message1=new Message();
                message1.setTitle(resultSet.getString("title"));
                message1.setAddress_url(resultSet.getString("address_url"));
                message1.setBrief(resultSet.getString("brief"));
                message1.setComes_from(resultSet.getString("comes_from"));
                message1.setComes_url(resultSet.getString("comes_url"));
                message1.setImg_url(resultSet.getString("img_url"));
                message1.setPub_time(resultSet.getString("pub_time"));
                list.add(message1);
            }
        });
        return list;
    }
}

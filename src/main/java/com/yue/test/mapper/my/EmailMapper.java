package com.yue.test.mapper.my;

import com.yue.test.entity.Email;
import com.yue.test.mapper.TKMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author yuyu <yu.yu@chinaott.net>
 * @date 2017-04-03
 */
@Repository
public interface EmailMapper extends TKMapper<Email> {

    @Select({"SELECT GROUP_CONCAT(day) FROM Email"})
    String getSendDays();

    @Insert({"INSERT INTO email(day) VALUE(#{day})"})
    void insertBysql(Email email);
}

package com.yue.test.mapper.my;

import com.yue.test.entity.Email;
import com.yue.test.entity.WeChatInfo;
import com.yue.test.mapper.TKMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author yuyu <yu.yu@chinaott.net>
 * @date 2017-04-03
 */
@Repository
public interface WeChatInfoMapper extends TKMapper<WeChatInfo> {

    @Select({"<script>",
            "SELECT * FROM WeChatInfo ",
            "WHERE nickName=#{nickName}",
            " AND DATE_FORMAT(createTime, '%Y-%m') = DATE_FORMAT(NOW(), '%Y-%m')",
            "</script>"})
    WeChatInfo selectCurrentUM(WeChatInfo weChatInfo);
}

package com.blog.bean;

import lombok.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class BlogListBean {
    private Integer id;
    private String sort;
    private String title;
    private boolean recommend;
    private boolean published;
    private Date update_date;

    public String getUpdate_date() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String update_dat = simpleDateFormat.format(update_date);
        return update_dat;
    }
}

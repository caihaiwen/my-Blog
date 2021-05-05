package com.blog.bean;

import lombok.Data;

import java.util.Date;
@Data
public class BlogShowBean {
    private Integer id;
    private Date release_date;
    private String title;
    private boolean appreciate;
    private boolean reprint;
    private boolean recommend;
    private String type;   //原创或转载
    private String f_image_address;
    private Integer views;
    private String content;
    private Integer s_id;
    private boolean published;
    private boolean comment;
    private Date update_date;
    private String description;
}

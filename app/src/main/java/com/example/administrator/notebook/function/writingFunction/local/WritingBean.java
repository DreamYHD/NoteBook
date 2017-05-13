package com.example.administrator.notebook.function.writingFunction.local;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dreamY on 2017/5/12.
 */
@Entity
public class WritingBean {

    @Id
    private long id;
    //保存最后的md类型content
    private String writingContentMD;
    //写文章的时间
    private String time;
    //文章标题
    private String title;
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getWritingContentMD() {
        return this.writingContentMD;
    }
    public void setWritingContentMD(String writingContentMD) {
        this.writingContentMD = writingContentMD;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Generated(hash = 847279018)
    public WritingBean(long id, String writingContentMD, String time, String title) {
        this.id = id;
        this.writingContentMD = writingContentMD;
        this.time = time;
        this.title = title;
    }
    @Generated(hash = 2029077604)
    public WritingBean() {
    }



}

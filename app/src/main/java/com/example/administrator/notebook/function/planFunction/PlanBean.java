package com.example.administrator.notebook.function.planFunction;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dreamY on 2017/5/12.
 */

@Entity
public class PlanBean {

    @Id
    private long id;
    //计划的时间
    private String time;
    //计划的内容
    private String content;
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Generated(hash = 432036495)
    public PlanBean(long id, String time, String content) {
        this.id = id;
        this.time = time;
        this.content = content;
    }
    @Generated(hash = 1985632014)
    public PlanBean() {
    }

}

package com.example.administrator.notebook.function.writingFunction.local;

import com.example.administrator.notebook.base.BaseData;
import com.example.administrator.notebook.local.LocalManager;

/**
 * Created by dreamY on 2017/5/13.
 */

public class WritingDataMamager extends BaseData<WritingBean,WritingBeanDao> {
    @Override
    public WritingBeanDao getBeanDao() {
        return LocalManager.getInstance().getDaoSession().getWritingBeanDao();
    }

    @Override
    public void update(long id, WritingBean mWritingBean) {
        WritingBean m=findById(id);
        m.setTime(mWritingBean.getTime());
        m.setTitle(mWritingBean.getTitle());
        getBeanDao().update(m);
    }

    @Override
    public WritingBean findById(long id) {
        return getBeanDao().queryBuilder()
                .where(WritingBeanDao.Properties.Id.eq(id))
                .build()
                .unique();
    }
}

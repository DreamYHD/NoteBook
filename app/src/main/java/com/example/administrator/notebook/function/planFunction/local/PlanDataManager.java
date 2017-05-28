package com.example.administrator.notebook.function.planFunction.local;

import com.example.administrator.notebook.base.BaseData;
import com.example.administrator.notebook.local.LocalManager;

/**
 * Created by dreamY on 2017/5/13.
 */

public class PlanDataManager extends BaseData<PlanBean,PlanBeanDao> {
    @Override
    public PlanBeanDao getBeanDao() {
        return LocalManager.getInstance().getDaoSession().getPlanBeanDao();
    }
    @Override
    public void update(long id, PlanBean mPlanBean) {
        PlanBean m=findById(id);
        m.setContent(mPlanBean.getContent());
        m.setTime(mPlanBean.getTime());
        getBeanDao().update(m);
    }
    @Override
    public PlanBean findById(long id) {
        return getBeanDao().queryBuilder()
                .where(PlanBeanDao.Properties.Id.eq(id)).build().unique();
    }
}

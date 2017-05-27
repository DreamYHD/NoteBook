package com.example.administrator.notebook.function.writingFunction;

import com.example.administrator.notebook.base.BaseModel;
import com.example.administrator.notebook.function.writingFunction.local.WritingBean;
import com.example.administrator.notebook.function.writingFunction.local.WritingDataMamager;
import com.example.administrator.notebook.local.LocalManager;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by dreamY on 2017/5/9.
 */

public class WritingModel implements WritingContract.Model{
    private WritingDataMamager mWritingDataMamager=new WritingDataMamager();
    @Override
    public Observable<List<WritingBean>> getWriting() {
        return  Observable.fromArray(mWritingDataMamager.queryData())
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread());
    }
}

package com.conquer.elspet.conqueryo.mvp.ui.adapter;

import android.view.View;

import com.conquer.elspet.conqueryo.R;
import com.jess.arms.base.BaseHolder;
import com.jess.arms.base.DefaultAdapter;

import java.util.List;


import com.conquer.elspet.conqueryo.mvp.model.entity.User;
import com.conquer.elspet.conqueryo.mvp.ui.holder.UserItemHolder;

/**
 * Created by jess on 9/4/16 12:57
 * Contact with jess.yan.effort@gmail.com
 */
public class UserAdapter extends DefaultAdapter<User> {
    public UserAdapter(List<User> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<User> getHolder(View v, int viewType) {
        return new UserItemHolder(v);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.recycle_list;
    }
}

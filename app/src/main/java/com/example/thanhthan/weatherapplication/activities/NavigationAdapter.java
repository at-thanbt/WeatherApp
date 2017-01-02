package com.example.thanhthan.weatherapplication.activities;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanhthan.weatherapplication.R;

import java.util.List;

/**
 * Created by Thanh Than on 02/01/2017.
 */

public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.MyHolder> {
    //private List<>
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView mImgLogo;
        ImageButton mImgBtnAdd;
        TextView mTvName;
        TextView mTvDes;

        public MyHolder(View itemView) {
            super(itemView);
            mImgLogo = (ImageView) itemView.findViewById(R.id.idImage);
            mImgBtnAdd = (ImageButton) itemView.findViewById(R.id.idButton);
            mTvName = (TextView) itemView.findViewById(R.id.idname);
            mTvDes = (TextView) itemView.findViewById(R.id.idname1);
        }
    }
}

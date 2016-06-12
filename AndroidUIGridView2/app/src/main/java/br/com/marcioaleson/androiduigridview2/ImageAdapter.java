package br.com.marcioaleson.androiduigridview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by marci_000 on 25/08/2015.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview;
        if (convertView == null){
            imageview = new ImageView(mContext);
            imageview.setLayoutParams(new GridView.LayoutParams(85,85));
            imageview.setScaleType(imageview.getScaleType().CENTER_CROP);
            imageview.setPadding(8,8,8,8);
        }else{
            imageview = (ImageView)convertView;
        }
        imageview.setImageResource(mThumbIds[position]);
        return imageview;
    }

    public Integer[] mThumbIds = {
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images5,
            R.drawable.images6,
            R.drawable.images7,
            R.drawable.images8,
    };

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public Integer[] getmThumbIds() {
        return mThumbIds;
    }

    public void setmThumbIds(Integer[] mThumbIds) {
        this.mThumbIds = mThumbIds;
    }
}

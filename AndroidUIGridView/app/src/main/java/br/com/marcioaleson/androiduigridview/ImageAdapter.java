package br.com.marcioaleson.androiduigridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by marci_000 on 24/08/2015.
 */
public class ImageAdapter extends BaseAdapter{

    private Context mContext;

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public int getCount(){
        return mThumbIds.length;
    }

    public  Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public Context getmContext() {

        return mContext;
    }

    //Create a new imageVIew for each item.
    public View getView(int position, View convertView, ViewGroup parent){
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

    //Take all images.
    public Integer[] mThumbIds = {
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images5,
            R.drawable.images6,
            R.drawable.images7,
            R.drawable.images8
    };
}

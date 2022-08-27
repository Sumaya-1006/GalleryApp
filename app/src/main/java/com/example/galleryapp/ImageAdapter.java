package com.example.galleryapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public int[] imageArray =  {
            R.drawable.background, R.drawable.image, R.drawable.image1,R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,
            R.drawable.image9,R.drawable.image10,R.drawable.images11,R.drawable.image12,R.drawable.image13,
            R.drawable.image14,  R.drawable.images15,  R.drawable.photos,R.drawable.image5,R.drawable.image6,
            R.drawable.image8,R.drawable.image9,


    };

    public ImageAdapter(Context mContext) {

        this.mContext = mContext;
    }

    @Override
    public int getCount() {

        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {

        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));


        return imageView;
    }


}


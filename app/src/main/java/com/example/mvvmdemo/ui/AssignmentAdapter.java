package com.example.mvvmdemo.ui;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.bumptech.glide.Glide;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.data.Injection;
import com.example.mvvmdemo.utils.AppConstants;

public class AssignmentAdapter {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(imageView).load(AppConstants.Companion.getIMAGEURL() + url).into(imageView);
        }
    }

}

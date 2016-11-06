package com.gc.frameutils;

import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;

/**
 * 用Glide框架加载图片的时候根据图片尺寸让ImageView自适应
 * Created by gc on 2016/11/6.
 */
public class GlideUtils {

    private GlideUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 加载图片
     * @param view
     * @param url
     * @param targetWidth
     */
    public static void loadImage(ImageView view, String url, final int targetWidth) {
        Glide.with(view.getContext())
                .load(url)
                .into(new ImageViewTarget<GlideDrawable>(view) {
                    @Override
                    protected void setResource(GlideDrawable resource) {
                        autoFit(view, targetWidth, resource.getIntrinsicWidth(), resource.getIntrinsicHeight());
                        view.setImageDrawable(resource);
                    }
                });
    }

    public static void autoFit(ImageView imageView, int targetWidth, int photoWidth, int photoHeight) {
        float ratio = (targetWidth + 0f) / photoWidth;
        ViewGroup.LayoutParams params = imageView.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(targetWidth, (int) (photoHeight * ratio));
        } else {
            params.width = targetWidth;
            params.height = (int) (photoHeight * ratio);
        }
        imageView.setLayoutParams(params);
    }

}
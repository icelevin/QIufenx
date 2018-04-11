package com.hb.utils.tools.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import com.hb.utils.BaseApplication;
import com.hb.utils.R;
import com.hb.utils.common.ConstUtils;
import com.hb.utils.net.listener.OnResultListener;
import com.hb.utils.tools.LogUtils;

import java.io.File;

/**
 * Created by 69095 on 2017/5/29 0029.
 */
public class ImageLoadUtils {


    public static void load(String url, ImageView iv) {
        load(url, iv, 0, 0, false);
    }

    public static void load(String url, ImageView iv, int placeholder, int error, boolean isCircle) {
        if (TextUtils.isEmpty(url)) {
            return;
        }

        if (url.lastIndexOf("http://") > 0) {
            int lastIndexOf = url.lastIndexOf("http://");
            url = url.substring(lastIndexOf);
        }

        if (ConstUtils.getInstance().isDebug()) {
            LogUtils.print(ImageLoadUtils.class.getSimpleName(), "url=" + url);
        }


        Context context = BaseApplication.getAppContext();
        GlideRequest<Drawable> load = GlideApp.with(context).load(url);
        if (error > 0) {
            load.error(error);
        }
        if (placeholder > 0) {
            load.placeholder(placeholder);
            load.fallback(placeholder);//当url为空时，显示图片
        }
        if (isCircle) {
            load.transform(new GlideCircleTransform(context, 1, context.getResources().getColor(R.color.line)));
        }
        load.into(iv);
    }

    public static String downloadImage(final String url) {
        try {
            final Context context = BaseApplication.getAppContext();
            FutureTarget<File> target = Glide.with(context).asFile().load(url).submit();
            final File imageFile = target.get();
            return imageFile.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

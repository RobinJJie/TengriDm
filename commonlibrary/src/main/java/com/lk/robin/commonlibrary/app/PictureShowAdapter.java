package com.lk.robin.commonlibrary.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.github.chrisbanes.photoview.PhotoView;
import com.lk.robin.commonlibrary.R;

import java.io.File;
import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/18
 */
public class PictureShowAdapter extends PagerAdapter {
    private List<String> imageList;
    private Context context;
    private String fileName;

    public static final String GELIBANG_DIRECTORY = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separator + "tengri";
    //乐青岛缓存目录
    public static final String GELIBANG_CACHE = GELIBANG_DIRECTORY + File.separator + "cache";
    private String imgfileDir = GELIBANG_CACHE;
    private static Bitmap bitmap;

    public PictureShowAdapter(List<String> imageList, Context context) {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        final PhotoView imageView1 = new PhotoView(context);
        ViewGroup.LayoutParams params1 = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        imageView1.setLayoutParams(params1);
//        imageView1.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_placeholder_11));
//        imageView1.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                final RxDialogSureCancel rxDialogSureCancel = new RxDialogSureCancel(context);//提示弹窗
//                rxDialogSureCancel.setContent("保存图片?");
//                rxDialogSureCancel.getSureView().setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        fileName = System.currentTimeMillis() + ".jpg";
//                        NetUtil.downLoad(imageList.get(position), context, new FileCallback(imgfileDir, fileName) {
//                            @Override
//                            public void onSuccess(File file, Call call, Response response) {
//                                Toast.makeText(context, "保存成功", Toast.LENGTH_SHORT).show();
//                                try {
//                                    MediaStore.Images.Media.insertImage(context.getContentResolver(), file.getAbsolutePath(), fileName, null);
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//
//                                // 第三步：最后通知图库更新
//                                context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + file)));
//
//                            }
//                        });
//                        rxDialogSureCancel.cancel();
//                    }
//                });
//                rxDialogSureCancel.getCancelView().setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
////                        Environment.getExternalStorageDirectory()+File.separator+"lanjing"+File.separator+"image"
//                        rxDialogSureCancel.cancel();
//                    }
//                });
//                rxDialogSureCancel.show();
//                return true;
//            }
//        });


        if (!((Activity) context).isDestroyed()) {
            if (imageList.get(position).contains("http")) {
                Glide.with(context)
                        .load(imageList.get(position))
                        .apply(new RequestOptions()
                                .placeholder(R.drawable.ic_placeholder_11)
                                .error(R.drawable.ic_loading_error))
                        .into(imageView1);
            } else {
                Glide.with(context)
                        .load(imageList.get(position))
                        .apply(new RequestOptions()
                                .placeholder(R.drawable.ic_placeholder_11)
                                .error(R.drawable.ic_loading_error)
                                .skipMemoryCache(true)
                                .diskCacheStrategy(DiskCacheStrategy.NONE))
                        .into(imageView1);
            }

        }
        container.addView(imageView1);
        return imageView1;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
        object = null;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        if (imageList == null) {
            return 0;
        }
        return imageList.size();
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {

        bitmap = Bitmap.createBitmap(
                drawable.getIntrinsicWidth(),
                drawable.getIntrinsicHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmap;
    }
}

# 用法

### 控件属性
```
riv_border_width：  边框宽度 
riv_border_color：  边框颜色 
riv_oval：          是否圆形 
riv_corner_radius： 圆角弧度 
riv_corner_radius_top_left：左上角弧度 
riv_corner_radius_top_right： 右上角弧度 
riv_corner_radius_bottom_left：左下角弧度 
riv_corner_radius_bottom_right：右下角弧度 
```
xml中:
```xml
<com.qdgdcm.basecommonlib.tools.weight.round.RoundedImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/imageView1"
        android:src="@drawable/photo1"
        android:scaleType="fitCenter"
        app:riv_corner_radius="30dip"
        app:riv_border_width="2dip"
        app:riv_border_color="#333333"
        app:riv_mutate_background="true"
        app:riv_tile_mode="repeat"
        app:riv_oval="true" />
```
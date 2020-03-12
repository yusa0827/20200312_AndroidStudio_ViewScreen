package samples.opencv.my_size_changer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    private int winW, winH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boolean hasFocus_;

        //onWindowFocusChanged(boolean hasFocus_);
//        WindowManager wm = (WindowManager)getSystemService(WINDOW_SERVICE);
//        Display dp = wm.getDefaultDisplay();
//        TextView tv = new TextView(this);
//
//        Point size = new Point();
//        dp.getSize(size);
//
//        int screenWidth = size.x;
//        int screenHeight = size.y;
//
//
//        //tv.setText( "画面サイズ 縦:" + dp.getHeight() + "横：" + dp.getWidth() );
//        tv.setText( "画面サイズ 縦:" + screenWidth + "横：" + screenHeight );
//        setContentView(tv);
//
//
//
//        Display display = getWindowManager().getDefaultDisplay();
//
//        Point point = new Point();
//        display.getSize(point);

//        WindowManager wm =  (WindowManager)getSystemService(WINDOW_SERVICE);
//        Display disp = wm.getDefaultDisplay();
//        Point p;
//        winW = disp.getSize(p);
//        winH = disp.getHeight();
//        Log.i("MainActivity : ", "画面幅 = " + winW);
//        Log.i("MainActivity : ", "画面高さ = " + winH);
//


        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // ここに3秒後に実行したい処理 数独ホームの表示

                TextView tt_ = findViewById(R.id.text_);
                tt_.setText("画面幅 = " + winW + " : 画面高さ = " + winH);
                Log.i("MyActivity", "ViewSize:" +winW + "x" + winH);

            }
        }, 3000);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View view = findViewById(R.id.layout_size);

        winW = view.getWidth();
        winH = view.getHeight();

        Log.i("MyActivity", "ViewSize:" +winW + "x" + winW);
    }

    //1584 1080


//    TextView tv;
//    int tv_h;
//    int tv_w;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        tv = new TextView(this);
//
//        TextView tg = findViewById(R.id.text_);
//        tg.setText( "ビューサイズ 縦:" + String.valueOf(tv_h)+ "横：" + String.valueOf(tv_w) );
//        //setContentView(tv);
//    }
//
//    //タイトルバーなどを除いたビューの表示範囲を取得
//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        tv_h = tv.getHeight();
//        tv_w = tv.getWidth();
//
//        //tv.setText( "ビューサイズ 縦:" + tv.getHeight()+ "横：" + tv.getWidth() );
//    }
    //http://blog.oukasoft.com/%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%A0/%E3%80%90android%E3%80%91%E7%94%BB%E9%9D%A2%E3%82%B5%E3%82%A4%E3%82%BA%E3%80%81%E3%83%93%E3%83%A5%E3%83%BC%E3%81%AE%E3%82%B5%E3%82%A4%E3%82%BA%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B%E6%96%B9/


//    /**
//     * Get a Display Size
//     * @param activity
//     * @return Point, Point.x or Point.y
//     */
//    public static Point getDisplaySize(Activity activity){
//        Display display = activity.getWindowManager().getDefaultDisplay();
//        Point point = new Point();
//        display.getSize(point);
//        return point;
//    }
//
//    /**
//     * Get a Real Size(Hardware Size)
//     * @param activity
//     * @return
//     */
//    @SuppressLint("NewApi")
//    public static Point getRealSize(Activity activity) {
//
//        Display display = activity.getWindowManager().getDefaultDisplay();
//        Point point = new Point(0, 0);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
//            // Android 4.2~
//            display.getRealSize(point);
//            return point;
//
//        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
//            // Android 3.2~
//            try {
//                Method getRawWidth = Display.class.getMethod("getRawWidth");
//                Method getRawHeight = Display.class.getMethod("getRawHeight");
//                int width = (Integer) getRawWidth.invoke(display);
//                int height = (Integer) getRawHeight.invoke(display);
//                point.set(width, height);
//                return point;
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return point;
//    }
//
//    /**
//     * Get a view size. if display view size, after onWindowFocusChanged of method
//     * @param View
//     * @return
//     */
//    public static Point getViewSize(View View){
//        Point point = new Point(0, 0);
//        point.set(View.getWidth(), View.getHeight());
//
//        return point;
//    }
}

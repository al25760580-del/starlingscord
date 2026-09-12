package com.yalantis.ucrop;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c4;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.discord.R;
import com.facebook.react.devsupport.t;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import e.i;
import e.j;
import e.k;
import e.m;
import e.n;
import e.u;
import e.v;
import f4.l;
import hn.c;
import hn.d;
import i.h;
import io.sentry.android.core.internal.gestures.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kn.b;
import kotlin.jvm.internal.Intrinsics;
import m3.a;
import m3.x;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public class UCropActivity extends h {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Bitmap.CompressFormat f7277b0 = Bitmap.CompressFormat.JPEG;
    public int E;
    public int F;
    public boolean G;
    public UCropView I;
    public GestureCropImageView J;
    public OverlayView K;
    public ViewGroup L;
    public ViewGroup M;
    public ViewGroup N;
    public ViewGroup O;
    public ViewGroup P;
    public ViewGroup Q;
    public TextView S;
    public TextView T;
    public View U;
    public a V;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7278e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7279i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7283y;
    public boolean H = true;
    public final ArrayList R = new ArrayList();
    public Bitmap.CompressFormat W = f7277b0;
    public int X = 90;
    public int[] Y = {1, 2, 3};
    public final c Z = new c(this, 0);
    public final d a0 = new d(this, 3);

    static {
        l lVar = AppCompatDelegate.f732d;
        int i7 = c4.f925a;
    }

    public final void e(int i7) {
        GestureCropImageView gestureCropImageView = this.J;
        int i10 = this.Y[i7];
        gestureCropImageView.setScaleEnabled(i10 == 3 || i10 == 1);
        GestureCropImageView gestureCropImageView2 = this.J;
        int i11 = this.Y[i7];
        gestureCropImageView2.setRotateEnabled(i11 == 3 || i11 == 2);
    }

    public final void f(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    public final void g(int i7) {
        if (this.G) {
            this.L.setSelected(i7 == R.id.state_aspect_ratio);
            this.M.setSelected(i7 == R.id.state_rotate);
            this.N.setSelected(i7 == R.id.state_scale);
            this.O.setVisibility(i7 == R.id.state_aspect_ratio ? 0 : 8);
            this.P.setVisibility(i7 == R.id.state_rotate ? 0 : 8);
            this.Q.setVisibility(i7 == R.id.state_scale ? 0 : 8);
            x.a((ViewGroup) findViewById(R.id.ucrop_photobox), this.V);
            this.N.findViewById(R.id.text_view_scale).setVisibility(i7 == R.id.state_scale ? 0 : 8);
            this.L.findViewById(R.id.text_view_crop).setVisibility(i7 == R.id.state_aspect_ratio ? 0 : 8);
            this.M.findViewById(R.id.text_view_rotate).setVisibility(i7 == R.id.state_rotate ? 0 : 8);
            if (i7 == R.id.state_scale) {
                e(0);
            } else if (i7 == R.id.state_rotate) {
                e(1);
            } else {
                e(2);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q kVar;
        ArrayList arrayList;
        u uVar = u.f7849e;
        u uVar2 = u.f7850i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i7 = 1;
        boolean booleanExtra = intent.getBooleanExtra("com.yalantis.ucrop.StatusBarLight", true);
        int i10 = 0;
        boolean booleanExtra2 = intent.getBooleanExtra("com.yalantis.ucrop.NavigationBarLight", false);
        int i11 = 2;
        v statusBarStyle = booleanExtra ? new v(1, uVar2) : new v(2, uVar);
        v navigationBarStyle = booleanExtra2 ? new v(1, uVar2) : new v(2, uVar);
        int i12 = i.f7834a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) statusBarStyle.f7853b.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) navigationBarStyle.f7853b.invoke(resources2)).booleanValue();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            kVar = new n();
        } else if (i13 >= 29) {
            kVar = new m();
        } else if (i13 >= 28) {
            kVar = new e.l();
        } else {
            kVar = i13 >= 26 ? new k() : new j();
        }
        q qVar = kVar;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        qVar.z(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        qVar.d(window2);
        setContentView(R.layout.ucrop_activity_photobox);
        this.f7279i = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", getColor(R.color.ucrop_color_toolbar));
        this.f7280v = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", getColor(R.color.ucrop_color_active_controls_color));
        this.f7281w = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", getColor(R.color.ucrop_color_toolbar_widget));
        this.f7283y = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R.drawable.ucrop_ic_cross);
        this.E = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", 2131232518);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f7278e = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.f7278e = stringExtra;
        this.F = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", getColor(R.color.ucrop_color_default_logo));
        this.G = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f7282x = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", getColor(R.color.ucrop_color_crop_background));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        t tVar = new t(i7);
        WeakHashMap weakHashMap = u0.f1729a;
        l0.m(toolbar, tVar);
        toolbar.setBackgroundColor(this.f7279i);
        toolbar.setTitleTextColor(this.f7281w);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.f7281w);
        textView.setText(this.f7278e);
        Drawable drawableMutate = getDrawable(this.f7283y).mutate();
        int i14 = this.f7281w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableMutate.setColorFilter(i14, mode);
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n();
        }
        UCropView uCropView = (UCropView) findViewById(R.id.ucrop);
        this.I = uCropView;
        this.J = uCropView.getCropImageView();
        this.K = this.I.getOverlayView();
        this.J.setTransformImageListener(this.Z);
        ((ImageView) findViewById(R.id.image_view_logo)).setColorFilter(this.F, mode);
        findViewById(R.id.ucrop_frame).setBackgroundColor(this.f7282x);
        if (!this.G) {
            ((RelativeLayout.LayoutParams) findViewById(R.id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            findViewById(R.id.ucrop_frame).requestLayout();
        }
        ViewGroup viewGroup = null;
        if (this.G) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) findViewById(R.id.ucrop_photobox)).findViewById(R.id.controls_wrapper);
            viewGroup2.setVisibility(0);
            LayoutInflater.from(this).inflate(R.layout.ucrop_controls, viewGroup2, true);
            a aVar = new a();
            this.V = aVar;
            aVar.I(50L);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.state_aspect_ratio);
            this.L = viewGroup3;
            d dVar = this.a0;
            viewGroup3.setOnClickListener(dVar);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.state_rotate);
            this.M = viewGroup4;
            viewGroup4.setOnClickListener(dVar);
            ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.state_scale);
            this.N = viewGroup5;
            viewGroup5.setOnClickListener(dVar);
            this.O = (ViewGroup) findViewById(R.id.layout_aspect_ratio);
            this.P = (ViewGroup) findViewById(R.id.layout_rotate_wheel);
            this.Q = (ViewGroup) findViewById(R.id.layout_scale_wheel);
            View viewFindViewById = findViewById(R.id.controls_wrapper);
            final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ucrop_height_wrapper_states);
            l0.m(viewFindViewById.findViewById(R.id.wrapper_states), new androidx.core.view.t() { // from class: hn.b
                @Override // androidx.core.view.t
                public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                    Bitmap.CompressFormat compressFormat = UCropActivity.f7277b0;
                    Insets insetsF = windowInsetsCompat.f1605a.f(519);
                    int i15 = insetsF.f1556a;
                    int i16 = insetsF.f1558c;
                    int i17 = insetsF.f1559d;
                    view.setPaddingRelative(i15, 0, i16, i17);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i18 = dimensionPixelSize + i17;
                    if (layoutParams.height != i18) {
                        layoutParams.height = i18;
                        view.setLayoutParams(layoutParams);
                    }
                    return windowInsetsCompat;
                }
            });
            int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                parcelableArrayListExtra = new ArrayList();
                parcelableArrayListExtra.add(new jn.a(null, 1.0f, 1.0f));
                parcelableArrayListExtra.add(new jn.a(null, 3.0f, 4.0f));
                parcelableArrayListExtra.add(new jn.a(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
                parcelableArrayListExtra.add(new jn.a(null, 3.0f, 2.0f));
                parcelableArrayListExtra.add(new jn.a(null, 16.0f, 9.0f));
                intExtra = 2;
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            Iterator it = parcelableArrayListExtra.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.R;
                if (!zHasNext) {
                    break;
                }
                jn.a aVar2 = (jn.a) it.next();
                FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, viewGroup);
                frameLayout.setLayoutParams(layoutParams);
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
                aspectRatioTextView.setActiveColor(this.f7280v);
                aspectRatioTextView.setAspectRatio(aVar2);
                linearLayout.addView(frameLayout);
                arrayList.add(frameLayout);
                viewGroup = null;
            }
            ((ViewGroup) arrayList.get(intExtra)).setSelected(true);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ViewGroup) it2.next()).setOnClickListener(new d(this, i10));
            }
            this.S = (TextView) findViewById(R.id.text_view_rotate);
            int i15 = 1;
            ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setScrollingListener(new c(this, i15));
            ((HorizontalProgressWheelView) findViewById(R.id.rotate_scroll_wheel)).setMiddleLineColor(this.f7280v);
            findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new d(this, i15));
            findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new d(this, i11));
            int i16 = this.f7280v;
            TextView textView2 = this.S;
            if (textView2 != null) {
                textView2.setTextColor(i16);
            }
            this.T = (TextView) findViewById(R.id.text_view_scale);
            ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setScrollingListener(new c(this, i11));
            ((HorizontalProgressWheelView) findViewById(R.id.scale_scroll_wheel)).setMiddleLineColor(this.f7280v);
            int i17 = this.f7280v;
            TextView textView3 = this.T;
            if (textView3 != null) {
                textView3.setTextColor(i17);
            }
            ImageView imageView = (ImageView) findViewById(R.id.image_view_state_scale);
            ImageView imageView2 = (ImageView) findViewById(R.id.image_view_state_rotate);
            ImageView imageView3 = (ImageView) findViewById(R.id.image_view_state_aspect_ratio);
            imageView.setImageDrawable(new ln.d(imageView.getDrawable(), this.f7280v));
            imageView2.setImageDrawable(new ln.d(imageView2.getDrawable(), this.f7280v));
            imageView3.setImageDrawable(new ln.d(imageView3.getDrawable(), this.f7280v));
        }
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        String stringExtra2 = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra2) ? Bitmap.CompressFormat.valueOf(stringExtra2) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = f7277b0;
        }
        this.W = compressFormatValueOf;
        this.X = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.Y = intArrayExtra;
        }
        this.J.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.J.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.J.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.K.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.K.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.K.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.K.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.K.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.K.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.K.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.K.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.K.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.K.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.K.setCropGridCornerColor(intent.getIntExtra("com.yalantis.ucrop.CropGridCornerColor", getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.K.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup6 = this.L;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            float f2 = floatExtra / floatExtra2;
            this.J.setTargetAspectRatio(Float.isNaN(f2) ? 0.0f : f2);
        } else if (parcelableArrayListExtra2 == null || intExtra2 >= parcelableArrayListExtra2.size()) {
            this.J.setTargetAspectRatio(0.0f);
        } else {
            float f7 = ((jn.a) parcelableArrayListExtra2.get(intExtra2)).f13975e / ((jn.a) parcelableArrayListExtra2.get(intExtra2)).f13976i;
            this.J.setTargetAspectRatio(Float.isNaN(f7) ? 0.0f : f7);
        }
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra4 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra3 > 0 && intExtra4 > 0) {
            this.J.setMaxResultImageSizeX(intExtra3);
            this.J.setMaxResultImageSizeY(intExtra4);
        }
        if (uri == null || uri2 == null) {
            f(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent)));
            finish();
        } else {
            try {
                GestureCropImageView gestureCropImageView = this.J;
                int maxBitmapSize = gestureCropImageView.getMaxBitmapSize();
                new b(gestureCropImageView.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new fj.c(27, gestureCropImageView)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (Exception e10) {
                f(e10);
                finish();
            }
        }
        if (!this.G) {
            e(0);
        } else if (this.L.getVisibility() == 0) {
            g(R.id.state_aspect_ratio);
        } else {
            g(R.id.state_scale);
        }
        if (this.U == null) {
            this.U = new View(this);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(3, R.id.toolbar);
            this.U.setLayoutParams(layoutParams2);
            this.U.setClickable(true);
        }
        ((RelativeLayout) findViewById(R.id.ucrop_photobox)).addView(this.U);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f7281w, PorterDuff.Mode.SRC_ATOP);
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", e10.getMessage() + " - " + getString(R.string.ucrop_mutate_exception_hint));
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = getDrawable(this.E);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(this.f7281w, PorterDuff.Mode.SRC_ATOP);
        menuItemFindItem2.setIcon(drawable);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_crop) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }
        this.U.setClickable(true);
        this.H = true;
        supportInvalidateOptionsMenu();
        GestureCropImageView gestureCropImageView = this.J;
        Bitmap.CompressFormat compressFormat = this.W;
        int i7 = this.X;
        c cVar = new c(this, 3);
        gestureCropImageView.f();
        gestureCropImageView.setImageToWrapCropBounds(false);
        RectF rectF = gestureCropImageView.M;
        RectF rectFJ = c9.a.J(gestureCropImageView.f15928d);
        float currentScale = gestureCropImageView.getCurrentScale();
        float currentAngle = gestureCropImageView.getCurrentAngle();
        e eVar = new e();
        eVar.f12232c = rectF;
        eVar.f12233d = rectFJ;
        eVar.f12230a = currentScale;
        eVar.f12231b = currentAngle;
        int i10 = gestureCropImageView.V;
        int i11 = gestureCropImageView.W;
        String imageInputPath = gestureCropImageView.getImageInputPath();
        String imageOutputPath = gestureCropImageView.getImageOutputPath();
        jn.c exifInfo = gestureCropImageView.getExifInfo();
        jn.b bVar = new jn.b();
        bVar.f13977a = i10;
        bVar.f13978b = i11;
        bVar.f13981e = compressFormat;
        bVar.f13979c = i7;
        bVar.f13980d = imageInputPath;
        bVar.f13982f = imageOutputPath;
        bVar.f13983g = exifInfo;
        new BitmapCropTask(gestureCropImageView.getViewBitmap(), eVar, bVar, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.H);
        menu.findItem(R.id.menu_loader).setVisible(this.H);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // i.h, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.J;
        if (gestureCropImageView != null) {
            gestureCropImageView.f();
        }
    }
}

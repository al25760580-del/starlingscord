package com.facebook.react.devsupport;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.discord.R;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.yalantis.ucrop.UCropActivity;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.i0;
import io.sentry.protocol.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5177e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5178i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f5181x;

    public /* synthetic */ h(DefaultDevLoadingViewImplementation defaultDevLoadingViewImplementation, String str, Double d6, Double d7, Boolean bool) {
        this.f5176d = 1;
        this.f5177e = defaultDevLoadingViewImplementation;
        this.f5178i = str;
        this.f5179v = d6;
        this.f5180w = d7;
        this.f5181x = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int color;
        int i7 = this.f5176d;
        Object obj = this.f5178i;
        Object obj2 = this.f5177e;
        Object obj3 = this.f5181x;
        Object obj4 = this.f5180w;
        Object obj5 = this.f5179v;
        switch (i7) {
            case 0:
                DefaultDevLoadingViewImplementation.updateProgress$lambda$1((Integer) obj5, (Integer) obj4, (Integer) obj3, (DefaultDevLoadingViewImplementation) obj2, (String) obj);
                break;
            case 1:
                DefaultDevLoadingViewImplementation.showMessage$lambda$0((DefaultDevLoadingViewImplementation) obj2, (String) obj, (Double) obj5, (Double) obj4, (Boolean) obj3);
                break;
            case 2:
                DevLoadingModule.showMessage$lambda$0((DevLoadingModule) obj5, (String) obj, (Double) obj4, (Double) obj3, (Boolean) obj2);
                break;
            case 3:
                String str = (String) obj;
                UCropActivity uCropActivity = (UCropActivity) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                if (str != null) {
                    try {
                        Resources resources = uCropActivity.getResources();
                        View viewFindViewById = uCropActivity.findViewById(R.id.wrapper_controls);
                        if (viewFindViewById == null) {
                            Log.w("ImageCropPicker", "Could not find wrapper_controls view");
                        } else if (viewFindViewById instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                            if (viewGroup.getChildCount() > 0) {
                                View childAt = viewGroup.getChildAt(0);
                                if (childAt instanceof ImageView) {
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    float fApplyDimension = TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
                                    gradientDrawable.setCornerRadii(new float[]{fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, 0.0f, 0.0f, 0.0f, 0.0f});
                                    gradientDrawable.setColor(Color.parseColor(str));
                                    childAt.setBackground(gradientDrawable);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        Log.e("ImageCropPicker", "Error applying controls background color", e10);
                    }
                }
                if (str2 != null) {
                    try {
                        View viewFindViewById2 = uCropActivity.findViewById(R.id.wrapper_states);
                        if (viewFindViewById2 == null) {
                            Log.w("ImageCropPicker", "Could not find wrapper_states view");
                        } else {
                            viewFindViewById2.setBackgroundColor(Color.parseColor(str2));
                        }
                    } catch (Exception e11) {
                        Log.e("ImageCropPicker", "Error applying controls bar background color", e11);
                    }
                }
                if (str3 != null || str4 != null) {
                    if (str3 != null) {
                        try {
                            color = Color.parseColor(str3);
                        } catch (Exception e12) {
                            Log.e("ImageCropPicker", "Error applying widget colors", e12);
                            return;
                        }
                    } else {
                        color = -1;
                    }
                    int color2 = str4 != null ? Color.parseColor(str4) : -1;
                    il.e.c(uCropActivity, R.id.state_aspect_ratio, R.id.image_view_state_aspect_ratio, R.id.text_view_crop, color, color2);
                    il.e.c(uCropActivity, R.id.state_rotate, R.id.image_view_state_rotate, R.id.text_view_rotate, color, color2);
                    il.e.c(uCropActivity, R.id.state_scale, R.id.image_view_state_scale, R.id.text_view_scale, color, color2);
                    il.e.b(uCropActivity, color, color2);
                    if (color2 != -1) {
                        try {
                            View viewFindViewById3 = uCropActivity.findViewById(R.id.rotate_scroll_wheel);
                            if (viewFindViewById3 != null) {
                                il.e.s(color2, viewFindViewById3);
                            }
                            View viewFindViewById4 = uCropActivity.findViewById(R.id.scale_scroll_wheel);
                            if (viewFindViewById4 != null) {
                                il.e.s(color2, viewFindViewById4);
                            }
                        } catch (Exception e13) {
                            Log.e("ImageCropPicker", "Error applying wheel tick colors", e13);
                            return;
                        }
                        Log.e("ImageCropPicker", "Error applying widget colors", e12);
                    }
                }
                break;
            default:
                AtomicReference atomicReference = (AtomicReference) obj5;
                View view = (View) obj4;
                List list = (List) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                ILogger iLogger = (ILogger) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    i0 i0Var = new i0("android_view_system", arrayList);
                    j0 j0VarD = ViewHierarchyEventProcessor.d(view);
                    arrayList.add(j0VarD);
                    ViewHierarchyEventProcessor.a(view, j0VarD, list);
                    atomicReference.set(i0Var);
                    countDownLatch.countDown();
                } catch (Throwable th2) {
                    iLogger.g(SentryLevel.ERROR, "Failed to process view hierarchy.", th2);
                }
                break;
        }
    }

    public /* synthetic */ h(DevLoadingModule devLoadingModule, String str, Double d6, Double d7, Boolean bool) {
        this.f5176d = 2;
        this.f5179v = devLoadingModule;
        this.f5178i = str;
        this.f5180w = d6;
        this.f5181x = d7;
        this.f5177e = bool;
    }

    public /* synthetic */ h(il.a aVar, String str, UCropActivity uCropActivity, String str2, String str3, String str4) {
        this.f5176d = 3;
        this.f5178i = str;
        this.f5179v = uCropActivity;
        this.f5180w = str2;
        this.f5181x = str3;
        this.f5177e = str4;
    }

    public /* synthetic */ h(Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f5176d = i7;
        this.f5179v = serializable;
        this.f5180w = obj;
        this.f5181x = obj2;
        this.f5177e = obj3;
        this.f5178i = obj4;
    }
}

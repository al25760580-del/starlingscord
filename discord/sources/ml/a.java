package ml;

import a5.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.f0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import io.sentry.o;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f0 {
    public String E;
    public List F;
    public double G;
    public int H;
    public double I;
    public int J;
    public int K;
    public String L;
    public Integer M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f15875e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f15876i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f15877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f15879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f15880y;

    public a(Context context) {
        super(context, null);
        this.f15875e = 0.0d;
        this.f15876i = 0.0d;
        this.f15877v = 0.0d;
        this.f15878w = false;
        this.f15879x = 0.0d;
        this.f15880y = 0.0d;
        this.G = -9.223372036854776E18d;
        this.I = 9.223372036854776E18d;
        this.K = 0;
        this.L = null;
        this.M = null;
        setLayoutDirection(I18nUtil.getInstance().isRTL(context) ? 1 : 0);
        if (Build.VERSION.SDK_INT < 26) {
            setStateListAnimator(null);
        }
    }

    private double getStepValue() {
        double d6 = this.f15879x;
        return d6 > 0.0d ? d6 : this.f15880y;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f15876i - this.f15875e) / getStepValue());
    }

    public final void a() {
        if (getThumb() == null) {
            return;
        }
        if (this.M != null) {
            getThumb().setColorFilter(this.M.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            getThumb().clearColorFilter();
        }
    }

    @Override // android.view.View
    public final void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(a.class.getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(charSequence);
            new Timer().schedule(new o(accessibilityManager, accessibilityEventObtain), 1000L);
        }
    }

    public final void b() {
        int defaultColor;
        BitmapDrawable bitmapDrawable;
        String str = this.L;
        if (str != null) {
            try {
                bitmapDrawable = (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new s(this, str, 2)).get();
            } catch (Exception e10) {
                e10.printStackTrace();
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null) {
                if (this.K > 0) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    int i7 = this.K;
                    setThumb(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, i7, i7, true)));
                } else {
                    setThumb(bitmapDrawable);
                }
                a();
                setSplitTrack(false);
                return;
            }
        }
        int i10 = this.K;
        if (i10 <= 0) {
            a();
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Integer num = this.M;
        if (num != null) {
            defaultColor = num.intValue();
        } else {
            defaultColor = getThumbTintList() != null ? getThumbTintList().getDefaultColor() : -1;
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(defaultColor);
        float f2 = this.K / 2.0f;
        canvas.drawCircle(f2, f2, f2, paint);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        paint2.setColor(436207616);
        canvas.drawCircle(f2, f2, f2 - 0.5f, paint2);
        setThumb(new BitmapDrawable(getResources(), bitmapCreateBitmap));
        a();
        setSplitTrack(false);
    }

    public final double c(int i7) {
        return i7 == getMax() ? this.f15876i : (((double) i7) * getStepValue()) + this.f15875e;
    }

    public final void d() {
        if (this.f15879x == 0.0d) {
            this.f15880y = (this.f15876i - this.f15875e) / ((double) IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        setMax(getTotalSteps());
        setKeyProgressIncrement(1);
        e();
        f();
        double d6 = this.f15877v;
        double d7 = this.f15875e;
        setProgress((int) Math.round(((d6 - d7) / (this.f15876i - d7)) * ((double) getTotalSteps())));
    }

    public final void e() {
        double dMax = Math.max(this.G, this.f15875e);
        double d6 = this.f15875e;
        int iRound = (int) Math.round(((dMax - d6) / (this.f15876i - d6)) * ((double) getTotalSteps()));
        int i7 = this.J;
        if (iRound > i7) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; lowerLimit not set");
        } else {
            this.H = Math.min(iRound, i7);
        }
    }

    public final void f() {
        double dMin = Math.min(this.I, this.f15876i);
        double d6 = this.f15875e;
        int iRound = (int) Math.round(((dMin - d6) / (this.f15876i - d6)) * ((double) getTotalSteps()));
        if (this.H > iRound) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; upperLimit not set");
        } else {
            this.J = iRound;
        }
    }

    public int getLowerLimit() {
        return this.H;
    }

    public int getUpperLimit() {
        return this.J;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f15877v);
        }
    }

    public void setAccessibilityIncrements(List<String> list) {
        this.F = list;
    }

    public void setAccessibilityUnits(String str) {
        this.E = str;
    }

    public void setLowerLimit(double d6) {
        this.G = d6;
        e();
    }

    public void setMaxValue(double d6) {
        this.f15876i = d6;
        d();
    }

    public void setMinValue(double d6) {
        this.f15875e = d6;
        d();
    }

    public void setStep(double d6) {
        this.f15879x = d6;
        d();
    }

    public void setThumbImage(String str) {
        this.L = str;
        b();
    }

    public void setThumbSize(float f2) {
        this.K = f2 > 0.0f ? Math.round(f2 * getResources().getDisplayMetrics().density) : 0;
        b();
    }

    public void setThumbTintColor(Integer num) {
        this.M = num;
        if (this.L != null || this.K > 0) {
            b();
        } else {
            a();
        }
    }

    public void setUpperLimit(double d6) {
        this.I = d6;
        f();
    }

    public void setValue(double d6) {
        this.f15877v = d6;
        double d7 = this.f15875e;
        setProgress((int) Math.round(((d6 - d7) / (this.f15876i - d7)) * ((double) getTotalSteps())));
    }

    public void setupAccessibility(int i7) {
        List list;
        if (this.E == null || (list = this.F) == null || list.size() - 1 != ((int) this.f15876i)) {
            return;
        }
        String str = (String) this.F.get(i7);
        int length = this.E.length();
        String strSubstring = this.E;
        if (str != null && Integer.parseInt(str) == 1) {
            strSubstring = strSubstring.substring(0, length - 1);
        }
        announceForAccessibility(str + " " + strSubstring);
    }
}

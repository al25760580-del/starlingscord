package com.facebook.react.views.text;

import a1.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import androidx.core.view.u0;
import androidx.customview.widget.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactFragmentIndexSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.StrokeStyleSpan;
import com.facebook.yoga.YogaMeasureMode;

/* JADX INFO: loaded from: classes3.dex */
public class ReactTextView extends AppCompatTextView implements ReactCompoundView {
    private static final int DEFAULT_GRAVITY = 8388659;
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private TextUtils.TruncateAt mEllipsizeLocation;
    private float mFontSize;
    private float mLetterSpacing;
    private int mLinkifyMaskType;
    private float mMinimumFontSize;
    private int mNumberOfLines;
    private Overflow mOverflow;
    private PreparedLayout mPreparedLayout;
    private boolean mShouldAdjustSpannableFontSize;
    private Spannable mSpanned;
    private boolean mTextIsSelectable;

    public ReactTextView(Context context) {
        super(context, null);
        this.mOverflow = Overflow.VISIBLE;
        initView();
    }

    private void applyTextAttributes() {
        if (!Float.isNaN(this.mFontSize)) {
            setTextSize(0, this.mFontSize);
        }
        if (Float.isNaN(this.mLetterSpacing)) {
            return;
        }
        super.setLetterSpacing(this.mLetterSpacing);
    }

    private void initView() {
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mTextIsSelectable = false;
        this.mShouldAdjustSpannableFontSize = false;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mFontSize = Float.NaN;
        this.mMinimumFontSize = Float.NaN;
        this.mLetterSpacing = 0.0f;
        this.mOverflow = Overflow.VISIBLE;
        this.mSpanned = null;
        this.mPreparedLayout = null;
    }

    private static WritableMap inlineViewJson(int i7, int i10, int i11, int i12, int i13, int i14) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i7 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i10);
            return writableMapCreateMap;
        }
        if (i7 != 0) {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i10);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("visibility", ViewProps.VISIBLE);
        writableMapCreateMap.putInt("index", i10);
        writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(i11));
        writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(i12));
        writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(i13));
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(i14));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$0(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (u0.f(this) != null) {
            b bVarE = u0.e(this);
            if (bVarE instanceof a) {
                return ((a) bVarE).dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVarE = u0.e(this);
        return (bVarE != null && getMovementMethod() == null && (bVarE instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) bVarE).dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    @UnstableReactNativeAPI
    public PreparedLayout getPreparedLayout() {
        return this.mPreparedLayout;
    }

    public Spannable getSpanned() {
        return this.mSpanned;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.mTextIsSelectable) {
            setTextIsSelectable(false);
        } else {
            setTextIsSelectable(false);
            setTextIsSelectable(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0009, B:6:0x0013, B:8:0x0017, B:13:0x0046, B:12:0x0041, B:16:0x0055, B:18:0x005b, B:19:0x0061, B:21:0x0069, B:24:0x0073, B:28:0x0089, B:29:0x008c, B:31:0x0090), top: B:39:0x0009 }] */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onDraw");
        try {
            Spannable spanned = getSpanned();
            if (this.mAdjustsFontSizeToFit && spanned != null && this.mShouldAdjustSpannableFontSize) {
                this.mShouldAdjustSpannableFontSize = false;
                float width = getWidth();
                YogaMeasureMode yogaMeasureMode = YogaMeasureMode.f5461e;
                TextLayoutManager.adjustSpannableFontToFit(spanned, width, yogaMeasureMode, getHeight(), yogaMeasureMode, this.mMinimumFontSize, this.mNumberOfLines, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(spanned);
            }
            Overflow overflow = this.mOverflow;
            Overflow overflow2 = Overflow.VISIBLE;
            if (overflow != overflow2) {
                canvas.save();
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            CharSequence text = getText();
            StrokeStyleSpan strokeSpan = text instanceof Spanned ? StrokeStyleSpan.getStrokeSpan((Spanned) text) : null;
            if (strokeSpan != null) {
                canvas2 = canvas;
                if (!strokeSpan.draw(getPaint(), new k(27, this, canvas2))) {
                }
                if (this.mOverflow != overflow2) {
                    canvas2.restore();
                }
                systraceSection.close();
            }
            canvas2 = canvas;
            super.onDraw(canvas);
            if (this.mOverflow != overflow2) {
                canvas2.restore();
            }
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        super.onFocusChanged(z5, i7, rect);
        b bVarE = u0.e(this);
        if (bVarE != null && (bVarE instanceof ReactTextViewAccessibilityDelegate) && getMovementMethod() == null) {
            ((ReactTextViewAccessibilityDelegate) bVarE).onFocusChanged(z5, i7, rect);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onMeasure");
        try {
            super.onMeasure(i7, i10);
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f2, float f7) {
        int i7;
        int i10;
        CharSequence text = getText();
        int id2 = getId();
        int i11 = (int) f2;
        int i12 = (int) f7;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i12);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i11 >= lineLeft && i11 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i11);
                    int i13 = 0;
                    if (this.mPreparedLayout != null) {
                        ReactFragmentIndexSpan[] reactFragmentIndexSpanArr = (ReactFragmentIndexSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactFragmentIndexSpan.class);
                        if (reactFragmentIndexSpanArr != null) {
                            int length = text.length();
                            while (i13 < reactFragmentIndexSpanArr.length) {
                                int spanStart = spanned.getSpanStart(reactFragmentIndexSpanArr[i13]);
                                int spanEnd = spanned.getSpanEnd(reactFragmentIndexSpanArr[i13]);
                                if (spanEnd >= offsetForHorizontal && (i10 = spanEnd - spanStart) <= length) {
                                    id2 = this.mPreparedLayout.getReactTags()[reactFragmentIndexSpanArr[i13].getFragmentIndex()];
                                    length = i10;
                                }
                                i13++;
                            }
                            return id2;
                        }
                    } else {
                        ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                        if (reactTagSpanArr != null) {
                            int length2 = text.length();
                            while (i13 < reactTagSpanArr.length) {
                                int spanStart2 = spanned.getSpanStart(reactTagSpanArr[i13]);
                                int spanEnd2 = spanned.getSpanEnd(reactTagSpanArr[i13]);
                                if (spanEnd2 >= offsetForHorizontal && (i7 = spanEnd2 - spanStart2) <= length2) {
                                    id2 = reactTagSpanArr[i13].getReactTag();
                                    length2 = i7;
                                }
                                i13++;
                            }
                            return id2;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    o8.a.g(ReactConstants.TAG, "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
                }
            }
        }
        return id2;
    }

    public void recycleView() {
        initView();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        BackgroundStyleApplicator.reset(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(EMPTY_LAYOUT_PARAMS);
        super.setText((CharSequence) null);
        applyTextAttributes();
        setGravity(DEFAULT_GRAVITY);
        setNumberOfLines(this.mNumberOfLines);
        setAdjustFontSizeToFit(this.mAdjustsFontSizeToFit);
        setLinkifyMask(this.mLinkifyMaskType);
        setTextIsSelectable(this.mTextIsSelectable);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.mEllipsizeLocation);
        setEnabled(true);
        if (i7 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        updateView();
    }

    public void setAdjustFontSizeToFit(boolean z5) {
        this.mAdjustsFontSizeToFit = z5;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i7));
    }

    public void setBorderColor(int i7, Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i7], num);
    }

    public void setBorderRadius(float f2) {
        setBorderRadius(f2, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setBorderWidth(int i7, float f2) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i7], Float.valueOf(PixelUtil.toDIPFromPixel(f2)));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i7) {
        super.setBreakStrategy(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setFontSize(float f2) {
        this.mFontSize = (float) (this.mAdjustsFontSizeToFit ? Math.ceil(PixelUtil.toPixelFromSP(f2)) : Math.ceil(PixelUtil.toPixelFromDIP(f2)));
        applyTextAttributes();
    }

    public void setGravityHorizontal(int i7) {
        if (i7 == 0) {
            i7 = 8388611;
        }
        setGravity(i7 | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i7) {
        if (i7 == 0) {
            i7 = 48;
        }
        setGravity(i7 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i7) {
        super.setHyphenationFrequency(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z5) {
        super.setIncludeFontPadding(z5);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        this.mLetterSpacing = PixelUtil.toPixelFromDIP(f2) / this.mFontSize;
        applyTextAttributes();
    }

    public void setLinkifyMask(int i7) {
        this.mLinkifyMaskType = i7;
    }

    public void setMinimumFontSize(float f2) {
        this.mMinimumFontSize = f2;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setNumberOfLines(int i7) {
        if (i7 == 0) {
            i7 = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i7;
        setMaxLines(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    public void setPreparedLayout(PreparedLayout preparedLayout) {
        this.mPreparedLayout = preparedLayout;
    }

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.setText(ReactTextUpdate)");
        try {
            if (getLayoutParams() == null) {
                setLayoutParams(EMPTY_LAYOUT_PARAMS);
            }
            Spanned text = reactTextUpdate.getText();
            if (this.mLinkifyMaskType > 0) {
                if (!(text instanceof Spannable)) {
                    text = new SpannableString(text);
                }
                Linkify.addLinks((Spannable) text, this.mLinkifyMaskType);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            int textAlign = reactTextUpdate.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != reactTextUpdate.getJustificationMode()) {
                setJustificationMode(reactTextUpdate.getJustificationMode());
            }
            requestLayout();
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z5) {
        this.mTextIsSelectable = z5;
        super.setTextIsSelectable(z5);
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
    }

    public void setBorderRadius(float f2, int i7) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i7], Float.isNaN(f2) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f2), LengthPercentageType.POINT));
    }
}

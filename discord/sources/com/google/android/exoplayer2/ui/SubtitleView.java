package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import ge.c;
import ge.d;
import ge.p;
import ge.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.e0;
import mf.f;
import vd.b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {
    public p E;
    public View F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f5821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f5822e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5823i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f5824v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5827y;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5821d = Collections.EMPTY_LIST;
        this.f5822e = d.f9972g;
        this.f5823i = 0.0533f;
        this.f5824v = 0.08f;
        this.f5825w = true;
        this.f5826x = true;
        c cVar = new c(context, 0);
        this.E = cVar;
        this.F = cVar;
        addView(cVar);
        this.f5827y = 1;
    }

    private List<vd.c> getCuesWithStylingPreferencesApplied() {
        if (this.f5825w && this.f5826x) {
            return this.f5821d;
        }
        ArrayList arrayList = new ArrayList(this.f5821d.size());
        for (int i7 = 0; i7 < this.f5821d.size(); i7++) {
            b bVarA = ((vd.c) this.f5821d.get(i7)).a();
            if (!this.f5825w) {
                bVarA.f21629n = false;
                CharSequence charSequence = bVarA.f21618a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        bVarA.f21618a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = bVarA.f21618a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof zd.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                f.D(bVarA);
            } else if (!this.f5826x) {
                f.D(bVarA);
            }
            arrayList.add(bVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (e0.f13788a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i7 = e0.f13788a;
        d dVar = d.f9972g;
        if (i7 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return dVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i7 >= 21) {
            return new d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & p> void setView(T t5) {
        removeView(this.F);
        View view = this.F;
        if (view instanceof w) {
            ((w) view).f10026e.destroy();
        }
        this.F = t5;
        this.E = t5;
        addView(t5);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.E.a(getCuesWithStylingPreferencesApplied(), this.f5822e, this.f5823i, this.f5824v);
    }

    public void setApplyEmbeddedFontSizes(boolean z5) {
        this.f5826x = z5;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z5) {
        this.f5825w = z5;
        c();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f5824v = f2;
        c();
    }

    public void setCues(List<vd.c> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f5821d = list;
        c();
    }

    public void setFractionalTextSize(float f2) {
        this.f5823i = f2;
        c();
    }

    public void setStyle(d dVar) {
        this.f5822e = dVar;
        c();
    }

    public void setViewType(int i7) {
        if (this.f5827y == i7) {
            return;
        }
        if (i7 == 1) {
            setView(new c(getContext(), 0));
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new w(getContext()));
        }
        this.f5827y = i7;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Enum f1136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1140g;

    public /* synthetic */ v(int i7, TextView textView) {
        this.f1134a = i7;
        this.f1135b = null;
        this.f1136c = null;
        this.f1137d = false;
        this.f1138e = false;
        this.f1140g = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f1140g;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1137d || this.f1138e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1137d) {
                    drawableMutate.setTintList((ColorStateList) this.f1135b);
                }
                if (this.f1138e) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1136c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        u uVar = (u) this.f1140g;
        Drawable checkMarkDrawable = uVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1137d || this.f1138e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1137d) {
                    drawableMutate.setTintList((ColorStateList) this.f1135b);
                }
                if (this.f1138e) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1136c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(uVar.getDrawableState());
                }
                uVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1140g;
        Context context = compoundButton.getContext();
        int[] iArr = h.a.f10263m;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        androidx.core.view.u0.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) mVarE.f7994i, i7, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(mf.f.u(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(mf.f.u(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(mf.f.u(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(mVarE.w(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(n1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            mVarE.H();
        }
    }

    public String toString() {
        switch (this.f1134a) {
            case 2:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f1137d + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f1138e + ", prettyPrintIndent='" + ((String) this.f1140g) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f1135b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f1139f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((pr.a) this.f1136c) + ')';
            default:
                return super.toString();
        }
    }

    public v(boolean z5, boolean z6, String prettyPrintIndent, String classDiscriminator, boolean z7, pr.a classDiscriminatorMode) {
        this.f1134a = 2;
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f1137d = z5;
        this.f1138e = z6;
        this.f1140g = prettyPrintIndent;
        this.f1135b = classDiscriminator;
        this.f1139f = z7;
        this.f1136c = classDiscriminatorMode;
    }
}

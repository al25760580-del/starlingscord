package k2;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f14263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f14264e;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f14264e = new ArrayList();
        yk.a.d(cls, "watcherClass cannot be null");
        this.f14263d = cls;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14264e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).f14262e.incrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14264e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
            i7++;
        }
    }

    public final s c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14264e;
            if (i7 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i7);
            if (sVar.f14261d == obj) {
                return sVar;
            }
            i7++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f14263d == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14264e;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i7)).f14262e.decrementAndGet();
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        if (this.f14263d != cls) {
            return super.getSpans(i7, i10, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i7, i10, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            objArr[i11] = sVarArr[i11].f14261d;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        if (cls == null || this.f14263d == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVarC;
        if (d(obj)) {
            sVarC = c(obj);
            if (sVarC != null) {
                obj = sVarC;
            }
        } else {
            sVarC = null;
        }
        super.removeSpan(obj);
        if (sVarC != null) {
            this.f14264e.remove(sVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence) {
        replace(i7, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f14264e.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i7, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return new t(this.f14263d, this, i7, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i7, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence) {
        a();
        super.replace(i7, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    public t(Class cls, t tVar, int i7, int i10) {
        super(tVar, i7, i10);
        this.f14264e = new ArrayList();
        yk.a.d(cls, "watcherClass cannot be null");
        this.f14263d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i7, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}

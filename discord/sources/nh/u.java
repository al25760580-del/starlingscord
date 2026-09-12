package nh;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.discord.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f16910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.discord.chat.presentation.list.delegate.b f16911g;

    public u(n nVar, int i7) {
        super(nVar);
        this.f16909e = R.drawable.design_password_eye;
        this.f16911g = new com.discord.chat.presentation.list.delegate.b(13, this);
        if (i7 != 0) {
            this.f16909e = i7;
        }
    }

    @Override // nh.o
    public final void b() {
        p();
    }

    @Override // nh.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // nh.o
    public final int d() {
        return this.f16909e;
    }

    @Override // nh.o
    public final View.OnClickListener f() {
        return this.f16911g;
    }

    @Override // nh.o
    public final boolean j() {
        return true;
    }

    @Override // nh.o
    public final boolean k() {
        EditText editText = this.f16910f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // nh.o
    public final void l(EditText editText) {
        this.f16910f = editText;
        p();
    }

    @Override // nh.o
    public final void q() {
        EditText editText = this.f16910f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f16910f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // nh.o
    public final void r() {
        EditText editText = this.f16910f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

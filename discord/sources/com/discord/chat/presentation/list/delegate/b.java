package com.discord.chat.presentation.list.delegate;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.discord.chat.databinding.SeparatorSummaryViewBinding;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.chat.presentation.separator.SummarySeparatorView;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorOverlayView;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.google.android.material.datepicker.o;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import com.swmansion.rnscreens.e0;
import com.swmansion.rnscreens.v0;
import kotlin.jvm.internal.Intrinsics;
import nh.k;
import nh.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4092e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f4091d = i7;
        this.f4092e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4091d) {
            case 0:
                ((b7.a) this.f4092e).invoke(view);
                return;
            case 1:
                AttachmentUploadOverlayView.setUploadCancel$lambda$20((UploadItemProps) this.f4092e, view);
                return;
            case 2:
                ((MediaView) this.f4092e).prepareAndPlay();
                return;
            case 3:
                PerfMonitorOverlayView.createToolbarDialog$lambda$8((PerfMonitorOverlayView) this.f4092e, view);
                return;
            case 4:
                ReactViewManager.setFocusable$lambda$3((ReactViewGroup) this.f4092e, view);
                return;
            case 5:
                ((o) this.f4092e).u();
                throw null;
            case 6:
                com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this.f4092e;
                View.OnClickListener onClickListener = cVar.I0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                cVar.J0.d();
                return;
            case 7:
                ScreenStackHeaderConfig.a((ScreenStackHeaderConfig) this.f4092e);
                return;
            case 8:
                v0.e((v0) this.f4092e);
                return;
            case 9:
                SummarySeparatorView.lambda$2$lambda$1((SeparatorSummaryViewBinding) this.f4092e, view);
                return;
            case 10:
                Screen screen = (Screen) this.f4092e;
                if (screen.getSheetClosesOnTouchOutside()) {
                    Fragment fragment = screen.getFragment();
                    Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                    ((e0) fragment).y();
                    return;
                }
                return;
            case 11:
                nh.c cVar2 = (nh.c) this.f4092e;
                EditText editText = cVar2.f16838i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                cVar2.p();
                return;
            case 12:
                ((k) this.f4092e).t();
                return;
            default:
                u uVar = (u) this.f4092e;
                EditText editText2 = uVar.f16910f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = uVar.f16910f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    uVar.f16910f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    uVar.f16910f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    uVar.f16910f.setSelection(selectionEnd);
                }
                uVar.p();
                return;
        }
    }
}

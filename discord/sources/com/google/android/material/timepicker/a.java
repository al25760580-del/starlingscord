package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import bh.o;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f6490d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f6490d = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f6490d;
        if (zIsEmpty) {
            chipTextInputComboView.f6474d.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f6474d;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}

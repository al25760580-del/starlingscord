package com.henninghall.date_picker;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.dialog.AlertFragment;
import com.mkuczera.haptic.d;
import fk.a;
import fk.f;
import fk.g;
import fk.h;
import fk.i;
import fk.n;
import hp.e;
import java.util.HashSet;
import jk.c;
import tr.b;

/* JADX INFO: loaded from: classes3.dex */
public class DatePickerModule extends NativeRNDatePickerSpec {
    private final h module;

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        b.a(reactApplicationContext);
        h hVar = new h();
        b.a(reactApplicationContext);
        this.module = hVar;
    }

    @Override // com.henninghall.date_picker.NativeRNDatePickerSpec
    public void addListener(String str) {
    }

    @Override // com.henninghall.date_picker.NativeRNDatePickerSpec
    public void closePicker() {
        this.module.f9277a.dismiss();
    }

    @Override // com.henninghall.date_picker.NativeRNDatePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeRNDatePickerSpec.NAME;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d2  */
    @Override // com.henninghall.date_picker.NativeRNDatePickerSpec
    public void openPicker(ReadableMap readableMap, Callback callback, Callback callback2) {
        int i7;
        h hVar = this.module;
        hVar.getClass();
        n nVar = new n(new LinearLayout.LayoutParams(-1, (int) (180 * d.f7010b.getResources().getDisplayMetrics().density)));
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (!strNextKey.equals("style")) {
                try {
                    c cVar = (c) ((i) nVar.f9285e.f8029m).get(strNextKey);
                    cVar.f13919a = cVar.a(dynamic);
                    nVar.f9286i.add(strNextKey);
                } catch (Exception unused) {
                }
            }
        }
        nVar.b();
        ((HashSet) ((e) nVar.f9284d.f7995v).f10991w).add(new f(hVar));
        a aVar = new a(nVar, 0);
        a aVar2 = new a(nVar, 1);
        String string = readableMap.getString("confirmText");
        String string2 = readableMap.getString("cancelText");
        String string3 = readableMap.getString("buttonColor");
        LinearLayout linearLayout = new LinearLayout(d.f7010b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(nVar);
        linearLayout.setPadding(0, (int) (20 * d.f7010b.getResources().getDisplayMetrics().density), 0, 0);
        Activity currentActivity = d.f7010b.getCurrentActivity();
        String string4 = readableMap.getString("theme");
        if (string4 == null) {
            i7 = 0;
        } else if (string4.equals("dark")) {
            i7 = 4;
        } else if (string4.equals("light")) {
            i7 = 5;
        } else {
            i7 = 0;
        }
        g gVar = new g(currentActivity, i7);
        String string5 = readableMap.getString("textColor");
        String string6 = readableMap.getString(AlertFragment.ARG_TITLE);
        if (string5 == null) {
            gVar.setTitle(string6);
        } else {
            TextView textView = new TextView(d.f7010b.getCurrentActivity());
            textView.setText(string6);
            TypedValue typedValue = new TypedValue();
            d.f7010b.getCurrentActivity().getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
            int iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, d.f7010b.getResources().getDisplayMetrics());
            textView.setPadding(iComplexToDimensionPixelSize, iComplexToDimensionPixelSize, iComplexToDimensionPixelSize, 0);
            textView.setTextSize(20.0f);
            textView.setTextColor(Color.parseColor(string5));
            gVar.setCustomTitle(textView);
        }
        AlertDialog alertDialogCreate = gVar.setCancelable(true).setView(linearLayout).setPositiveButton(string, new fk.d(aVar, nVar)).setNegativeButton(string2, new fk.c(aVar2)).setOnCancelListener(new fk.b(aVar2)).create();
        alertDialogCreate.setOnShowListener(new fk.e(string3, alertDialogCreate));
        hVar.f9277a = alertDialogCreate;
        alertDialogCreate.show();
    }

    @Override // com.henninghall.date_picker.NativeRNDatePickerSpec
    public void removeListeners(double d6) {
    }
}

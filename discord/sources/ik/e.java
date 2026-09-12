package ik;

import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    int getValue();

    View getView();

    void setDisplayedValues(String[] strArr);

    void setDividerColor(String str);

    void setMaxValue(int i7);

    void setMinValue(int i7);

    void setOnValueChangeListenerInScrolling(d dVar);

    void setOnValueChangedListener(c cVar);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i7);

    void setVisibility(int i7);

    void setWrapSelectorWheel(boolean z5);
}

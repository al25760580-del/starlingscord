package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGGroupManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setClipPath(T t5, String str);

    void setClipRule(T t5, int i7);

    void setColor(T t5, Integer num);

    void setDisplay(T t5, String str);

    void setFill(T t5, Dynamic dynamic);

    void setFillOpacity(T t5, float f2);

    void setFillRule(T t5, int i7);

    void setFilter(T t5, String str);

    void setFont(T t5, Dynamic dynamic);

    void setFontSize(T t5, Dynamic dynamic);

    void setFontWeight(T t5, Dynamic dynamic);

    void setMarkerEnd(T t5, String str);

    void setMarkerMid(T t5, String str);

    void setMarkerStart(T t5, String str);

    void setMask(T t5, String str);

    void setMatrix(T t5, ReadableArray readableArray);

    void setName(T t5, String str);

    void setOpacity(T t5, float f2);

    void setPointerEvents(T t5, String str);

    void setPropList(T t5, ReadableArray readableArray);

    void setResponsible(T t5, boolean z5);

    void setStroke(T t5, Dynamic dynamic);

    void setStrokeDasharray(T t5, Dynamic dynamic);

    void setStrokeDashoffset(T t5, float f2);

    void setStrokeLinecap(T t5, int i7);

    void setStrokeLinejoin(T t5, int i7);

    void setStrokeMiterlimit(T t5, float f2);

    void setStrokeOpacity(T t5, float f2);

    void setStrokeWidth(T t5, Dynamic dynamic);

    void setVectorEffect(T t5, int i7);
}

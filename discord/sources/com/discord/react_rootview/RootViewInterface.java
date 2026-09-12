package com.discord.react_rootview;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/discord/react_rootview/RootViewInterface;", "", "exclusionRects", "", "Landroid/graphics/Rect;", "getExclusionRects", "()Ljava/util/List;", "setExclusionRects", "(Ljava/util/List;)V", "onInterceptTouchEventListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getOnInterceptTouchEventListeners", "()Ljava/util/WeakHashMap;", "setAppProperties", "appProperties", "Landroid/os/Bundle;", "react_rootview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RootViewInterface {
    @NotNull
    List<Rect> getExclusionRects();

    @NotNull
    WeakHashMap<View, Function1<MotionEvent, Unit>> getOnInterceptTouchEventListeners();

    void setAppProperties(Bundle appProperties);

    void setExclusionRects(@NotNull List<Rect> list);
}

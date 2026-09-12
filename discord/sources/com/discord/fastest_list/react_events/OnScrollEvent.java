package com.discord.fastest_list.react_events;

import com.discord.fastest_list.android.scroll.FastestListScrollOffset;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/fastest_list/react_events/OnScrollEvent;", "Lcom/discord/reactevents/ReactEvent;", "x", "", "y", "width", "height", "contentWidth", "contentHeight", "<init>", "(FFFFFF)V", "data", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;", "(Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;)V", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class OnScrollEvent implements ReactEvent {
    private final float contentHeight;
    private final float contentWidth;
    private final float height;
    private final float width;
    private final float x;
    private final float y;

    private OnScrollEvent(float f2, float f7, float f10, float f11, float f12, float f13) {
        this.x = f2;
        this.y = f7;
        this.width = f10;
        this.height = f11;
        this.contentWidth = f12;
        this.contentHeight = f13;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("contentInset", NativeMapExtensionsKt.nativeMapOf(new Pair(ViewProps.LEFT, 0), new Pair(ViewProps.TOP, 0), new Pair(ViewProps.BOTTOM, 0), new Pair(ViewProps.RIGHT, 0))), new Pair("contentOffset", NativeMapExtensionsKt.nativeMapOf(new Pair("x", Float.valueOf(this.x)), new Pair("y", Float.valueOf(this.y)))), new Pair("contentSize", NativeMapExtensionsKt.nativeMapOf(new Pair("width", Float.valueOf(this.contentWidth)), new Pair("height", Float.valueOf(this.contentHeight)))), new Pair("layoutMeasurement", NativeMapExtensionsKt.nativeMapOf(new Pair("width", Float.valueOf(this.width)), new Pair("height", Float.valueOf(this.height)))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnScrollEvent(@NotNull FastestListScrollOffset.Data data) {
        this(SizeUtilsKt.getPxToDp(data.getX()), SizeUtilsKt.getPxToDp(data.getY()), SizeUtilsKt.getPxToDp(data.getWidth()), SizeUtilsKt.getPxToDp(data.getHeight()), SizeUtilsKt.getPxToDp(data.getContentWidth()), SizeUtilsKt.getPxToDp(data.getContentHeight()));
        Intrinsics.checkNotNullParameter(data, "data");
    }
}

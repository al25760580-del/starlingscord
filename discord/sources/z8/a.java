package z8;

import android.graphics.Color;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i8.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f23599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f23600c;

    static {
        Intrinsics.checkNotNullParameter("Performance", StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullParameter("Markers for Performance", "description");
        Color.rgb(156, 39, 176);
        Intrinsics.checkNotNullParameter("Navigation", StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullParameter("Tag for navigation", "description");
        f23598a = new c("RN Core", "Tag for React Native Core");
        Intrinsics.checkNotNullParameter("Bridge Calls", StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullParameter("JS to Java calls (warning: this is spammy)", "description");
        Color.rgb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        f23599b = new c("Native Module", "Native Module init");
        f23600c = new c("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)");
    }
}

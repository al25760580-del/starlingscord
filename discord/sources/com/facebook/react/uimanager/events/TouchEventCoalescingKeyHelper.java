package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "", "<init>", "()V", "downTimeToCoalescingKey", "Landroid/util/SparseIntArray;", "addCoalescingKey", "", "downTime", "", "incrementCoalescingKey", "getCoalescingKey", "", "removeCoalescingKey", "hasCoalescingKey", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchEventCoalescingKeyHelper {

    @NotNull
    private final SparseIntArray downTimeToCoalescingKey = new SparseIntArray();

    public final void addCoalescingKey(long downTime) {
        this.downTimeToCoalescingKey.put((int) downTime, 0);
    }

    public final short getCoalescingKey(long downTime) {
        int i7 = this.downTimeToCoalescingKey.get((int) downTime, -1);
        if (i7 != -1) {
            return (short) (i7 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final boolean hasCoalescingKey(long downTime) {
        return this.downTimeToCoalescingKey.get((int) downTime, -1) != -1;
    }

    public final void incrementCoalescingKey(long downTime) {
        int i7 = (int) downTime;
        int i10 = this.downTimeToCoalescingKey.get(i7, -1);
        if (i10 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.downTimeToCoalescingKey.put(i7, i10 + 1);
    }

    public final void removeCoalescingKey(long downTime) {
        this.downTimeToCoalescingKey.delete((int) downTime);
    }
}

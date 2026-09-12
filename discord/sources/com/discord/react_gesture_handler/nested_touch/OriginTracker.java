package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "", "touchSlop", "", "<init>", "(I)V", "getTouchSlop", "()I", "origin", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;", "originSupplemental", "hasOriginMoved", "", "isSupplementalEvent", "event", "Landroid/view/MotionEvent;", "cleanUp", "", "x", "", "y", "Origin", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OriginTracker {
    private Origin origin;
    private Origin originSupplemental;
    private final int touchSlop;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;", "", "xOrigin", "", "yOrigin", "<init>", "(FF)V", "getXOrigin", "()F", "getYOrigin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Origin {
        private final float xOrigin;
        private final float yOrigin;

        public Origin(float f2, float f7) {
            this.xOrigin = f2;
            this.yOrigin = f7;
        }

        public static /* synthetic */ Origin copy$default(Origin origin, float f2, float f7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                f2 = origin.xOrigin;
            }
            if ((i7 & 2) != 0) {
                f7 = origin.yOrigin;
            }
            return origin.copy(f2, f7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getXOrigin() {
            return this.xOrigin;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getYOrigin() {
            return this.yOrigin;
        }

        @NotNull
        public final Origin copy(float xOrigin, float yOrigin) {
            return new Origin(xOrigin, yOrigin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Origin)) {
                return false;
            }
            Origin origin = (Origin) other;
            return Float.compare(this.xOrigin, origin.xOrigin) == 0 && Float.compare(this.yOrigin, origin.yOrigin) == 0;
        }

        public final float getXOrigin() {
            return this.xOrigin;
        }

        public final float getYOrigin() {
            return this.yOrigin;
        }

        public int hashCode() {
            return Float.hashCode(this.yOrigin) + (Float.hashCode(this.xOrigin) * 31);
        }

        @NotNull
        public String toString() {
            return "Origin(xOrigin=" + this.xOrigin + ", yOrigin=" + this.yOrigin + ")";
        }
    }

    public OriginTracker(int i7) {
        this.touchSlop = i7;
    }

    public final void cleanUp() {
        this.origin = null;
        this.originSupplemental = null;
    }

    public final int getTouchSlop() {
        return this.touchSlop;
    }

    public final boolean hasOriginMoved(boolean isSupplementalEvent, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isSupplementalEvent) {
            if (this.originSupplemental == null) {
                this.originSupplemental = new Origin(event.getX(), event.getY());
            }
            Origin origin = this.originSupplemental;
            return origin != null && hasOriginMoved(origin, event.getX(), event.getY());
        }
        if (this.origin == null) {
            this.origin = new Origin(event.getX(), event.getY());
        }
        Origin origin2 = this.origin;
        return origin2 != null && hasOriginMoved(origin2, event.getX(), event.getY());
    }

    private final boolean hasOriginMoved(Origin origin, float f2, float f7) {
        return Math.abs(f2 - origin.getXOrigin()) > ((float) this.touchSlop) || Math.abs(f7 - origin.getYOrigin()) > ((float) this.touchSlop);
    }
}

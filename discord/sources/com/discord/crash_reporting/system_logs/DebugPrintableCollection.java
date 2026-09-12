package com.discord.crash_reporting.system_logs;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection;", "", "<init>", "()V", "idCounter", "", "Lcom/discord/crash_reporting/system_logs/DebugPrintableId;", "collection", "", "Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef;", BaseJavaModule.METHOD_TYPE_SYNC, "add", "ref", "Lcom/discord/crash_reporting/system_logs/DebugPrintable;", "tag", "", "debugPrint", "", "context", "Landroid/content/Context;", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "removeDeadReferencesLocked", "addSystemEntry", "dp", "Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;", "DebugPrintableRef", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugPrintableCollection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_DEBUG_PRINTABLE_STRING_LENGTH = 524288;
    private long idCounter = 1;

    @NotNull
    private final Map<Long, DebugPrintableRef> collection = new LinkedHashMap();

    @NotNull
    private final Object sync = new Object();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$Companion;", "", "<init>", "()V", "MAX_DEBUG_PRINTABLE_STRING_LENGTH", "", "libdiscordVersion", "", "context", "Landroid/content/Context;", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String libdiscordVersion(@NotNull Context context) {
            String string;
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)).metaData;
            return (bundle == null || (string = bundle.getString("libdiscord_version")) == null) ? "Unknown libdiscord version" : string;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef;", "", "tag", "", "reference", "Ljava/lang/ref/WeakReference;", "Lcom/discord/crash_reporting/system_logs/DebugPrintable;", "<init>", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "getTag", "()Ljava/lang/String;", "getReference", "()Ljava/lang/ref/WeakReference;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DebugPrintableRef {

        @NotNull
        private final WeakReference<DebugPrintable> reference;
        private final String tag;

        public DebugPrintableRef(String str, @NotNull WeakReference<DebugPrintable> reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.tag = str;
            this.reference = reference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DebugPrintableRef copy$default(DebugPrintableRef debugPrintableRef, String str, WeakReference weakReference, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = debugPrintableRef.tag;
            }
            if ((i7 & 2) != 0) {
                weakReference = debugPrintableRef.reference;
            }
            return debugPrintableRef.copy(str, weakReference);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        public final WeakReference<DebugPrintable> component2() {
            return this.reference;
        }

        @NotNull
        public final DebugPrintableRef copy(String tag, @NotNull WeakReference<DebugPrintable> reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new DebugPrintableRef(tag, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DebugPrintableRef)) {
                return false;
            }
            DebugPrintableRef debugPrintableRef = (DebugPrintableRef) other;
            return Intrinsics.areEqual(this.tag, debugPrintableRef.tag) && Intrinsics.areEqual(this.reference, debugPrintableRef.reference);
        }

        @NotNull
        public final WeakReference<DebugPrintable> getReference() {
            return this.reference;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String str = this.tag;
            return this.reference.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "DebugPrintableRef(tag=" + this.tag + ", reference=" + this.reference + ")";
        }
    }

    private final long add(DebugPrintable ref, String tag) {
        long j;
        synchronized (this.sync) {
            try {
                j = this.idCounter;
                this.idCounter = j + 1;
                long j5 = 0;
                while (this.collection.containsKey(Long.valueOf(j))) {
                    j = this.idCounter;
                    this.idCounter = j + 1;
                    j5++;
                    if (j5 < 0) {
                        break;
                    }
                }
                this.collection.put(Long.valueOf(j), new DebugPrintableRef(tag, new WeakReference(ref)));
                removeDeadReferencesLocked();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j;
    }

    public static /* synthetic */ long add$default(DebugPrintableCollection debugPrintableCollection, DebugPrintable debugPrintable, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        return debugPrintableCollection.add(debugPrintable, str);
    }

    private final void addSystemEntry(Context context, DebugPrintBuilder dp2) {
        dp2.appendLine("System:");
        dp2.appendKeyValue("libdiscordVersion", INSTANCE.libdiscordVersion(context));
        dp2.appendKeyValue("SDK_INT", Integer.valueOf(Build.VERSION.SDK_INT));
        HistoricalProcessExitReason.Reason reasonLastReason = HistoricalProcessExitReason.INSTANCE.lastReason(context);
        if (reasonLastReason != null) {
            dp2.appendKeyValue("exit_reason", reasonLastReason.getReason());
            String description = reasonLastReason.getDescription();
            if (description != null) {
                dp2.appendKeyValue("exit_description", description);
            }
        }
        DebugPrintBuilder.appendLine$default(dp2, null, 1, null);
    }

    private final void removeDeadReferencesLocked() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, DebugPrintableRef> entry : this.collection.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            if (entry.getValue().getReference().get() == null) {
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.collection.remove(Long.valueOf(((Number) it.next()).longValue()));
        }
    }

    public final void debugPrint(@NotNull Context context, @NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        DebugPrintBuilder debugPrintBuilder = new DebugPrintBuilder(sb2);
        synchronized (this.sync) {
            try {
                addSystemEntry(context, debugPrintBuilder);
                for (Map.Entry<Long, DebugPrintableRef> entry : this.collection.entrySet()) {
                    long jLongValue = entry.getKey().longValue();
                    DebugPrintableRef value = entry.getValue();
                    DebugPrintable debugPrintable = value.getReference().get();
                    if (debugPrintable != null) {
                        sb2.append(jLongValue);
                        if (value.getTag() != null) {
                            sb2.append(' ');
                            sb2.append(value.getTag());
                        }
                        sb2.append(":");
                        sb2.append('\n');
                        try {
                            debugPrintable.debugPrint(debugPrintBuilder);
                        } catch (Exception e10) {
                            sb2.append("Exception: " + e10);
                        }
                        sb2.append('\n');
                        if (sb2.length() > MAX_DEBUG_PRINTABLE_STRING_LENGTH) {
                            sb2.delete(MAX_DEBUG_PRINTABLE_STRING_LENGTH, sb2.length() - 1);
                            sb2.append(" {truncated}");
                            break;
                        }
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

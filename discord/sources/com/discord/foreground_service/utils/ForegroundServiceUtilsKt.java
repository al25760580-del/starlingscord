package com.discord.foreground_service.utils;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.discord.device.utils.IsTelecomBarAvailableKt;
import com.discord.foreground_service.ForegroundService;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.lifecycle.AppLifecycle;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.n;
import s0.g;
import sn.i;
import y0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001aF\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002\u001a$\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0002H\u0003\u001a\f\u0010 \u001a\u00020\u000e*\u00020\u001aH\u0000¨\u0006!"}, d2 = {"startForegroundServiceCompat", "Landroid/content/ComponentName;", "Landroid/content/Context;", "serviceIntent", "Landroid/content/Intent;", "hasMicrophonePermission", "", "context", "hasForegroundServiceMicPermission", "hasCameraPermission", "hasForegroundServiceCameraPermission", "hasForegroundServiceMediaProjectionPermission", "promotionBreadcrumbData", "", "", "", "action", "detail", "operationKind", "configurationType", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "serviceType", "startForegroundCompat", "", "Landroid/app/Service;", "notificationId", "", "notification", "Landroid/app/Notification;", "buildServiceTypeChain", "", "requestedType", "toForegroundServiceTypeString", "foreground_service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundServiceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceUtils.kt\ncom/discord/foreground_service/utils/ForegroundServiceUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
public final class ForegroundServiceUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceNotificationConfiguration.Type.values().length];
            try {
                iArr[ServiceNotificationConfiguration.Type.FILE_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SuppressLint({"InlinedApi"})
    private static final List<Integer> buildServiceTypeChain(ServiceNotificationConfiguration.Type type, Context context) {
        Integer numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        ArrayList arrayList = new ArrayList();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 34) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new n();
                    }
                    arrayList.add(32);
                } else if (i7 >= 30) {
                    arrayList.add(numValueOf);
                }
            }
        } else {
            boolean z5 = false;
            boolean z6 = IsTelecomBarAvailableKt.isTelecomBarAvailable() || AppLifecycle.INSTANCE.isForegrounded();
            int iOrdinal = type.ordinal();
            ServiceNotificationConfiguration.Type type2 = ServiceNotificationConfiguration.Type.VOICE_CALL;
            boolean z7 = iOrdinal >= type2.ordinal() && hasMicrophonePermission(context) && hasForegroundServiceMicPermission(context) && z6;
            boolean z10 = type.ordinal() >= type2.ordinal() && hasCameraPermission(context) && hasForegroundServiceCameraPermission(context) && z6;
            if (type.ordinal() >= ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal() && hasForegroundServiceMediaProjectionPermission(context)) {
                z5 = true;
            }
            if (z5 && z7 && z10) {
                arrayList.add(224);
            }
            if (z10 && z7) {
                arrayList.add(Integer.valueOf(JfifUtil.MARKER_SOFn));
            }
            if (z5 && z7) {
                arrayList.add(160);
            }
            if (z5 && z10) {
                arrayList.add(96);
            }
            if (z7) {
                arrayList.add(numValueOf);
            }
            if (z10) {
                arrayList.add(64);
            }
            if (z5) {
                arrayList.add(32);
            }
        }
        arrayList.add(1);
        return arrayList;
    }

    public static final boolean hasCameraPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b.a(context, "android.permission.CAMERA") == 0;
    }

    private static final boolean hasForegroundServiceCameraPermission(Context context) {
        return Build.VERSION.SDK_INT < 34 || b.a(context, "android.permission.FOREGROUND_SERVICE_CAMERA") == 0;
    }

    private static final boolean hasForegroundServiceMediaProjectionPermission(Context context) {
        return Build.VERSION.SDK_INT < 34 || b.a(context, "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") == 0;
    }

    private static final boolean hasForegroundServiceMicPermission(Context context) {
        return Build.VERSION.SDK_INT < 34 || b.a(context, "android.permission.FOREGROUND_SERVICE_MICROPHONE") == 0;
    }

    public static final boolean hasMicrophonePermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b.a(context, "android.permission.RECORD_AUDIO") == 0;
    }

    private static final Map<String, Object> promotionBreadcrumbData(String str, String str2, String str3, ServiceNotificationConfiguration.Type type, String str4) {
        i builder = new i();
        String name = ForegroundService.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        builder.put("service_name", name);
        builder.put("action", str);
        builder.put("detail", str2);
        builder.put("fgs_operation", str3);
        if (type != null) {
            builder.put("fgs_configuration_type", type.name());
        }
        if (str4 != null) {
            builder.put("service_type", str4);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static /* synthetic */ Map promotionBreadcrumbData$default(String str, String str2, String str3, ServiceNotificationConfiguration.Type type, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = "create_or_update";
        }
        if ((i7 & 8) != 0) {
            type = null;
        }
        if ((i7 & 16) != 0) {
            str4 = null;
        }
        return promotionBreadcrumbData(str, str2, str3, type, str4);
    }

    public static final void startForegroundCompat(@NotNull Service service, @NotNull Context context, int i7, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(i7, notification);
            Log.i$foreground_service_release$default(Log.INSTANCE, "ForegroundService promoted to foreground", promotionBreadcrumbData$default("promote_to_foreground", "start_foreground", null, (ServiceNotificationConfiguration.Type) CollectionsKt.M(notification.extras.getInt(ForegroundService.EXTRA_PERMISSION_TYPE, -1), ServiceNotificationConfiguration.Type.getEntries()), "legacy_sdk_lt_29", 4, null), null, 4, null);
            return;
        }
        int i10 = notification.extras.getInt(ForegroundService.EXTRA_PERMISSION_TYPE, -1);
        ServiceNotificationConfiguration.Type type = (ServiceNotificationConfiguration.Type) CollectionsKt.M(i10, ServiceNotificationConfiguration.Type.getEntries());
        if (type == null) {
            throw new IllegalStateException(("Unknown service type: " + i10).toString());
        }
        Iterator<Integer> it = buildServiceTypeChain(type, context).iterator();
        SecurityException e10 = null;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            try {
                Log log = Log.INSTANCE;
                Log.i$foreground_service_release$default(log, "Attempting to promote service with type: " + toForegroundServiceTypeString(iIntValue), promotionBreadcrumbData$default("promote_attempt", "trying_service_type", null, null, StringsKt.b0(toForegroundServiceTypeString(iIntValue)).toString(), 12, null), null, 4, null);
                service.startForeground(i7, notification, iIntValue);
                Log.i$foreground_service_release$default(log, "ForegroundService promoted to foreground", promotionBreadcrumbData$default("promote_to_foreground", "start_foreground", null, type, StringsKt.b0(toForegroundServiceTypeString(iIntValue)).toString(), 4, null), null, 4, null);
                return;
            } catch (SecurityException e11) {
                e10 = e11;
                Log.INSTANCE.w$foreground_service_release(g.e("Service promotion of type ", toForegroundServiceTypeString(iIntValue), " failed, trying next in chain"), promotionBreadcrumbData$default("promote_failed", "security_exception", null, null, StringsKt.b0(toForegroundServiceTypeString(iIntValue)).toString(), 12, null), e10);
            }
        }
        Log.INSTANCE.e$foreground_service_release("All service type promotion attempts failed", promotionBreadcrumbData$default("promote_all_failed", "no_service_type_worked", null, null, null, 28, null), e10);
        if (e10 == null) {
            throw new SecurityException("Unable to start foreground service with any available type");
        }
    }

    public static final ComponentName startForegroundServiceCompat(@NotNull Context context, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        return Build.VERSION.SDK_INT >= 26 ? context.startForegroundService(serviceIntent) : context.startService(serviceIntent);
    }

    @NotNull
    public static final String toForegroundServiceTypeString(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if ((i7 & 1) != 0) {
            sb2.append("DataSync ");
        }
        if ((i7 & 64) != 0) {
            sb2.append("Camera ");
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            sb2.append("Microphone ");
        }
        if ((i7 & 32) != 0) {
            sb2.append("MediaProjection ");
        }
        if (StringsKt.K(sb2)) {
            sb2.append("Unknown ");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

package io.sentry.react;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.events.PointerEventHelper;
import io.sentry.Breadcrumb;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.rrweb.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RNSentryReplayBreadcrumbConverter extends DefaultReplayBreadcrumbConverter {
    public static String getTouchPathMessage(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int iMin = Math.min(3, list.size() - 1); iMin >= 0; iMin--) {
            Object obj2 = list.get(iMin);
            if (!(obj2 instanceof Map)) {
                return null;
            }
            Map map = (Map) obj2;
            Object obj3 = map.get(StackTraceHelper.NAME_KEY);
            Object obj4 = map.get("label");
            boolean z5 = obj4 instanceof String;
            if (!(obj3 instanceof String) && !z5) {
                return null;
            }
            if (z5) {
                sb2.append(obj4);
            } else {
                sb2.append(obj3);
            }
            Object obj5 = map.get("element");
            Object obj6 = map.get("file");
            boolean z6 = obj5 instanceof String;
            boolean z7 = obj6 instanceof String;
            if (z6 && z7) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(", ");
                sb2.append(obj6);
                sb2.append(')');
            } else if (z6) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(')');
            } else if (z7) {
                sb2.append('(');
                sb2.append(obj6);
                sb2.append(')');
            }
            if (iMin > 0) {
                sb2.append(" > ");
            }
        }
        return sb2.toString();
    }

    private void setRRWebEventDefaultsFrom(@NotNull io.sentry.rrweb.a aVar, @NotNull Breadcrumb breadcrumb) {
        aVar.E = breadcrumb.F;
        ConcurrentHashMap concurrentHashMap = breadcrumb.f12009x;
        aVar.F = concurrentHashMap == null ? null : new ConcurrentHashMap(concurrentHashMap);
        aVar.f13111e = breadcrumb.b().getTime();
        aVar.f13106v = breadcrumb.b().getTime() / 1000.0d;
        aVar.f13107w = "default";
    }

    @Override // io.sentry.android.replay.DefaultReplayBreadcrumbConverter, io.sentry.i3
    public io.sentry.rrweb.b convert(@NotNull Breadcrumb breadcrumb) {
        String str = breadcrumb.f12010y;
        if (str == null || "sentry.event".equals(str) || "sentry.transaction".equals(breadcrumb.f12010y) || "http".equals(breadcrumb.f12010y)) {
            return null;
        }
        if (PointerEventHelper.POINTER_TYPE_TOUCH.equals(breadcrumb.f12010y)) {
            return convertTouchBreadcrumb(breadcrumb);
        }
        if ("navigation".equals(breadcrumb.f12010y)) {
            return convertNavigationBreadcrumb(breadcrumb);
        }
        if ("xhr".equals(breadcrumb.f12010y)) {
            return convertNetworkBreadcrumb(breadcrumb);
        }
        io.sentry.rrweb.b bVarConvert = super.convert(breadcrumb);
        if ((bVarConvert instanceof io.sentry.rrweb.a) && "navigation".equals(((io.sentry.rrweb.a) bVarConvert).f13108x)) {
            return null;
        }
        return bVarConvert;
    }

    @NotNull
    public io.sentry.rrweb.b convertNavigationBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.f13108x = breadcrumb.f12010y;
        setRRWebEventDefaultsFrom(aVar, breadcrumb);
        return aVar;
    }

    public io.sentry.rrweb.b convertNetworkBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        Double d6 = breadcrumb.f12009x.get("start_timestamp") instanceof Number ? (Double) breadcrumb.f12009x.get("start_timestamp") : null;
        Double d7 = breadcrumb.f12009x.get("end_timestamp") instanceof Number ? (Double) breadcrumb.f12009x.get("end_timestamp") : null;
        String str = breadcrumb.f12009x.get("url") instanceof String ? (String) breadcrumb.f12009x.get("url") : null;
        if (d6 == null || d7 == null || str == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (breadcrumb.f12009x.get("method") instanceof String) {
            map.put("method", breadcrumb.f12009x.get("method"));
        }
        if (breadcrumb.f12009x.get("status_code") instanceof Double) {
            Double d8 = (Double) breadcrumb.f12009x.get("status_code");
            if (d8.doubleValue() > 0.0d) {
                map.put("statusCode", Integer.valueOf(d8.intValue()));
            }
        }
        if (breadcrumb.f12009x.get("request_body_size") instanceof Double) {
            map.put("requestBodySize", breadcrumb.f12009x.get("request_body_size"));
        }
        if (breadcrumb.f12009x.get("response_body_size") instanceof Double) {
            map.put("responseBodySize", breadcrumb.f12009x.get("response_body_size"));
        }
        l lVar = new l();
        lVar.f13133v = "resource.http";
        lVar.f13135x = d6.doubleValue() / 1000.0d;
        lVar.f13136y = d7.doubleValue() / 1000.0d;
        lVar.f13134w = str;
        lVar.E = new ConcurrentHashMap(map);
        return lVar;
    }

    @NotNull
    public io.sentry.rrweb.b convertTouchBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.f13108x = "ui.tap";
        aVar.f13109y = getTouchPathMessage(breadcrumb.f12009x.get("path"));
        setRRWebEventDefaultsFrom(aVar, breadcrumb);
        return aVar;
    }
}

package em;

import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.RiveOpenURLEvent;
import com.margelo.nitro.rive.EventPropertiesOutput;
import com.margelo.nitro.rive.RiveEventType;
import com.margelo.nitro.rive.UnifiedRiveEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements RiveFileController.RiveEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8466b;

    public l(m mVar, Function1 function1) {
        this.f8465a = mVar;
        this.f8466b = function1;
    }

    @Override // app.rive.runtime.kotlin.controllers.RiveFileController.RiveEventListener
    public final void notifyEvent(RiveEvent event) {
        HashMap map;
        Intrinsics.checkNotNullParameter(event, "event");
        String name = event.getName();
        boolean z5 = event instanceof RiveOpenURLEvent;
        RiveEventType riveEventType = z5 ? RiveEventType.OPENURL : RiveEventType.GENERAL;
        Double dValueOf = Double.valueOf(event.getDelay());
        HashMap<String, Object> properties = event.getProperties();
        this.f8465a.getClass();
        if (properties == null) {
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    String value2 = (String) value;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    map2.put(key, new EventPropertiesOutput.Second(value2));
                } else if (value instanceof Number) {
                    map2.put(key, new EventPropertiesOutput.Third(((Number) value).doubleValue()));
                } else if (value instanceof Boolean) {
                    map2.put(key, new EventPropertiesOutput.First(((Boolean) value).booleanValue()));
                }
            }
            map = map2;
        }
        RiveOpenURLEvent riveOpenURLEvent = z5 ? (RiveOpenURLEvent) event : null;
        String url = riveOpenURLEvent != null ? riveOpenURLEvent.getUrl() : null;
        RiveOpenURLEvent riveOpenURLEvent2 = z5 ? (RiveOpenURLEvent) event : null;
        this.f8466b.invoke(new UnifiedRiveEvent(name, riveEventType, dValueOf, map, url, riveOpenURLEvent2 != null ? riveOpenURLEvent2.getTarget() : null));
    }
}

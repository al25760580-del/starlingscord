package ik;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.henninghall.date_picker.pickers.AndroidNative;
import e4.m;
import e4.p;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AndroidNative f11826e;

    public /* synthetic */ a(AndroidNative androidNative, int i7) {
        this.f11825d = i7;
        this.f11826e = androidNative;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11825d) {
            case 0:
                AndroidNative androidNative = this.f11826e;
                androidNative.J0 = false;
                ((i) androidNative.G0).o();
                break;
            default:
                AndroidNative androidNative2 = this.f11826e;
                androidNative2.L0 = false;
                hp.e eVar = (hp.e) ((fj.c) ((i) androidNative2.G0).f21117d).f9267e;
                m mVar = (m) eVar.f10990v;
                p pVar = (p) eVar.f10989i;
                kk.c cVar = (kk.c) eVar.f10988e;
                if (!cVar.e()) {
                    SimpleDateFormat simpleDateFormatH = eVar.h();
                    String strB = cVar.b(0);
                    Calendar calendar = null;
                    try {
                        simpleDateFormatH.setLenient(false);
                        simpleDateFormatH.parse(strB);
                        SimpleDateFormat simpleDateFormatH2 = eVar.h();
                        String strB2 = cVar.b(0);
                        Calendar calendar2 = Calendar.getInstance(pVar.l());
                        try {
                            simpleDateFormatH2.setLenient(true);
                            calendar2.setTime(simpleDateFormatH2.parse(strB2));
                            calendar = calendar2;
                        } catch (ParseException e10) {
                            e10.printStackTrace();
                        }
                        if (calendar != null) {
                            Calendar calendarA = pVar.a((jk.a) pVar.f8025g);
                            if (calendarA == null || !calendar.before(calendarA)) {
                                Calendar calendarA2 = pVar.a((jk.a) pVar.f8026h);
                                if (calendarA2 == null || !calendar.after(calendarA2)) {
                                    kk.c cVar2 = (kk.c) mVar.f7994i;
                                    StringBuilder sb2 = new StringBuilder();
                                    for (mk.e eVar2 : cVar2.c()) {
                                        sb2.append(eVar2.g((String) eVar2.f15870c.get(eVar2.f15871d.getValue())));
                                    }
                                    String string = sb2.toString();
                                    ((p) mVar.f7993e).f8019a = calendar;
                                    String str = (String) ((jk.a) pVar.k).f13919a;
                                    WritableMap writableMapCreateMap = Arguments.createMap();
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                                    writableMapCreateMap.putString("date", simpleDateFormat.format(calendar.getTime()));
                                    writableMapCreateMap.putString("dateString", string);
                                    writableMapCreateMap.putString(StackTraceHelper.ID_KEY, str);
                                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.mkuczera.haptic.d.f7010b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("dateChange", writableMapCreateMap);
                                } else {
                                    mVar.r(calendarA2);
                                }
                            } else {
                                mVar.r(calendarA);
                            }
                        }
                    } catch (ParseException unused) {
                        SimpleDateFormat simpleDateFormatH3 = eVar.h();
                        simpleDateFormatH3.setLenient(false);
                        for (int i7 = 0; i7 < 10; i7++) {
                            try {
                                String strB3 = cVar.b(i7);
                                Calendar calendar3 = Calendar.getInstance(pVar.l());
                                calendar3.setTime(simpleDateFormatH3.parse(strB3));
                                calendar = calendar3;
                                if (calendar != null) {
                                    mVar.r(calendar);
                                }
                            } catch (ParseException unused2) {
                            }
                        }
                        if (calendar != null) {
                            mVar.r(calendar);
                        }
                    }
                }
                ((i) androidNative2.G0).o();
                break;
        }
    }
}

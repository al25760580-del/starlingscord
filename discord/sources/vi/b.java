package vi;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f21674e;

    public /* synthetic */ b(c cVar, int i7) {
        this.f21673d = i7;
        this.f21674e = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f21673d) {
            case 0:
                c cVar = this.f21674e;
                synchronized (cVar) {
                    try {
                        g gVar = (g) cVar.f21675a.get();
                        ArrayList arrayListC = gVar.c();
                        gVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i7 = 0; i7 < arrayListC.size(); i7++) {
                            a aVar = (a) arrayListC.get(i7);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f21671a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f21672b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
            default:
                c cVar2 = this.f21674e;
                synchronized (cVar2) {
                    ((g) cVar2.f21675a.get()).h(System.currentTimeMillis(), ((fj.b) cVar2.f21677c.get()).a());
                    break;
                }
                return null;
        }
    }
}

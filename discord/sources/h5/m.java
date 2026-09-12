package h5;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.google.zxing.Result;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10356e;

    public /* synthetic */ m(int i7, Object obj) {
        this.f10355d = i7;
        this.f10356e = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        l lVar;
        k kVar;
        ByteBuffer byteBuffer;
        boolean z5;
        switch (this.f10355d) {
            case 0:
                Process.setThreadPriority(10);
                while (true) {
                    n.a((n) this.f10356e, 2);
                    while (true) {
                        try {
                            synchronized (((n) this.f10356e).f10361e) {
                                try {
                                    lVar = ((n) this.f10356e).f10363g;
                                    if (lVar != null) {
                                        ((n) this.f10356e).f10363g = null;
                                    } else {
                                        try {
                                            ((n) this.f10356e).f10361e.wait();
                                        } catch (InterruptedException unused) {
                                            n.a((n) this.f10356e, 5);
                                            return;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            n.a((n) this.f10356e, 3);
                            Result resultA = lVar.a(((n) this.f10356e).f10357a);
                            if (resultA != null) {
                                ((n) this.f10356e).f10363g = null;
                                if (n.a((n) this.f10356e, 4) && (kVar = ((n) this.f10356e).f10362f) != null) {
                                    kVar.onDecoded(resultA);
                                }
                            }
                        } catch (ij.k unused2) {
                        }
                    }
                }
                break;
            case 1:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                    break;
                } while (((vd.e) this.f10356e).g());
                return;
            case 2:
                HashMap map = (HashMap) this.f10356e;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(string);
                            Log.w("HttpUrlPinger", sb2.toString());
                            break;
                        }
                        return;
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e11) {
                    e = e11;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message);
                    Log.w("HttpUrlPinger", sb3.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e12) {
                    String message2 = e12.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e12);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    String message3 = e.getMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb5.append("Error while pinging URL: ");
                    sb5.append(string);
                    sb5.append(". ");
                    sb5.append(message3);
                    Log.w("HttpUrlPinger", sb5.toString(), e);
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 3:
                ((Function0) this.f10356e).invoke();
                return;
            default:
                vk.b bVar = (vk.b) this.f10356e;
                while (!bVar.f21711l.get()) {
                    qk.a aVar = (qk.a) bVar.f21712m.peekFirst();
                    if (aVar != null) {
                        int iDequeueInputBuffer = bVar.f21702a.f18918b.dequeueInputBuffer(0L);
                        if (iDequeueInputBuffer >= 0) {
                            qk.b bVar2 = bVar.f21702a;
                            qk.a aVar2 = null;
                            if (iDequeueInputBuffer >= 0) {
                                aVar2 = new qk.a(iDequeueInputBuffer, bVar2.f18918b.getInputBuffer(iDequeueInputBuffer), null);
                            } else {
                                bVar2.getClass();
                            }
                            if (aVar2 != null) {
                                ByteBuffer byteBuffer2 = aVar2.f18915b;
                                MediaCodec.BufferInfo bufferInfo = aVar2.f18916c;
                                if (byteBuffer2 != null && (byteBuffer = aVar.f18915b) != null) {
                                    bufferInfo.offset = 0;
                                    MediaCodec.BufferInfo bufferInfo2 = aVar.f18916c;
                                    bufferInfo.flags = bufferInfo2.flags;
                                    bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs + ((long) (((double) (byteBuffer.position() / (bVar.f21706e * 2))) * bVar.f21704c));
                                    if (byteBuffer2.limit() >= byteBuffer.remaining()) {
                                        bufferInfo.size = byteBuffer.remaining();
                                        z5 = true;
                                    } else {
                                        bufferInfo.size = byteBuffer2.limit();
                                        bufferInfo.flags &= -5;
                                        z5 = false;
                                    }
                                    int i7 = bufferInfo.size;
                                    for (int i10 = 0; i10 < i7; i10++) {
                                        byteBuffer2.put(byteBuffer.get());
                                    }
                                    if (z5) {
                                        bVar.f21712m.removeFirst();
                                        po.d dVar = bVar.f21710i;
                                        Intrinsics.checkNotNullExpressionValue(byteBuffer, "inputFrame.buffer");
                                        dVar.getClass();
                                        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                                        byteBuffer.clear();
                                        ((LinkedBlockingQueue) dVar.f18079e).put(byteBuffer);
                                    }
                                    bVar.f21702a.f18918b.queueInputBuffer(aVar2.f18914a, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                                }
                            }
                        } else if (iDequeueInputBuffer != -1) {
                            Log.e("AudioRenderer", "Unhandled value " + iDequeueInputBuffer + " when receiving decoded input frame");
                        }
                    }
                }
                bVar.f21712m.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vd.e eVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10355d = 1;
        this.f10356e = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super("cs-decoder");
        this.f10355d = 0;
        this.f10356e = nVar;
    }
}

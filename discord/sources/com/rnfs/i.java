package com.rnfs;

import android.os.AsyncTask;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RNFSManager f7094a;

    public i(RNFSManager rNFSManager) {
        this.f7094a = rNFSManager;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        RNFSManager rNFSManager = this.f7094a;
        try {
            String str = strArr[0];
            String str2 = strArr[1];
            InputStream inputStream = rNFSManager.getInputStream(str);
            OutputStream outputStream = rNFSManager.getOutputStream(str2, false);
            byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 <= 0) {
                    inputStream.close();
                    outputStream.close();
                    return null;
                }
                outputStream.write(bArr, 0, i7);
                Thread.yield();
            }
        } catch (Exception e10) {
            return e10;
        }
    }
}

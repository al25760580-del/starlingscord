package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
public class CppSystemErrorException extends CppException {
    int errorCode;

    @DoNotStrip
    public CppSystemErrorException(String str, int i7) {
        super(str);
        this.errorCode = i7;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}

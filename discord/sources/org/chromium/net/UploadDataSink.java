package org.chromium.net;

/* JADX INFO: loaded from: classes.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z5);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}

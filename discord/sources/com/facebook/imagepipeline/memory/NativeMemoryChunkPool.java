package com.facebook.imagepipeline.memory;

import n8.c;
import pa.p;
import pa.v;
import pa.w;
import q8.b;

/* JADX INFO: loaded from: classes3.dex */
@c
public class NativeMemoryChunkPool extends p {
    @c
    public NativeMemoryChunkPool(b bVar, v vVar, w wVar) {
        super(bVar, vVar, wVar);
    }

    @Override // pa.b
    public final Object a(int i7) {
        return new NativeMemoryChunk(i7);
    }
}

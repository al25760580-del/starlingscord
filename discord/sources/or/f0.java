package or;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public interface f0 extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}

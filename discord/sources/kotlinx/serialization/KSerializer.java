package kotlinx.serialization;

import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public interface KSerializer extends DeserializationStrategy {
    void serialize(Encoder encoder, Object obj);
}

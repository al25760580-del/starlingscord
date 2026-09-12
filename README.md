# Decompilación del cliente Android de Discord (APK con mod LSPatch)

> Rama de **estudio e interoperabilidad**. No contiene código del proyecto Stoat;
> es material de referencia para entender cómo funciona el cliente oficial.

## Origen

APK parcheado con **LSPatch** (inyección Xposed sin root) proporcionado por el
usuario, empaquetado como splits (`base.apk` + `split_config.*.apk`):

- `assets/lspatch/origin.apk` — el APK de Discord **original sin modificar** (106 MB)
- `assets/lspatch/modules/ShiggyXposed.xposed.apk` — el mod Xposed (loader de
  plugins JS, temas, etc.)
- `assets/lspatch/loader.dex` + `liblspatch.so` — el loader de LSPatch
- `lspatch-config.json` — configuración del parcheo (ver raíz de esta rama)

## Contenido

| Directorio | Qué es | Archivos |
|---|---|---|
| `discord/sources/` | jadx (Java) del `origin.apk` — capa Java/Kotlin del cliente | 13.512 |
| `shiggy-mod/sources/` | jadx del mod ShiggyXposed | 4.380 |

Decompilado con **jadx 1.5.6** (`--no-res`, solo código; los recursos no aportan
al estudio). Errores de decompilado: 91 clases (Discord) y 190 (Shiggy) —
resto usable. Regenerar:

```bash
jadx --no-res -j 2 --output-dir discord origin.apk
jadx --no-res -j 2 --output-dir shiggy-mod ShiggyXposed.xposed.apk
```

## Arquitectura del cliente (hallazgo clave)

Ver **[ANALYSIS.md](ANALYSIS.md)**. Resumen: Discord Android es una app
**React Native** (bundle Hermes de 54 MB con la lógica UI/estado) + un **core
nativo Rust** (`libdiscord.so`, 13 MB, gateway/API) + módulos nativos
Java/Kotlin como puente. El protocolo del gateway **no está en el código Java**:
vive en binario Rust; la referencia de protocolo sigue siendo docs.discord.food.

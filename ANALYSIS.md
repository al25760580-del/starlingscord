# Análisis del cliente Android de Discord (decompilado)

Conclusiones de la decompilación (jadx 1.5.6) del `origin.apk` y del mod.

## 1. El APK está parcheado con LSPatch

`base.apk` NO es el Discord original: LSPatch reemplazó `classes.dex` por un
stub de 11 KB y embebió:

```
assets/lspatch/origin.apk               ← Discord original intacto (106 MB)
assets/lspatch/modules/ShiggyXposed.xposed.apk
assets/lspatch/loader.dex               ← loader LSPatch (API 93, core 1.11.0)
assets/lspatch/so/{arm64-v8a,...}/liblspatch.so
assets/lspatch/config.json              ← appComponentFactory: com.discord.TTIComponentFactory
```

El stub engancha el `appComponentFactory` para cargar el Xposed bridge antes
que la app original. `sigBypassLevel: 0` (sin bypass de firma, usa useManager=false).

## 2. Arquitectura del cliente: React Native + Rust + Java puente

Lo más importante para entender "cómo hacen un cliente":

| Capa | Dónde | Contenido |
|---|---|---|
| **UI + stores + modelos** | `assets/index.android.bundle` (54 MB, bytecode **Hermes**) | Toda la app React Native: pantallas, redux/mobx, modelos de API, commands |
| **Core de red** | `lib/arm64-v8a/libdiscord.so` (13 MB, **Rust**) | Gateway websocket, heartbeats, RESUME, cliente REST, caché de estado |
| **Módulos nativos** | Java/Kotlin (`com/discord/**` + paquetes ofuscados `a/`..`z/`) | Puente JSI: FastConnect, kv_storage, krisp (supresión de ruido), billing, analytics, cámara, etc. |

**El gateway NO está en Java**: no existe `GatewayConnection` ni
`heartbeat_interval` en el código decompilado — la conexión websocket vive en
`libdiscord.so` (el crate `discord_api`/`discord_gateway` compilado a Rust).
Java solo expone `com/discord/fast_connect/FastConnectModule.java` (arranque
rápido de la conexión) y el JSI glue. La lógica JS está en bytecode Hermes
(reversible con `hbctool`/`hermes-dec`, no con jadx).

## 3. Puntos de interés en `discord/sources/`

- `com/discord/fast_connect/` — arranque del gateway nativo
- `com/discord/utilities/` — utilería (fingerprinting, analytics consent, etc.)
- `com/discord/app/` — Activities y el pipeline de arranque RN
- Paquetes de una letra (`a/`…`z/`) — código propio ofuscado por R8
- `com/hammerandchisel/` — voice (livekit)
- Libs de terceros visibles: airbnb (lottie), react-native, appsflyer, facebook,
  appscheck, rive, margelo (flashlight), etc.

## 4. El mod: ShiggyXposed

Xposed module (`shiggy-mod/sources/ShiggyXposed/xposed/`) que hookea la app
cargada y:

- `PayloadGlobalModule` — inyecta el loader global `__PYON_LOADER__` en el
  runtime JS (ahí vive el "eval": ejecución de JS arbitrario en el contexto de
  la app RN)
- `HookScriptLoaderModule` — descarga y ejecuta scripts custom de plugins
- `PluginsModule` / `ModulesCache` / `AssetsCache` — gestión de plugins JS
  (formato tipo Vendetta/Bunny)
- `ThemesModule` — temas
- `PerfPatchesModule`, `FixResourcesModule` — parches varios

Es decir: el mod NO toca el protocolo; inyecta JS en el Hermes runtime del
cliente oficial y deja que el binario Rust haga toda la red.

## 5. Implicaciones para un cliente propio (Stoat)

1. **Validación**: que el gateway no esté en Java confirma que el protocolo
   (HELLO → IDENTIFY → heartbeats → RESUME) es independiente de la UI; nuestra
   implementación Kotlin (DiscordGateway.kt) es el enfoque correcto para un
   cliente nativo.
2. **Referencia de protocolo**: la fuente de verdad sigue siendo
   docs.discord.food; el binario Rust no es legible.
3. **Si se quiere profundizar**: descompilar `index.android.bundle` con
   hermes-dec daría los modelos y la lógica de stores del cliente oficial.

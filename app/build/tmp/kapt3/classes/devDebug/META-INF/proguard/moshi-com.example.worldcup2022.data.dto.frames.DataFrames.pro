-if class com.example.worldcup2022.data.dto.frames.DataFrames
-keepnames class com.example.worldcup2022.data.dto.frames.DataFrames
-if class com.example.worldcup2022.data.dto.frames.DataFrames
-keep class com.example.worldcup2022.data.dto.frames.DataFramesJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.worldcup2022.data.dto.frames.DataFrames
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.worldcup2022.data.dto.frames.DataFrames
-keepclassmembers class com.example.worldcup2022.data.dto.frames.DataFrames {
    public synthetic <init>(java.lang.String,java.util.List,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

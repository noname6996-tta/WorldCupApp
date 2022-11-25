-if class com.example.worldcup2022.data.dto.frames.Frames
-keepnames class com.example.worldcup2022.data.dto.frames.Frames
-if class com.example.worldcup2022.data.dto.frames.Frames
-keep class com.example.worldcup2022.data.dto.frames.FramesJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.worldcup2022.data.dto.frames.Frames
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.worldcup2022.data.dto.frames.Frames
-keepclassmembers class com.example.worldcup2022.data.dto.frames.Frames {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,boolean,java.lang.String,java.util.List,int,kotlin.jvm.internal.DefaultConstructorMarker);
}

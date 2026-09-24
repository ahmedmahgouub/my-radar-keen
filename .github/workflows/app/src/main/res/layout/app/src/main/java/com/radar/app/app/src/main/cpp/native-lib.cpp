#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_radar_app_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Radar Core Active";
    return env->NewStringUTF(hello.c_str());
}

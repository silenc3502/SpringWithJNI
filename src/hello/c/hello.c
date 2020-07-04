#include <jni.h>
#include <stdio.h>

// proj.nativeinterface.test
JNIEXPORT jstring JNICALL
Java_proj_nativeinterface_test_HelloSpring_print(JNIEnv *env, jobject obj)
{
    char msg[60] = "Hello ";
    jstring result;

    result = (*env)->NewStringUTF(env, msg); // C style string to Java String
    return result;
}
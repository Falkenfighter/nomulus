package(
    default_visibility = ["//visibility:public"],
)

licenses(["notice"])  # Apache 2.0

java_library(
    name = "loadtest",
    srcs = glob(["*.java"]),
    resources = glob(["templates/*.xml"]),
    deps = [
        "//java/google/registry/config",
        "//java/google/registry/request",
        "//java/google/registry/security",
        "//java/google/registry/util",
        "//third_party/java/objectify:objectify-v4_1",
        "@com_google_appengine_api_1_0_sdk",
        "@com_google_dagger",
        "@com_google_guava",
        "@javax_servlet_api",
        "@joda_time",
    ],
)

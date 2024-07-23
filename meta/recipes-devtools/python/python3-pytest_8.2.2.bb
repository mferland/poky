SUMMARY = "Simple powerful testing with python"
HOMEPAGE = "https://pypi.org/project/pytest/"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing for applications and libraries."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd27e41b6550fe0fc45356d1d81ee37c"

SRC_URI[sha256sum] = "de4bb8104e201939ccdc688b27a89a7be2079b22e2bd2b07f806b6ba71117977"

DEPENDS += "python3-setuptools-scm-native"

inherit update-alternatives pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    python3-xml \
    python3-debugger \
    python3-doctest \
    python3-iniconfig \
    python3-json \
    python3-packaging \
    python3-pluggy \
"

ALTERNATIVE:${PN} += "py.test pytest"

NATIVE_LINK_NAME[pytest] = "${bindir}/pytest"
ALTERNATIVE_TARGET[pytest] = "${bindir}/pytest"

ALTERNATIVE_LINK_NAME[py.test] = "${bindir}/py.test"
ALTERNATIVE_TARGET[py.test] = "${bindir}/py.test"

BBCLASSEXTEND = "native nativesdk"

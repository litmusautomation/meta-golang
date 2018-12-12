SUMMARY = "Go supplementary crypto support"
HOMEPAGE = "https://github.com/golang/crypto"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707"
SRC_URI = "git://github.com/golang/crypto;name=crypto \
           git://github.com/golang/net;name=net;destsuffix=${GO_SRCROOT}/vendor/golang.org/x/net \
           git://github.com/golang/text;name=text;destsuffix=${GO_SRCROOT}/vendor/golang.org/x/text"

require golang-x-srcrevs.inc

SRCREV_crypto = "${GOLANG_X_CRYPTO_SRCREV}"
SRCREV_net = "${GOLANG_X_NET_SRCREV}"
SRCREV_text = "${GOLANG_X_TEXT_SRCREV}"
SRCREV_FORMAT = "crypto+net+text"
PV="1.0+git${SRCPV}"

GO_SRCROOT = "golang.org/x/crypto"

inherit golang

PTEST_ENABLED = ""

BBCLASSEXTEND = "native nativesdk"

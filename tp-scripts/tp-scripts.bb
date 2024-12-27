SUMMARY = "TP Scripts"
SECTION = "custom"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI  = "file://Main"
SRC_URI += "file://gest_process"
SRC_URI += "file://gest_mod"
SRC_URI += "file://gest_acc"
SRC_URI += "file://sys_gest"
SRC_URI += "file://bonjour"

do_install() {
     install -d ${D}${sbindir}
     install -m 0755 ${WORKDIR}/sys_gest ${D}${sbindir}
     install -m 0755 ${WORKDIR}/gest_acc ${D}${sbindir}
     install -m 0755 ${WORKDIR}/gest_mod ${D}${sbindir}
     install -m 0755 ${WORKDIR}/gest_process ${D}${sbindir}
     install -m 0755 ${WORKDIR}/Main ${D}${sbindir}
     install -m 0755 ${WORKDIR}/bonjour ${D}${sbindir}
}

FILES:${PN} += "${sbindir}/sys_gest"
FILES:${PN} += "${sbindir}/gest_acc"
FILES:${PN} += "${sbindir}/gest_mod"
FILES:${PN} += "${sbindir}/gest_process"
FILES:${PN} += "${sbindir}/Main"
FILES:${PN} += "${sbindir}/bonjour"

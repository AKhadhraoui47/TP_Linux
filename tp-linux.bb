SUMMARY = "My image for learning purposes."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL:append = " nano linux-firmware-bcm43455"

IMAGE_INSTALL:append = " init-ifupdown i2c-tools wpa-supplicant resolvconf openssh packagegroup-base"

IMAGE_INSTALL:append = " tp-scripts vsftpd apt"

PACKAGE_CLASSES = "package_deb"
EXTRA_IMAGE_FEATURES += "package-management"

#################################
DISTRO_FEATURES += "wifi"
MACHINE_FEATURES += "wifi"
LICENSE = "MIT"
#################################

inherit core-image

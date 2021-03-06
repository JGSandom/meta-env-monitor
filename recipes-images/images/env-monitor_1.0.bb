SUMMARY = "A console development image for env-monitor project"

IMAGE_NAME = "env-monitor-${MACHINE}"

require images/basic-image.bb

BASE_PACKAGES = " \
    sudo \
    htop \
    networkmanager \
    dpkg \
    iptables \
    lsof \
    usbutils \
"

WIFI = " \
    bbbw-wireless \
    iw \
    linux-firmware-wl12xx \
    linux-firmware-wl18xx \
    wpa-supplicant \
"

IMAGE_INSTALL += " \
    ${WIFI} \
    ${BASE_PACKAGES} \
"

SUMMARY = "A console development image for env-monitor project"

IMAGE_NAME = "env-monitor-${MACHINE}"

require images/basic-dev-image.bb

WIFI = " \
    bbgw-wireless \
    crda \
    iw \
    linux-firmware-wl12xx \
    linux-firmware-wl18xx \
    wpa-supplicant \
"

IMAGE_INSTALL += " \
    ${WIFI} \
"

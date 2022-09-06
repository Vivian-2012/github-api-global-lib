def call(String platform='xcs') {
    environment {
        // NFS build cache mount details
        NFS_SERVER = "172.16.130.105"
        NFS_SHARE = "yocto-build-pool"
        MOUNT_DEVICE = "${env.NFS_SERVER}:/mnt/${env.NFS_SHARE}"
        MOUNT_DIR = "/mnt/sstate-mirror"
    }
    echo env.NFS_SERVER env.MOUNT_DIR
    
}
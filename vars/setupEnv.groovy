def call(String platform='xcs') {
    environment {
        NFS_SERVER = "xx.16.xx.xx"
    }
    echo "${env.NFS_SERVER}"
}

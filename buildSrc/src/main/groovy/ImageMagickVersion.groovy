class ImageMagickVersion {
    static Map<String, String> parseVersion(String magickVersion) {
        def versionParts = magickVersion.split('\\.')
        def verMajor = versionParts.size() > 0 ? versionParts[0] : 'unknown'
        def verMinor = versionParts.size() > 1 ? versionParts[1] : 'unknown'
        def verMicro = versionParts.size() > 2 ? versionParts[2] : 'unknown'

        return [major: verMajor, minor: verMinor, micro: verMicro]
    }
}

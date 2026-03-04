clean:
    find {{ justfile_directory() }} -type f -name '*~' -exec rm -f {} +

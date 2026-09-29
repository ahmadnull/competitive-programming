clean:
    find {{ justfile_directory() }} -type f -name '*~' -exec rm -f {} +

[group('util')]
util-run COMMAND:
    @echo "{{BOLD + CYAN}}Running...{{NORMAL}}" 
    @/usr/bin/time -f "%U %M" {{COMMAND}} 2> >(awk '{printf "{{BOLD + BLUE}}User Time: %.0f ms, Memory: %d kB\n{{NORMAL}}", $1 * 1000, $2}' >&2)

[group('util')]
[no-cd]
util-compile LANG FILE COMMAND:
    #!/usr/bin/env -S fish --no-config
    set sha256 (sha256sum {{FILE}} | cut -d ' ' -f 1)
    if [ "$sha256" = (cat /tmp/{{LANG}}-solution.sha 2>/dev/null || echo "") ]
        echo "{{BOLD + GREEN}}Up to date{{NORMAL}}"
        exit 0
    else
        echo "{{BOLD + CYAN}}Compiling...{{NORMAL}}"
        echo $sha256 > /tmp/{{LANG}}-solution.sha
        {{COMMAND}}
    end

[no-cd]
compile-run FILE:
    @just compile {{FILE}}
    @just run

alias cr := compile-run
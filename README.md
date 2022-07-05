# TeamCity Symbol Server plugin, fork from [here](https://github.com/JetBrains/teamcity-symbol-server)

This initial purpose of this repo is attempt to fix a timeout bug when processing debug symbol (DSOF-21217)
Or if anything updated with the plugin source code, please feel free to update this repo

## How to build

Please notice right now the project is broken when it tries to compile against the latest TeamCity library(2022.04)
Where the teamcity-symbol-server project would fail to compile its test case.

Build individual module by using gradle:jar

## Custom Release

Currently the plugin is made manually swapping out the jar from the original zip
and modify the version in teamcity-plugin.xml.
the build is resided in /release folder
